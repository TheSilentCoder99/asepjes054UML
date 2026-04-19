package Model;

import java.util.*;

/**
 * 
 */
public class Pelicula {

    private String titulo;

    private int duracion;

    public Set<Sala> sala;

    /**
     * Default constructor
     */
    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Set<Sala> getSala() {
        return sala;
    }

    public void setSala(Set<Sala> sala) {
        this.sala = sala;
    }

    @Override
    public String toString(){
        return this.titulo + "\nDuración: " + this.duracion + " minutos";
    }
}