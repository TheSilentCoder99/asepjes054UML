import java.io.*;
import java.util.*;

/**
 *
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    public Viaje viaje;

    /**
     * Constructor
     */
    public Cliente(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Cliente() {

    }

    /**
     * Consultar teléfono del cliente
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Consultar viaje del cliente
     */
    public Viaje getViaje() {
        return this.viaje;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}