package Model;

import java.io.*;
import java.util.*;

/**
 * Representa un sitio arqueológico
 */
public class SitioArqueologico {
    private String nombre;
    private String ubicacion;

    public SitioArqueologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    @Override
    public String toString() {
        return "Sitio: " + nombre + " (" + ubicacion + ")";
    }
}