package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Madre extends Persona {

    private String cedula;
    private String direccion;

    /**
     * Constructor vacío
     */
    public Madre() {
        super();
    }

    /**
     * Constructor con parámetros
     */
    public Madre(String nombre, String apellidos, String cedula, String direccion, String telefono) {
        super(nombre, apellidos, telefono);
        this.cedula = cedula;
        this.direccion = direccion;
    }

    /**
     * Obtener datos personales de la madre
     */
    @Override
    public String obtenerDatosPersonales() {
        return "Nombre: " + nombre + " " + apellidos +
                ", Cédula: " + cedula +
                ", Dirección: " + direccion +
                ", Teléfono: " + telefono;
    }

    // Getters y Setters específicos
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}