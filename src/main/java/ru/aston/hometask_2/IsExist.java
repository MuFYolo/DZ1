package ru.aston.hometask_2;

import java.nio.file.*;

public class IsExist implements IsExistInterface {
    @Override
    public boolean directoryExist(String path) {
        return Files.exists(Path.of(path));
    }

    @Override
    public boolean fileExist(String path) {
        return Files.exists(Path.of(path));
    }
}
