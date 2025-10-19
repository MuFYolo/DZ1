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
                        Commands.examplePath();
                        System.out.print("Enter path: ");
                        Commands.isFileExist(scanner.nextLine());
                        break;
                    case "Is directory exist":
                        Commands.examplePath();
                        System.out.print("Enter path: ");
                        Commands.isDirectoryExist(scanner.nextLine());
                        break;
                    case "Create file":
                        Commands.examplePath();
                        System.out.print("Enter path: ");
                        String directory = scanner.nextLine();
                        Commands.exampleName();
                        System.out.print("Enter file name: ");
                        Commands.createFile(directory, scanner.nextLine());
                        break;
                    case "Create directory":
                        Commands.examplePath();
                        System.out.println("Enter path: ");
                        Commands.createDirectory(scanner.nextLine());
                        break;
                    case "Write":
                        Commands.examplePathToFile();
                        System.out.println("Enter path to file");
                        String path = scanner.nextLine();
                        System.out.println("Enter data");
                        Commands.writeToFile(path, scanner.nextLine());
                        break;
                    case "Read":
                        Commands.examplePathToFile();
                        System.out.println("Enter path to file");
                        Commands.readFromFile(scanner.nextLine());
                        break;
                    case "Help":
                        Commands.help();
                        break;
                    default:
                        System.out.println("Not a command");
                }
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
