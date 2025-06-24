/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.collections;

import com.duoc.biblioteca.exceptions.DuplicateEntryException;
import com.duoc.biblioteca.exceptions.NotFoundException;
import com.duoc.biblioteca.model.Book;
import com.duoc.biblioteca.model.User;

import java.util.HashMap;

/**
 * Clase que representa la biblioteca con colecciones de libros y usuarios.
 */
public class Library {

    private HashMap<String, Book> books;
    private HashMap<String, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) throws DuplicateEntryException {
        if (books.containsKey(book.getIsbn())) {
            throw new DuplicateEntryException("Book with ISBN " + book.getIsbn() + " already exists.");
        }
        books.put(book.getIsbn(), book);
        System.out.println("✅ Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) throws NotFoundException {
        if (!books.containsKey(isbn)) {
            throw new NotFoundException("Book with ISBN " + isbn + " does not exist.");
        }
        books.remove(isbn);
        System.out.println("🗑️ Book removed: " + isbn);
    }

    public Book findBook(String isbn) throws NotFoundException {
        if (!books.containsKey(isbn)) {
            throw new NotFoundException("Book with ISBN " + isbn + " not found.");
        }
        return books.get(isbn);
    }

    public void addUser(User user) throws DuplicateEntryException {
        if (users.containsKey(user.getId())) {
            throw new DuplicateEntryException("User with ID " + user.getId() + " already exists.");
        }
        users.put(user.getId(), user);
        System.out.println("✅ User added: " + user.getName());
    }

    public void removeUser(String id) throws NotFoundException {
        if (!users.containsKey(id)) {
            throw new NotFoundException("User with ID " + id + " not found.");
        }
        users.remove(id);
        System.out.println("🗑️ User removed: " + id);
    }

    public User findUser(String id) throws NotFoundException {
        if (!users.containsKey(id)) {
            throw new NotFoundException("User with ID " + id + " not found.");
        }
        return users.get(id);
    }

    public void showAllBooks() {
        System.out.println("📚 Book list:");
        for (Book book : books.values()) {
            System.out.println("🔹 " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
        }
    }

    public void showAllUsers() {
        System.out.println("👥 User list:");
        for (User user : users.values()) {
            System.out.println("🔹 " + user.getName() + " (ID: " + user.getId() + ")");
        }
    }
}
