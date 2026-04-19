package Model;

import java.io.*;
import java.util.*;

/**
 * Superclase que contiene los atributos comunes a Padre, Madre y Profesor
 */
public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected String telefono;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros comunes
     */
    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /**
     * Obtener datos personales (método polimórfico)
     */
    public abstract String obtenerDatosPersonales();

    /**
     * Obtener teléfono
     */
    public String getTelefono() {
        return this.telefono;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public void setTelefono(String telefono) { this.telefono = telefono; }
}