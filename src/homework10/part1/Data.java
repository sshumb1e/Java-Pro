package homework10.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data <T>{


    public int countOccurrence(List<T> baseData, T word) {
        return Collections.frequency(baseData, word);
    }
    public List<T> toList(T[] baseArr) {
        List<T> baseDataList = new ArrayList<>();
        Collections.addAll(baseDataList, baseArr);
        return baseDataList;
    }

    public List<T> findUnique(List<T> baseData) {
        List<T> uniqueList = new ArrayList<>();
        for(T weight: baseData) {
            if(!uniqueList.contains(weight)) {
                uniqueList.add(weight);
            }
        }
        return uniqueList;
    }

    public List<T> calcOccurrence(List<T> baseData) {
        List<T> output = new ArrayList<>();
        for (T word: findUnique(baseData)) {
            if(!output.contains(word)) {
                output.add((T) (word + ":" + countOccurrence(baseData, word)));
            }
        }
        return output;
    }
    public List<T> findOccurrence(List<T> baseData) {
        List<T> list = new ArrayList<>();
        for (T word: findUnique(baseData)) {
            if(!list.contains(word)) {
                list.add((T) ("\n{name: " +  word + ", " + "occurrence: " + countOccurrence(baseData, word) + "}"));
            }
        }
        return list;
    }


}
