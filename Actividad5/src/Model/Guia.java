import java.io.*;
import java.util.*;

/**
 *
 */
public class Guia {

    private String nombre;
    private String apellidos;
    private String cedula;
    private String telefono;
    private String especialidad;
    public Viaje viaje;

    /**
     * Constructor
     */
    public Guia(String nombre, String apellidos, String cedula, String telefono, String especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public Guia() {

    }

    /**
     * Consultar teléfono del guía
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Consultar especialidad del guía
     */
    public String getEspecialidad() {
        return this.especialidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}