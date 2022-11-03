package lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {

    private final Map<String, ArrayList<FileData>> filesSavedList = new HashMap<>();

    public void add(String filePath, FileData file) {

        if (!file.getFilePath().equals(filePath)) {
            System.out.println("Wrong filePath of file, be careful and put the correct file path!");
            return;
        }

        if (!filesSavedList.containsKey(filePath)) filesSavedList.put(filePath, new ArrayList<>());
        filesSavedList.get(filePath).add(file);
    }

    public ArrayList<FileData> find(String filePath) {
        return filesSavedList.get(filePath);
    }

    public ArrayList<FileData> filterBySize(int maxSizeBytes) {

        ArrayList<FileData> filesSortedBySize = sortBySize();
        ArrayList<FileData> filesSameSize = new ArrayList<>();
        for (int i = 0; i < filesSortedBySize.size() && filesSortedBySize.get(i).getSizeBytes() <= maxSizeBytes; i++) {
            filesSameSize.add(filesSortedBySize.get(i));
        }

        return filesSameSize;
    }

    private ArrayList<FileData> sortBySize() {

        ArrayList<FileData> filesSortedBySize = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : filesSavedList.entrySet()) {
            filesSortedBySize.addAll(entry.getValue());
        }
        filesSortedBySize.sort(Comparator.comparingInt(FileData::getSizeBytes));

        return filesSortedBySize;
    }

    public void remove(String filePath) {
        filesSavedList.remove(filePath);
    }
}
