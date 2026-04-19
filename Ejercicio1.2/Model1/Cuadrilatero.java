
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Cuadrilatero extends Forma {
    private float longitudLados;

    public Cuadrilatero() {
    }

    public Cuadrilatero(float longitudLados) {
        this.longitudLados = longitudLados;
    }


    public Cuadrilatero(String color, float longitudLados) {
        super(color);
        this.longitudLados = longitudLados;
    }

    public float getLongitudLados() {
        return longitudLados;
    }

    public void setLongitudLados(float longitudLados) {
        this.longitudLados = longitudLados;
    }
}