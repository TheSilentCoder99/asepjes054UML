package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Sala {

    private int numeroSala;
    public Pelicula pelicula;
    private Asiento[][] asientos;

    /**
     * Constructor vacío
     */
    public Sala() {
    }

    /**
     * Constructor con parámetros
     */
    public Sala(int numeroSala, int filas, int asientosPorFila) {
        this.numeroSala = numeroSala;
        this.asientos = new Asiento[filas][asientosPorFila];
        this.pelicula = null;

        // Inicializar todos los asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < asientosPorFila; j++) {
                this.asientos[i][j] = new Asiento(i + 1, j + 1);
            }
        }
    }

    /**
     * Visualizar la sala al completo
     */
    public void visualizarSala() {
        System.out.println("=== SALA " + numeroSala + " ===");
        if (pelicula != null) {
            System.out.println("Película: " + pelicula);
        } else {
            System.out.println("Película: No asignada");
        }
        System.out.println();

        // Mostrar cabecera de números de asiento
        System.out.print("     ");
        for (int j = 0; j < asientos[0].length; j++) {
            System.out.print(" " + (j + 1) + "  ");
        }
        System.out.println();

        // Mostrar filas con sus asientos
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < asientos[i].length; j++) {
                String estado = "";
                switch (asientos[i][j].getEstado()) {
                    case LIBRE:
                        estado = " L ";
                        break;
                    case PRE_RESERVADO:
                        estado = " P ";
                        break;
                    case RESERVADO:
                        estado = " R ";
                        break;
                }
                System.out.print("[" + estado + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Leyenda: L = Libre, P = Pre-reservado, R = Reservado");
    }

    /**
     * Seleccionar un asiento para hacer operaciones
     */
    public Asiento seleccionarAsiento(int fila, int numero) {
        if (fila > 0 && fila <= asientos.length &&
                numero > 0 && numero <= asientos[0].length) {
            return asientos[fila - 1][numero - 1];
        }
        return null;
    }

    /**
     * Asignar la película que se proyecta en la sala
     */
    public void asignarPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    // Getters y Setters
    public int getNumeroSala() { return numeroSala; }
    public void setNumeroSala(int numeroSala) { this.numeroSala = numeroSala; }

    public Pelicula getPelicula() { return pelicula; }

    public void setPelicula(Pelicula pelicula) { this.pelicula = pelicula; }

    public Asiento[][] getAsientos() { return asientos; }
    public void setAsientos(Asiento[][] asientos) { this.asientos = asientos; }
}