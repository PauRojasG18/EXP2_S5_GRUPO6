/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.main;

import com.duoc.biblioteca.collections.Library;
import com.duoc.biblioteca.exceptions.DuplicateEntryException;
import com.duoc.biblioteca.exceptions.NotFoundException;
import com.duoc.biblioteca.model.Book;
import com.duoc.biblioteca.model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n==============================");
            System.out.println("📚 DUOC LIBRARY SYSTEM");
            System.out.println("==============================");
            System.out.println("📖 1 - Add Book");
            System.out.println("📚 2 - Show All Books");
            System.out.println("🗑️ 3 - Remove Book");
            System.out.println("👤 4 - Add User");
            System.out.println("👥 5 - Show All Users");
            System.out.println("❌ 6 - Remove User");
            System.out.println("🚪 0 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea

            switch (option) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(isbn, title, author);
                    try {
                        library.addBook(book);
                    } catch (DuplicateEntryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    library.showAllBooks();
                    break;
                case 3:
                    System.out.print("Enter ISBN to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    try {
                        library.removeBook(isbnToRemove);
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    User user = new User(id, name, email);
                    try {
                        library.addUser(user);
                    } catch (DuplicateEntryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    library.showAllUsers();
                    break;
                case 6:
                    System.out.print("Enter ID to remove: ");
                    String idToRemove = scanner.nextLine();
                    try {
                        library.removeUser(idToRemove);
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("👋 Goodbye!");
                    break;
                default:
                    System.out.println("⚠️ Invalid option. Try again.");
            }

        } while (option != 0);
    }
}
