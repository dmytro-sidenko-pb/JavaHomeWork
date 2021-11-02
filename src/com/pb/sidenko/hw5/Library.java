package com.pb.sidenko.hw5;

import com.pb.sidenko.hw3.Array;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("приключения", "Петров", 2015);
        Book book2 = new Book("сказки", "Иванов", 2016);
        Book book3 = new Book("рассказы", "Ежов", 2020);
        Reader reader1 = new Reader("Кузнецов В.В.", 123, "ИТС", "25.12.90", "+380630572095");
        Reader reader2 = new Reader("Рябцов В.В.", 124, "ИТФ", "15.12.91", "+380830572095");
        Reader reader3 = new Reader("Курочка А.И.", 128, "ИТХ", "11.09.81", "+380530572095");
        Book[] books = new Book[]{book1, book2, book3};
        Reader[] readers = new Reader[]{reader1, reader2, reader3};
        System.out.println("Список книг :");
        for (Book book : books) {
            System.out.println(book.getBook());
        }
        System.out.println("!------------------------------------!");
        System.out.println("Список читателей : ");
        for (Reader reader : readers) {
            System.out.println(reader.getReader());
        }
        System.out.println("----------------------------------");
        System.out.println("Метод takeBook(int countBook)");
        reader1.takeBook(1);
        reader2.takeBook(2);
        reader3.takeBook(3);
        System.out.println("----------------------------------");
        System.out.println("Метод takeBook(String... bookNames)");
        reader1.takeBook(book1.name);
        reader2.takeBook(book1.name, book2.name);
        reader3.takeBook(book1.name, book2.name, book3.name);
        System.out.println("----------------------------------");
        System.out.println("Метод takeBook(Book... books)");
        reader1.takeBook(book1);
        reader1.takeBook(book1, book2);
        reader1.takeBook(book1, book2, book3);
        System.out.println("----------------------------------");
        System.out.println("Метод returnBook(int countBook)");
        reader1.returnBook(1);
        reader2.returnBook(2);
        reader3.returnBook(3);
        System.out.println("----------------------------------");
        System.out.println("Метод returnBook(String... bookNames)");
        reader1.returnBook(book1.name);
        reader2.returnBook(book1.name, book2.name);
        reader3.returnBook(book1.name, book2.name, book3.name);
        System.out.println("----------------------------------");
        System.out.println("Метод returnBook(Book... books)");
        reader1.returnBook(book1);
        reader2.returnBook(book1, book2);
        reader3.returnBook(book1, book2, book3);
    }


}
