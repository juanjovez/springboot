package com.proyecto.encuesta.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Encuesta {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombreEncuesta;
    private String descripcion;
    private Long idUsuario;

    protected Encuesta() {}

    public Encuesta(String nombreEncuesta, String descripcion,Long idUsuario ) {
        this.nombreEncuesta = nombreEncuesta;
        this.descripcion = descripcion;
        this.idUsuario= idUsuario;
    }

    @Override
    public String toString() {
        return String.format(
                "Usuario[id=%d, nombreEncuesta='%s', descripcion='%s', idUsuario=%d]",
                id, nombreEncuesta, descripcion,idUsuario);
    }

    public Long getId() {
        return id;
    }

    public Long getidUsuario() {
        return idUsuario;
    }

    public String getnombreEncuesta() {
        return nombreEncuesta;
    }

    public String getdescripcion() {
        return descripcion;
    }
}