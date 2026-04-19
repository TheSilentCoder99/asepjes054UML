package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Profesor extends Persona {

    private String dni;
    private String direccion;

    /**
     * Constructor vacío
     */
    public Profesor() {
        super();
    }

    /**
     * Constructor con parámetros
     */
    public Profesor(String nombre, String apellidos, String dni, String direccion, String telefono) {
        super(nombre, apellidos, telefono);
        this.dni = dni;
        this.direccion = direccion;
    }

    /**
     * Obtener datos personales del profesor
     */
    @Override
    public String obtenerDatosPersonales() {
        return "Nombre: " + nombre + " " + apellidos +
                ", DNI: " + dni +
                ", Dirección: " + direccion +
                ", Teléfono: " + telefono;
    }

    // Getters y Setters específicos
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}