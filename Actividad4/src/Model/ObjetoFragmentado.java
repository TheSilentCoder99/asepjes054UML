package Model;

import java.io.*;
import java.util.*;

/**
 * Objeto arqueológico fragmentado
 */
public class ObjetoFragmentado extends Objeto {

    public ObjetoFragmentado(String codigo, String datacion, String dimensiones,
                             String descripcion, String material) {
        super(codigo, datacion, dimensiones, descripcion, material);
    }

    @Override
    public String toString() {
        return "ObjetoFragmentado{" + getCodigo() + "}";
    }
}