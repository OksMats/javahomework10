package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordFrequency = countWordFrequency("words.txt");
        printWordFrequency(wordFrequency);
    }

    private static Map<String, Integer> countWordFrequency(String fileName) throws IOException {
        Map<String, Integer> wordFrequency = new HashMap();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.trim();
                if (!word.isEmpty()) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        }
        return wordFrequency;
    }

    public static void printWordFrequency(Map<String, Integer> wordFrequency) {
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
