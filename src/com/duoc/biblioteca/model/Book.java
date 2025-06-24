/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.model;

/**
 * Representa un libro en la biblioteca.
 * 
 * Esta clase encapsula la informacion basica de un libro, incluyendo su ISBN unico,
 * titulo, autor y estado de disponibilidad.
 * 
 * @author Sistema de Gestion de Biblioteca
 * @version 2.0
 * @since 2.0
 */
public class Book {

    /** Identificador unico del libro (ISBN) */
    private String isbn;

    /** Titulo del libro */
    private String title;

    /** Autor del libro */
    private String author;

    /** Estado de disponibilidad (true = disponible, false = prestado) */
    private boolean available;

    /**
     * Constructor que crea un libro con los datos especificados.
     * El libro se crea disponible por defecto.
     * 
     * @param isbn Identificador unico del libro (ISBN). No puede ser null ni vacio.
     * @param title Titulo del libro. No puede ser null ni vacio.
     * @param author Autor del libro. No puede ser null ni vacio.
     * @throws IllegalArgumentException si algun parametro es null o vacio.
     */
    public Book(String isbn, String title, String author) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN no puede ser null o vacio");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo no puede ser null o vacio");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor no puede ser null o vacio");
        }
        this.isbn = isbn.trim();
        this.title = title.trim();
        this.author = author.trim();
        this.available = true;
    }

    /**
     * Obtiene el ISBN del libro.
     * 
     * @return ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN del libro.
     * 
     * @param isbn Nuevo ISBN. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el ISBN es null o vacio.
     */
    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN no puede ser null o vacio");
        }
        this.isbn = isbn.trim();
    }

    /**
     * Obtiene el titulo del libro.
     * 
     * @return Titulo del libro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el titulo del libro.
     * 
     * @param title Nuevo titulo. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el titulo es null o vacio.
     */
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo no puede ser null o vacio");
        }
        this.title = title.trim();
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return Autor del libro.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param author Nuevo autor. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el autor es null o vacio.
     */
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor no puede ser null o vacio");
        }
        this.author = author.trim();
    }

    /**
     * Verifica si el libro esta disponible para prestamo.
     * 
     * @return true si esta disponible, false si esta prestado.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Establece la disponibilidad del libro.
     * 
     * @param available true si esta disponible, false si esta prestado.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Compara este libro con otro objeto para verificar igualdad.
     * Dos libros son iguales si tienen el mismo ISBN.
     * 
     * @param obj Objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn.equals(book.isbn);
    }

    /**
     * Genera el codigo hash para este libro basado en su ISBN.
     * 
     * @return Codigo hash del libro.
     */
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    /**
     * Genera una representacion en string del libro.
     * 
     * @return String con la informacion del libro.
     */
    @Override
    public String toString() {
        return String.format("Book{ISBN='%s', titulo='%s', autor='%s', disponible=%s}",
                isbn, title, author, available ? "Si" : "No");
    }
}