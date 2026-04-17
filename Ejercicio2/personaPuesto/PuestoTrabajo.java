
import java.io.*;
import java.util.*;

/**
 * 
 */
public class PuestoTrabajo {

    private String nombre;

    /**
     *
     */
    private Date fechaInicio;

    /**
     *
     */
    private Date fechaFin;

    /**
     *
     */
    private double salario;

    /**
     *
     */
    public Persona persona;

    /**
     * Default constructor
     */
    public PuestoTrabajo() {
    }

    public PuestoTrabajo(String nombre, Date fechaFin, Date fechaInicio, double salario, Persona persona){
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.persona = persona;
        this.salario = salario;
    }

    /**
     * 
     */


}