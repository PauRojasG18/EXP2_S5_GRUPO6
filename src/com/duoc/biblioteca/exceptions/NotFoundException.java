/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.exceptions;

/**
 * Excepción que se lanza cuando no se encuentra un elemento.
 */
public class NotFoundException extends Exception {

    /**
     * Crea una nueva excepción con un mensaje personalizado.
     *
     * @param message Descripción del error.
     */
    public NotFoundException(String message) {
        super("⚠️ Item not found: " + message);
    }
}