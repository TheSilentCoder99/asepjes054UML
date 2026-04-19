
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido1;

    /**
     * 
     */
    private String apellido2;

    /**
     * 
     */
    private Date fechaNacimiento;

    /**
     * 
     */
    private String sexo;

    /**
     * 
     */
    private String numeroIdentificacion;

    /**
     * 
     */
    public Set<PuestoTrabajo> puestos;

    public Persona(String nombre, String apellido1, String apellido2,
                   Date fechaNacimiento, String sexo, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.numeroIdentificacion = numeroIdentificacion;
        this.puestos = new HashSet<>();  // inicializar el Set aquí
    }

    public Persona() {
    }

    public void añadirPuesto(PuestoTrabajo puesto) {
        this.puestos.add(puesto);
    }


}