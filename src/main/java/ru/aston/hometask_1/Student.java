package ru.aston.hometask_1;

public class Student {

    private String name;
    private String family;
    private MyArrayList books;

    public Student(String name, String family, MyArrayList books) {
        this.name = name;
        this.family = family;
        this.books = books;
    }

    public MyArrayList getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + family;
    }

}
