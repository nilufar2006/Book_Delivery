package com.company.LessonList;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    String name;
    int price;
    int count = 0;


    LinkedList<Book> list = new LinkedList<>();

    public Book(int count,String name, int price) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }

    public void list(LinkedList<Book> list) {
        System.out.println("==Book List==");

        for (Book book : list) {
            System.out.println(book.count + " "+ book.name + " " + book.price);
        }
        System.out.println();
    }


    public void add(LinkedList<Book> list) {
        System.out.println("==Add List==");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book name: ");
        name = scanner.nextLine();
        System.out.println("Book price: ");
        price = scanner.nextInt();

        list.add(new Book(count, name, price));
        count++;

        System.out.println("succes!!!");
    }

    public void search(LinkedList<Book> list) {
        boolean isHave = false;

        System.out.println("==Search==");
        System.out.println("Book name write: ");
        String name = scanner.nextLine();
        for (Book book : list) {
            if (Objects.equals(book.name, name)) {
                isHave = true;
                break;
            }
        }
        if (isHave) {
            System.out.println("book have");
            System.out.println();
        } else {
            System.out.println("book no");
            System.out.println();
        }
    }

    public void remove() {
        System.out.println("Remove");
        System.out.println("[1]->clear");
        System.out.println("[2]->remove");
        System.out.print("= ");
        int remove = scanner.nextInt();
        if (remove == 1) {
            list.clear();


        } else if (remove == 2) {
            System.out.print("book id write: ");
            int id = scanner.nextInt();


                list.remove(id);


        }else {

        }


    }


}



