import java.io.*;
import java.util.*;

/**
 *
 */
public class Viaje {

    private String codigo;
    private String destino;
    private Date fechaSalida;
    private Date fechaRegreso;
    private double precio;
    public Guia guia;
    public Set<Cliente> clientes;

    /**
     * Constructor
     */
    public Viaje(String codigo, String destino, Date fechaSalida, Date fechaRegreso, double precio) {
        this.codigo = codigo;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.precio = precio;
        this.clientes = new HashSet<>();
    }

    public Viaje() {

    }

    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}