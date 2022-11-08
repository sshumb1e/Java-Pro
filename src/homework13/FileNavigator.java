package homework13;

import java.io.*;
import java.util.*;

public class FileNavigator {

    private List<String> words = new ArrayList<>();
    private File path = new File("src/homework13/books");

    public int countUniqueWords() {
        Map<String,Integer> uniqueWord = new HashMap<>();
        for (String word:words){
            word = word.toUpperCase();
            if(!uniqueWord.containsKey(word) && word.length() > 2){
                uniqueWord.put(word,1);
            } else {
                uniqueWord.remove(word);
            }
        }
        return uniqueWord.size();
    }

    public List findTenPopularWords() {
        Map<String, Integer> uniqWords = new HashMap<>();
        for (String word : words) {
            word = word.toUpperCase();
            if (word.length() > 2)
                uniqWords.put(word, uniqWords.getOrDefault(word, 0) + 1);
        }
        return sortHashMap(uniqWords);
    }

    public List sortHashMap(Map<String, Integer> unsortedMap) {
        List<Map.Entry<String, Integer>> sortedList = new LinkedList<>(unsortedMap.entrySet());
        Collections.sort(sortedList, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        return sortedList.subList(0, 10);
    }

    public String findFile(final File folder, String fileName) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.getName().toUpperCase().split("\\.", 2)[0].equals(fileName.toUpperCase())) {
                return fileEntry.getAbsolutePath();
            }
        }
        return "File from name ".concat(fileName).concat(" not found!!!!");
    }

    public void readBook(String name) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(findFile(path, name)))) {
            while (br.ready()) {
                Scanner sc = new Scanner(br.readLine().replaceAll("[^a-zA-Z]", " "));
                while (sc.hasNext()) {
                    words.add(sc.next());
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void writeReport(String name) {
        if (!name.isEmpty()) {
            try (FileWriter statistic = new FileWriter(path + "/" + name + ("_statistic.txt"))) {
                statistic.write("This is ten most common uniq words in this book:\n\n");
                findTenPopularWords().forEach(s -> {
                    try {
                        statistic.append(String.valueOf(s).concat("\n"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                statistic.append("\nBook \"".concat(name).concat("\" contains = ")
                        .concat(String.valueOf(countUniqueWords())).concat(" uniq words"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
