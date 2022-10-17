package lesson9.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Data<String> stringData = new Data<>();
        Data<Integer> integerData = new Data<>();

        String[] sentence = "cat dog cat lion rabbit lion rabbit dog cat crocodile eagle".split(" ");
        List<String> dataWords = new ArrayList<>(Arrays.asList(sentence));
        System.out.println(stringData.countOccurrence(dataWords, "cat" ));

        Integer[] arrNumbers = {3, 5, 7, 3, 9, 5, 1, 4, 1, };
        List<Integer> arrNumbersList = integerData.toList(arrNumbers);
        System.out.println(arrNumbersList);

        System.out.println(integerData.findUnique(arrNumbersList));

        System.out.println(stringData.calcOccurrence(dataWords));

        System.out.println(stringData.findOccurrence(dataWords));

    }
}
