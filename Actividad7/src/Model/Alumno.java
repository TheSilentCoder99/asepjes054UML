package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Date horaEntrada;
    private Date horaSalida;
    public Grupo grupo;
    public Padre padre;
    public Madre madre;

    /**
     * Constructor vacío
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros (sin Grupo, se asigna después)
     */
    public Alumno(String nombre, String apellidos, Date fechaNacimiento,
                  Date horaEntrada, Date horaSalida, Padre padre, Madre madre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.padre = padre;
        this.madre = madre;
        this.grupo = null;  // Inicializado a null, se asigna después con setGrupo()
    }

    /**
     * Obtener el grupo del alumno
     */
    public Grupo getGrupo() {
        return this.grupo;
    }

    /**
     * Obtener la hora de entrada
     */
    public Date getHoraEntrada() {
        return this.horaEntrada;
    }

    /**
     * Obtener la hora de salida
     */
    public Date getHoraSalida() {
        return this.horaSalida;
    }

    /**
     * Obtener el teléfono del padre
     */
    public String getTelefonoPadre() {
        if (this.padre != null) {
            return this.padre.getTelefono();
        }
        return null;
    }

    /**
     * Obtener el teléfono de la madre
     */
    public String getTelefonoMadre() {
        if (this.madre != null) {
            return this.madre.getTelefono();
        }
        return null;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public void setHoraEntrada(Date horaEntrada) { this.horaEntrada = horaEntrada; }
    public void setHoraSalida(Date horaSalida) { this.horaSalida = horaSalida; }

    public void setGrupo(Grupo grupo) { this.grupo = grupo; }
    public Padre getPadre() { return padre; }
    public void setPadre(Padre padre) { this.padre = padre; }
    public Madre getMadre() { return madre; }
    public void setMadre(Madre madre) { this.madre = madre; }
}