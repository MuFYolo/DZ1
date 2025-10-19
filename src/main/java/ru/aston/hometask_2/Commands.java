package ru.aston.hometask_2;

public enum Commands {
    IF_EXISTS("Exist"),
    IF_NOT_EXIST("Not exist");

    private String value;

    Commands(String value) {
        this.value = value;
    }

    public static boolean isFileExist(String path) {
        IsExist isExist = new IsExist();
        if (isExist.fileExist(path)) {
            System.out.println(IF_EXISTS.value);
            return true;
        } else {
            System.out.println(IF_NOT_EXIST.value);
            return false;
        }
    }

    public static boolean isDirectoryExist(String path) {
        IsExist isExist = new IsExist();
        if (isExist.directoryExist(path)) {
            System.out.println(IF_EXISTS.value);
            return true;
        } else {
            System.out.println(IF_NOT_EXIST.value);
            return false;
        }
    }

    public static String createFile(String path, String name) {
        IsExist isExist = new IsExist();
        if (isExist.fileExist(path + "/" + name)) {
            System.out.println(IF_EXISTS.value);
            return IF_EXISTS.value;
        } else {
            FileWriter fileWriter = new FileWriter();
            fileWriter.createFile(path + "/" + name);
            System.out.println("File Created");
            return IF_NOT_EXIST.value;
        }
    }

    public static void createDirectory(String path) {
        IsExist isExist = new IsExist();
        if (isExist.fileExist(path)) {
            System.out.println(IF_EXISTS.value);
        } else {
            FileWriter fileWriter = new FileWriter();
            fileWriter.createDirectory(path);
            System.out.println("Directory Created");
        }
    }

    public static void writeToFile(String path, String data) {
        IsExist isExist = new IsExist();
        if (isExist.fileExist(path)) {
            FileWriter fileWriter = new FileWriter();
            fileWriter.writeToFile(path, data);
            System.out.println("Date written");
        } else {
            System.out.println(IF_NOT_EXIST.value);
        }
    }

    public static void readFromFile(String path) {
        IsExist isExist = new IsExist();
        if (isExist.fileExist(path)) {
            FileReader fileReader = new FileReader();
            fileReader.readFromFile(path);
        } else {
            Commands.isFileExist(path);
        }
    }

    public static void help() {
        System.out.println("\"Is file exist\" to check for existed file");
        System.out.println("\"Is directory exist\" to check for existed directory");
        System.out.println("\"Create file\" to create new file");
        System.out.println("\"Create directory\" to create new directory");
        System.out.println("\"Write\" to write data in file");
        System.out.println("\"Read\" to read data in file");
    }

    public static void examplePath() {
        System.out.println("the path should look like this \"folder\"");
    }

    public static void examplePathToFile() {
        System.out.println("the path should look like this \"folder/name.txt\"");
    }

    public static void exampleName() {
        System.out.println("the name should look like this \"name.txt\"");
    }
}
