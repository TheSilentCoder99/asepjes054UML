package Model;

import java.io.*;
import java.util.*;

/**
 * Representa una excavación arqueológica
 */
public class Excavacion {
    private Date fechaInicio;
    private Date fechaFin;
    private SitioArqueologico sitio;
    private Set<Objeto> objetos;

    public Excavacion(Date fechaInicio, Date fechaFin, SitioArqueologico sitio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sitio = sitio;
        this.objetos = new HashSet<>();
    }

    public void agregarObjeto(Objeto objeto) {
        if (objeto != null) {
            objetos.add(objeto);
            objeto.setExcavacion(this);  // Solo esta dirección
        }
    }

    public void eliminarObjeto(Objeto objeto) {
        if (objeto != null) {
            objetos.remove(objeto);
            objeto.setExcavacion(null);
        }
    }

    // Getters y Setters
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public SitioArqueologico getSitio() { return sitio; }
    public void setSitio(SitioArqueologico sitio) { this.sitio = sitio; }

    public Set<Objeto> getObjetos() { return objetos; }

    @Override
    public String toString() {
        return "Excavación: " + fechaInicio + " a " + fechaFin +
                ", Sitio: " + (sitio != null ? sitio.getNombre() : "sin sitio") +
                ", Objetos: " + objetos.size();
    }
}