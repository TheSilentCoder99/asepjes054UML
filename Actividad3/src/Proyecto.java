
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Proyecto {

    private Date fechaInicio;

    /**
     *
     */
    private Date fechaFin;

    /**
     *
     */
    private String descripcion;

    /**
     *
     */
    public Set<Empleado> empleados;

    /**
     *
     */
    public Lugar lugar;
    /**
     * Default constructor
     */
    public Proyecto() {
    }

    public Proyecto(Date fechaInicio, Date fechaFin, String descripcion, Set<Empleado> empleados, Lugar lugar) {
        this.fechaFin = fechaFin;
        this.fechaInicio= fechaInicio;
        this.descripcion = descripcion;
        this.empleados = empleados;
        this.lugar = lugar;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}