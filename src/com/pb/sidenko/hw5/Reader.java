package com.pb.sidenko.hw5;

public class Reader {
    String fio;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phone;

    public Reader(String fio, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getReader() {
        return "ФИО " + fio + " библиотечный номер: " + libraryCardNumber + " Факультет: " + faculty + " Дата рождения: " + dateOfBirth + " Телефон:" + phone;

    }

    public void takeBook(int countBook) {
        System.out.println(fio + " взял " + countBook + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fio + " взял книги: ");
        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getBook());
        }
    }

    public void returnBook(int count) {
        System.out.println(fio + " Вернул " + count + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.println(fio + "вернул книги ");
        for (String book : bookNames) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(fio + "вернул книги : ");
        for (Book book : books) {
            System.out.println(book.getBook());
        }
    }
}
