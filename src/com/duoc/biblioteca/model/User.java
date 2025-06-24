/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.duoc.biblioteca.model;

/**
 * Representa un usuario registrado en la biblioteca.
 * 
 * Esta clase encapsula la informacion basica de un usuario, incluyendo su ID unico,
 * nombre completo y correo electronico.
 * 
 * @author Sistema de Gestion de Biblioteca
 * @version 2.0
 * @since 2.0
 */
public class User {

    /** Identificador unico del usuario */
    private String id;

    /** Nombre completo del usuario */
    private String name;

    /** Correo electronico del usuario */
    private String email;

    /**
     * Constructor que crea un usuario con los datos especificados.
     * 
     * @param id Identificador unico del usuario. No puede ser null ni vacio.
     * @param name Nombre completo del usuario. No puede ser null ni vacio.
     * @param email Correo electronico del usuario. No puede ser null ni vacio.
     * @throws IllegalArgumentException si algun parametro es null o vacio.
     */
    public User(String id, String name, String email) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID no puede ser null o vacio");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede ser null o vacio");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email no puede ser null o vacio");
        }
        this.id = id.trim();
        this.name = name.trim();
        this.email = email.trim();
    }

    /**
     * Obtiene el ID del usuario.
     * 
     * @return ID del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     * 
     * @param id Nuevo ID. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el ID es null o vacio.
     */
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID no puede ser null o vacio");
        }
        this.id = id.trim();
    }

    /**
     * Obtiene el nombre completo del usuario.
     * 
     * @return Nombre completo del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre completo del usuario.
     * 
     * @param name Nuevo nombre. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el nombre es null o vacio.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede ser null o vacio");
        }
        this.name = name.trim();
    }

    /**
     * Obtiene el correo electronico del usuario.
     * 
     * @return Correo electronico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electronico del usuario.
     * 
     * @param email Nuevo correo electronico. No puede ser null ni vacio.
     * @throws IllegalArgumentException si el correo es null o vacio.
     */
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email no puede ser null o vacio");
        }
        this.email = email.trim();
    }

    /**
     * Compara este usuario con otro objeto para verificar igualdad.
     * Dos usuarios son iguales si tienen el mismo ID.
     * 
     * @param obj Objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id.equals(user.id);
    }

    /**
     * Genera el codigo hash para este usuario basado en su ID.
     * 
     * @return Codigo hash del usuario.
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * Genera una representacion en string del usuario.
     * 
     * @return String con la informacion del usuario.
     */
    @Override
    public String toString() {
        return String.format("User{ID='%s', nombre='%s', email='%s'}", id, name, email);
    }
}