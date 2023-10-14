package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

    public static void main(String[] args) throws IOException {
        validatePhoneNumbers("file.txt");
    }

    public static void validatePhoneNumbers(String fileName) throws IOException {
       BufferedReader reader = new BufferedReader(new FileReader(fileName));
       String line;
        Pattern pattern = Pattern.compile("\\((\\d{3})\\) (\\d{3}-\\d{4})|(\\d{3}-\\d{3}-\\d{4})");
        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                System.out.println(line);
            }
        }
    }
}

