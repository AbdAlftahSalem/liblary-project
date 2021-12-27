package com.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookOperation bookOperation = new BookOperation();
        Scanner scanner = new Scanner(System.in);
        int operationNumber ;

        do {
            System.out.println("1- Add new books : ");
            System.out.println("2- Delete book : ");
            System.out.println("3- Display all date : ");
            System.out.println("4- Sorting books : ");
            System.out.println("5- Search book : ");
            System.out.println("6- Exit : ");

            System.out.print("Enter number of process : ");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    bookOperation.insertBook();
                    break;
                case 2:
                    bookOperation.getPositionBook();
                    break;
                case 3:
                    bookOperation.displayDate();
                    break;
                case 4:
                    bookOperation.sortData();
                    break;
                case 5:
                    bookOperation.searchBook();
                    break;
                case 6:
                    bookOperation.exit();
                    break;
            }
            System.out.println("\n\n *************************************** \n");
        } while (operationNumber != 6);

    }
}