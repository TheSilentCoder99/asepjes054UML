package Model;

import java.io.*;
import java.util.*;

/**
 * Clase abstracta para objetos arqueológicos
 */
public abstract class Objeto {
    private String codigo;
    private String datacion;
    private String dimensiones;
    private String descripcion;
    private String material;
    private Excavacion excavacion;  // Relación unidireccional

    public Objeto(String codigo, String datacion, String dimensiones,
                  String descripcion, String material) {
        this.codigo = codigo;
        this.datacion = datacion;
        this.dimensiones = dimensiones;
        this.descripcion = descripcion;
        this.material = material;
        this.excavacion = null;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDatacion() { return datacion; }
    public void setDatacion(String datacion) { this.datacion = datacion; }

    public String getDimensiones() { return dimensiones; }
    public void setDimensiones(String dimensiones) { this.dimensiones = dimensiones; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public Excavacion getExcavacion() { return excavacion; }
    public void setExcavacion(Excavacion excavacion) { this.excavacion = excavacion; }

    @Override
    public String toString() {
        return "Objeto " + codigo + " (" + material + ") - " + this.getClass().getSimpleName();
    }
}