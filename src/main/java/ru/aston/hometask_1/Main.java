package ru.aston.hometask_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyBook book1 = new MyBook("Граф Монте-Кристо", "Александр Дюма", 2024, 300);
        MyBook book2 = new MyBook("Записки юного врача", "Михаил Булгаков", 2021, 250);
        MyBook book3 = new MyBook("Гордость и предубеждение", "Джейн Остин", 1999, 350);
        MyBook book4 = new MyBook("Три мушкетера", "Александр Дюма", 1625, 650);
        MyBook book5 = new MyBook("Раковый корпус", "Александр Солженицын", 2000, 301);
        MyBook book6 = new MyBook("Незнакомка", "Энн Бронте", 2005, 100);
        MyBook book7 = new MyBook("Нетерпение сердца", "Стефан Цвейг", 2001, 200);

        MyArrayList books1 = new MyArrayList();
        books1.addAll(book1, book2, book3, book4, book5, book6, book7);
        MyArrayList books2 = new MyArrayList();
        books2.addAll(book1, book4, book5, book6, book7);
        MyArrayList books3 = new MyArrayList();
        books3.addAll(book2, book3, book4, book5, book7);

        Student student1 = new Student("Михаил", "Булгаков", books1);
        Student student2 = new Student("Григорий", "Лепс", books2);
        Student student3 = new Student("Иван", "Иван", books3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.stream()
                .forEach(s -> System.out.println(s.toString()));
    }
}
