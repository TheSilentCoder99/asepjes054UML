
import java.io.*;
import java.util.*;

/**
 *
 */
public class Lugar {

    private int numeroIdentificador;

    private String direccion;

    private String localidad;

    private String provincia;

    public Proyecto proyecto;

    public Lugar() {

    }

    public Lugar(int numeroIdentificador, String direccion, String localidad, String provincia) {
        this.numeroIdentificador = numeroIdentificador;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Lugar(int numeroIdentificador, String direccion, String localidad, String provincia, Proyecto proyecto) {

        this.numeroIdentificador = numeroIdentificador;
        this.direccion = direccion;
        this.localidad = localidad;
        this.proyecto = proyecto;
        this.provincia = provincia;

    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}