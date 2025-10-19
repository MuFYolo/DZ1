package ru.aston.hometask_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader implements FileReaderInterface {
    @Override
    public void readFromFile(String path) {
        try {
            List<String> reader = Files.readAllLines(Path.of(path));

            for (String text : reader) {
                System.out.println(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
