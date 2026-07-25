package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    // Given a sentence, count how many times each word appears.
    public static Map<String, Integer> wordFrequencyCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}