package com.proyecto.encuesta.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;

    protected Usuario() {}

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return String.format(
                "Usuario[id=%d, nombre='%s', apellido='%s']",
                id, nombre, apellido);
    }

    public Long getId() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }
}
