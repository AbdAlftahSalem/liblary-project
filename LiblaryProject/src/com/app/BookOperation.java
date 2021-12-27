package com.app;

import java.util.Scanner;

public class BookOperation {
    Scanner input = new Scanner(System.in);

    Book firstNode;
    Book lastNode;

    int length = 0;

    void insertBook() {
        System.out.println("\n\n ************************************************************");
        Book newBook = new Book();
        System.out.print("Enter name of Book : ");
        newBook.nameOfBook = input.next();
        System.out.print("Enter name of publisher dart of book : ");
        newBook.publisherDate = input.next();
        System.out.print("Enter name of author : ");
        newBook.authorBook = input.next();
        if (length == 0) {
            firstNode = lastNode = newBook;
            newBook.nextBook = null;
        } else {
            lastNode.nextBook = newBook;
            newBook.nextBook = null;
            lastNode = newBook;
        }
        ++length;
    }

    void getPositionBook() {
        displayDate();
        System.out.print("Enter the number of book to delete : ");
        int positionBook = input.nextInt();
        deleteItem(positionBook);
    }

    void deleteItem(int position) {
        System.out.println("\n\n ************************************************************");
        Book curr = firstNode.nextBook;
        Book prev = firstNode;

        for (int i = 0; i < position - 1; ++i) {
            curr = curr.nextBook;
            prev = curr;
        }
        prev.nextBook = curr.nextBook;
        curr.nextBook = null;
        --length;
    }

    void displayDate() {
        System.out.println("\n\n ************************************************************");
        Book curr = firstNode;
        int i = 1;
        while (curr != null) {
            System.out.println("Book " + i);
            System.out.println("Name of Book : " + curr.nameOfBook);
            System.out.println("Author of Book : " + curr.authorBook);
            System.out.println("publish date of Book : " + curr.publisherDate);
            curr = curr.nextBook;
            ++i;
        }
    }

    void sortData() { }

    void searchBook() {
        System.out.println("\n\n ************************************************************");
        String searchBook;
        System.out.print("Enter name of Book : ");
        searchBook = input.next();

        Book searchNode = firstNode;
        while (searchNode != null) {
            if (searchBook.equals(searchNode.nameOfBook)) {
                System.out.println(searchBook + " Founded , and this is details : ");
                System.out.println("Name of Book : " + searchNode.nameOfBook);
                System.out.println("Author of Book : " + searchNode.authorBook);
                System.out.println("publish date of Book : " + searchNode.publisherDate);
            }
            searchNode = searchNode.nextBook;
        }
    }


    void exit() {
        System.exit(0);
    }


}