/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.exceptions;

/**
 * Excepción que se lanza cuando se intenta agregar una entrada duplicada.
 */
public class DuplicateEntryException extends Exception {

    /**
     * Crea una nueva excepción con un mensaje personalizado.
     *
     * @param message Descripción del error.
     */
    public DuplicateEntryException(String message) {
        super("❌ Duplicate entry error: " + message);
    }
}