package ru.aston.hometask_2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter command or \"Help\" for list of commands. Or \"stop\" to exit");
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                switch (input) {
                    case "Is file exist":
                        commands.examplePath();
                        System.out.print("Enter path: ");
                        commands.isFileExist(scanner.nextLine());
                        break;
                    case "Is directory exist":
                        commands.examplePath();
                        System.out.print("Enter path: ");
                        commands.isDirectoryExist(scanner.nextLine());
                        break;
                    case "Create file":
                        commands.examplePath();
                        System.out.print("Enter path: ");
                        String directory = scanner.nextLine();
                        commands.exampleName();
                        System.out.print("Enter file name: ");
                        commands.createFile(directory, scanner.nextLine());
                        break;
                    case "Create directory":
                        commands.examplePath();
                        System.out.println("Enter path: ");
                        commands.createDirectory(scanner.nextLine());
                        break;
                    case "Write":
                        commands.examplePathToFile();
                        System.out.println("Enter path to file");
                        String path = scanner.nextLine();
                        System.out.println("Enter data");
                        commands.writeToFile(path, scanner.nextLine());
                        break;
                    case "Read":
                        commands.examplePathToFile();
                        System.out.println("Enter path to file");
                        commands.readFromFile(scanner.nextLine());
                        break;
                    case "Help":
                        commands.help();
                        break;
                    default:
                        System.out.println("Not a command");
                        ;
                }
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
