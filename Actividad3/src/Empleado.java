
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Empleado {

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String rol, Proyecto proyecto){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rol = rol;
        this.proyecto = proyecto;
    }

    private String nombre;

    private String apellidos;

    private String rol;

    public Proyecto proyecto;


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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}