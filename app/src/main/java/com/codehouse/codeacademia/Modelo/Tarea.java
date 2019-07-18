package com.codehouse.codeacademia.Modelo;

public class Tarea {
    private String nombre;
    private String descripcion;
    private String fecha_entrega;
    private int puntos;

    public Tarea(String nombre, String descripcion, String fecha_entrega, int puntos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
