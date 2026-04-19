package Model;

import java.util.*;

/**
 *
 */
public class Grupo {

    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int horasMinimas;
    private int horasMaximas;
    public Set<Alumno> listaAlumnos;
    public Profesor profesor1;
    public Profesor profesor2;

    /**
     * Constructor vacío
     */
    public Grupo() {
        this.listaAlumnos = new HashSet<>();
    }

    /**
     * Constructor con parámetros
     */
    public Grupo(String nombre, int edadMinima, int edadMaxima,
                 int horasMinimas, int horasMaximas, Profesor profesor1, Profesor profesor2) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.horasMinimas = horasMinimas;
        this.horasMaximas = horasMaximas;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.listaAlumnos = new HashSet<>();
    }

    /**
     * Obtener lista de niños que forman el grupo
     */
    public Set<Alumno> getListaNinos() {
        return this.listaAlumnos;
    }

    /**
     * Obtener profesores del grupo
     */
    public Profesor[] getProfesores() {
        return new Profesor[]{profesor1, profesor2};
    }

    /**
     * Agregar un alumno al grupo
     */
    public void agregarAlumno(Alumno alumno) {
        if (alumno != null) {
            listaAlumnos.add(alumno);
            alumno.setGrupo(this);
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdadMinima() { return edadMinima; }
    public void setEdadMinima(int edadMinima) { this.edadMinima = edadMinima; }

    public int getEdadMaxima() { return edadMaxima; }
    public void setEdadMaxima(int edadMaxima) { this.edadMaxima = edadMaxima; }

    public int getHorasMinimas() { return horasMinimas; }
    public void setHorasMinimas(int horasMinimas) { this.horasMinimas = horasMinimas; }

    public int getHorasMaximas() { return horasMaximas; }
    public void setHorasMaximas(int horasMaximas) { this.horasMaximas = horasMaximas; }

    public Profesor getProfesor1() { return profesor1; }
    public void setProfesor1(Profesor profesor1) { this.profesor1 = profesor1; }

    public Profesor getProfesor2() { return profesor2; }
    public void setProfesor2(Profesor profesor2) { this.profesor2 = profesor2; }
}