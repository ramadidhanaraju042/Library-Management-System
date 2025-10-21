package com.librarymanagement.project;

import java.util.Scanner;

public class LibraryManagement {
    final int MAX_BOOKS = 100;
    String[] titles = new String[MAX_BOOKS];
    String[] authors = new String[MAX_BOOKS];
    int[] copies = new int[MAX_BOOKS];
    String[] subjects = new String[MAX_BOOKS];
    int bookCount = 0;

    String[] borrowedTitles = new String[MAX_BOOKS];
    String[] borrowedUsers = new String[MAX_BOOKS];
    int borrowCount = 0;

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook(sc);
                    break;
                case 4:
                    borrowBook(sc);
                    break;
                case 5:
                    returnBook(sc);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void addBook(Scanner sc) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Library is full.");
            return;
        }

        System.out.print("Enter book type (1 for Fiction, 2 for Non-Fiction): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter book title: ");
        titles[bookCount] = sc.nextLine();

        System.out.print("Enter author: ");
        authors[bookCount] = sc.nextLine();

        System.out.print("Enter number of copies: ");
        copies[bookCount] = sc.nextInt();
        sc.nextLine();

        if (type == 2) {
            System.out.print("Enter subject: ");
            subjects[bookCount] = sc.nextLine();
        } else {
            subjects[bookCount] = "Fiction";
        }

        bookCount++;
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + titles[i] + ", Author: " + authors[i] + ", Copies: " + copies[i]);
            System.out.println("Subject: " + subjects[i]);
        }
    }

    public void searchBook(Scanner sc) {
        System.out.print("Enter book title to search: ");
        String searchTitle = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(searchTitle)) {
                System.out.println("Title: " + titles[i] + ", Author: " + authors[i] + ", Copies: " + copies[i]);
                System.out.println("Subject: " + subjects[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void borrowBook(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter book title to borrow: ");
        String bookTitle = sc.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(bookTitle) && copies[i] > 0) {
                copies[i]--;
                borrowedUsers[borrowCount] = name.toLowerCase();
                borrowedTitles[borrowCount] = bookTitle.toLowerCase();
                borrowCount++;
                System.out.println(name + " borrowed " + bookTitle);
                return;
            }
        }

        System.out.println("Book not available.");
    }

    public void returnBook(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase();

        System.out.print("Enter book title to return: ");
        String bookTitle = sc.nextLine().toLowerCase();

        for (int i = 0; i < borrowCount; i++) {
            if (borrowedUsers[i].equals(name) && borrowedTitles[i].equals(bookTitle)) {
                // Shift borrowed records
                for (int j = i; j < borrowCount - 1; j++) {
                    borrowedUsers[j] = borrowedUsers[j + 1];
                    borrowedTitles[j] = borrowedTitles[j + 1];
                }
                borrowCount--;

                // Increase book copy count
                for (int k = 0; k < bookCount; k++) {
                    if (titles[k].equalsIgnoreCase(bookTitle)) {
                        copies[k]++;
                        break;
                    }
                }

                System.out.println(capitalize(name) + " returned " + bookTitle);
                return;
            }
        }

        System.out.println("Book not found in borrowed list.");
    }

    public String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // Entry point
    public static void main(String[] args) {
        LibraryManagement lib = new LibraryManagement();
        lib.run();
    }
}
