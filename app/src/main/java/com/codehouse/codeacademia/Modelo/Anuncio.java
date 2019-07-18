package com.codehouse.codeacademia.Modelo;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Anuncio {
    private String titulo;
    private String descripcion;
    private String fecha;


    public Anuncio(String titulo, String descripcion, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static ArrayList<Anuncio> inicializarAnunciosPrueba(){
        String descripconGenerica= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis quis metus hendrerit, auctor libero ac, ornare lacus. Etiam eu fermentum nibh, sit amet consectetur nisi. Curabitur rhoncus et neque id gravida. Morbi mauris urna, tristique vel mollis at, faucibus sit amet risus. Proin vitae condimentum mauris. Nunc ullamcorper convallis pulvinar. Donec mattis nulla eget velit mattis convallis. Aliquam quis leo accumsan, sagittis libero quis, pharetra urna.";
        ArrayList<Anuncio> anuncios= new ArrayList<>();

        anuncios.add(new Anuncio("Taller de programacion en Android",descripconGenerica,"Julio 18, 2019"));
        anuncios.add(new Anuncio("Taller de programacion en iOS",descripconGenerica,"Julio 15, 2019"));
        anuncios.add(new Anuncio("Examen de POO",descripconGenerica,"Julio 10, 2019"));
        anuncios.add(new Anuncio("Curso semanal de Base de Datos",descripconGenerica,"Julio 9, 2019"));
        anuncios.add(new Anuncio("Seminario de IoT",descripconGenerica,"Julio 5, 2019"));
        anuncios.add(new Anuncio("Tour a campus party",descripconGenerica,"Julio 3, 2019"));
        anuncios.add(new Anuncio("Nueva serie de videos de Diseño Web",descripconGenerica,"Junio 18, 2019"));

        return anuncios;
    }
}
