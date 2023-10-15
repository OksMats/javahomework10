package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileToJSONConverter {
    public static void main(String[] args) throws IOException {
        List<User> users = readUsersFromFile("file.txt");
        writeUsersToJsonFile(users, "user.json");
    }

    public static List<User> readUsersFromFile(String fileName) throws IOException {
        List<User> users = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while (((line = reader.readLine()) != null) ) {
            String[] values = line.split(" ");
            String name = values[0];
            int age = Integer.parseInt(values[1]);
            users.add(new User(name, age));
        }
        return users;

    }

    public static void writeUsersToJsonFile(List<User> users, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        Gson gson = new Gson();
        writer.write(gson.toJson(users));
    }
}
