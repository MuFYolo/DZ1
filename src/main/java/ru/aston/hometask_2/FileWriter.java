package ru.aston.hometask_2;

import java.nio.file.*;

public class FileWriter implements FileWriterInterface {
    @Override
    public void createFile(String path) {
        try {
            Path pathToFile = Files.createFile(Path.of(path));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createDirectory(String path) {
        try {
            Path pathToDirectory = Files.createDirectory(Path.of(path));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String path, String data) {
        try {
            Files.writeString(Path.of(path), data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
