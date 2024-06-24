package SortingWordsUsingComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","mango","cherry","date","elderberry","fig","grape");

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return word2.compareTo(word1);
            }
        });
        System.out.println(words);
    }
}
