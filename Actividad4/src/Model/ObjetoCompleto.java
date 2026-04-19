package Model;

import java.io.*;
import java.util.*;

/**
 * Objeto arqueológico completo
 */
public class ObjetoCompleto extends Objeto {
    private String uso;

    public ObjetoCompleto(String codigo, String datacion, String dimensiones,
                          String descripcion, String material, String uso) {
        super(codigo, datacion, dimensiones, descripcion, material);
        this.uso = uso;
    }

    public String getUso() { return uso; }
    public void setUso(String uso) { this.uso = uso; }

    @Override
    public String toString() {
        return "ObjetoCompleto{" + getCodigo() + ", uso: " + uso + "}";
    }
}