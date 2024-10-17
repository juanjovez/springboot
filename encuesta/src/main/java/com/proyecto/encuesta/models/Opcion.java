package com.proyecto.encuesta.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Opcion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long idEncuesta;
    private String opcion;


    protected Opcion() {}

    public Opcion(Long idEncuesta, String opcion ) {
        this.idEncuesta = idEncuesta;
        this.opcion = opcion;

    }

    @Override
    public String toString() {
        return String.format(
                "Opciones[id=%d, idEncuesta=%d, opcion='%s'",
                id, idEncuesta,opcion);
    }

    public Long getId() {
        return id;
    }

    public Long getidEncuesta() {
        return idEncuesta;
    }

    public String getopcion() {
        return opcion;
    }



}
