package com.codehouse.codeacademia.Modelo;

import java.util.ArrayList;

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

    public static ArrayList<Tarea>  incializarTareasPrueba(){
        String descripconGenerica= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis metus hendrerit, auctor libero ac, ornare lacus. Etiam eu fermentum nibh, sit amet consectetur nisi. Curabitur rhoncus et neque id gravida. Morbi mauris urna, tristique vel mollis at, faucibus sit amet risus. Proin vitae condimentum mauris. Nunc ullamcorper convallis pulvinar. Donec mattis nulla eget velit mattis convallis. Aliquam quis leo accumsan, sagittis libero quis, pharetra urna.";
        ArrayList<Tarea> tareas= new ArrayList<>();

        tareas.add(new Tarea("Tarea de MVC",descripconGenerica,"Julio 25, 2019",10));
        tareas.add(new Tarea("Investigacion de RecyclerView",descripconGenerica,"Julio 20, 2019",20));
        tareas.add(new Tarea("Deber de patrones de diseño",descripconGenerica,"Julio 19, 2019",30));
        tareas.add(new Tarea("Examen digital de POO",descripconGenerica,"Julio 18, 2019",50));
        tareas.add(new Tarea("Lección digital de polimorfismo",descripconGenerica,"Julio 15, 2019",10));
        tareas.add(new Tarea("Exposición sobre Arquitectura Android",descripconGenerica,"Julio 13, 2019",15));
        tareas.add(new Tarea("Exposición de Arquitectura iOS",descripconGenerica,"Junio 18, 2019",10));

        return tareas;
    }
}
