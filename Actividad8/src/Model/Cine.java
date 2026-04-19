package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Cine {

    private List<Sala> salas;

    /**
     * Constructor vacío
     */
    public Cine() {
        this.salas = new ArrayList<>();
    }

    /**
     * Constructor con parámetros (número inicial de salas)
     */
    public Cine(int numSalas, int filasPorSala, int asientosPorFila) {
        this.salas = new ArrayList<>();
        for (int i = 0; i < numSalas; i++) {
            salas.add(new Sala(i + 1, filasPorSala, asientosPorFila));
        }
    }

    /**
     * Añadir una nueva sala (para que el número pueda crecer)
     */
    public void añadirSala(int filas, int asientosPorFila) {
        int nuevoNumero = salas.size() + 1;
        salas.add(new Sala(nuevoNumero, filas, asientosPorFila));
    }

    /**
     * Buscar una sala por su número
     */
    public Sala buscarSala(int numeroSala) {
        for (Sala sala : salas) {
            if (sala.getNumeroSala() == numeroSala) {
                return sala;
            }
        }
        return null;
    }

    /**
     * Visualizar una sala específica
     */
    public void visualizarSala(int numeroSala) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            sala.visualizarSala();
        } else {
            System.out.println("La sala " + numeroSala + " no existe.");
        }
    }

    /**
     * Asignar película a una sala
     */
    public void asignarPeliculaASala(int numeroSala, Pelicula pelicula) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            sala.asignarPelicula(pelicula);
            System.out.println("Película '" + pelicula.getTitulo() + "' asignada a la sala " + numeroSala);
        } else {
            System.out.println("La sala " + numeroSala + " no existe.");
        }
    }

    /**
     * Reservar un asiento en una sala
     */
    public boolean reservarAsiento(int numeroSala, int fila, int numero) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            Asiento asiento = sala.seleccionarAsiento(fila, numero);
            if (asiento != null) {
                return asiento.reservar();
            }
        }
        return false;
    }

    /**
     * Pre-reservar un asiento en una sala
     */
    public boolean preReservarAsiento(int numeroSala, int fila, int numero) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            Asiento asiento = sala.seleccionarAsiento(fila, numero);
            if (asiento != null) {
                return asiento.preReservar();
            }
        }
        return false;
    }

    /**
     * Confirmar pre-reserva de un asiento
     */
    public boolean confirmarReservaAsiento(int numeroSala, int fila, int numero) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            Asiento asiento = sala.seleccionarAsiento(fila, numero);
            if (asiento != null) {
                return asiento.confirmarReserva();
            }
        }
        return false;
    }

    /**
     * Eliminar reserva de un asiento
     */
    public boolean eliminarReservaAsiento(int numeroSala, int fila, int numero) {
        Sala sala = buscarSala(numeroSala);
        if (sala != null) {
            Asiento asiento = sala.seleccionarAsiento(fila, numero);
            if (asiento != null) {
                return asiento.eliminarReserva();
            }
        }
        return false;
    }

    // Getters y Setters
    public List<Sala> getSalas() { return salas; }
    public void setSalas(List<Sala> salas) { this.salas = salas; }

    public int getNumeroSalas() { return salas.size(); }
}