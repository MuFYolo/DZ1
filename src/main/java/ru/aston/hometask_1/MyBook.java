package ru.aston.hometask_1;

public class MyBook {
    private String name;
    private String author;
    private int age;
    private int pages;

    public MyBook(String name, String author, int age, int pages) {
        this.name = name;
        this.author = author;
        this.age = age;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Название: " + name + " Автор: " + author + " Год: " + age + " Количество страниц: " +  pages;
    }
}
