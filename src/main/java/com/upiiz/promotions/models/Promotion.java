package com.upiiz.promotions.models;

import java.util.Date;

public class Promotion {
    private Long id;
    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Promotion(){}

    public Promotion(Long id, String nombre, String descripcion, Date fecha_inicio, Date fecha_fin){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {return fecha_inicio;}

    public void setFecha_inicio(Date fecha_inicio) {this.fecha_inicio = fecha_inicio;}

    public Date getFecha_fin() {return fecha_fin;}

    public void setFecha_fin(Date fecha_fin) {this.fecha_fin = fecha_fin;}
}
