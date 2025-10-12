package ru.aston.hometask_2;

public interface FileWriterInterface {
    void createFile(String path);

    void createDirectory(String path);

    void writeToFile(String path, String data);
}
