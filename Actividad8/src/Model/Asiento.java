package Model;

import java.io.*;
import java.util.*;

/**
 *
 */
public class Asiento {

    private int fila;
    private int numero;
    private EstadoAsiento estado;

    /**
     * Constructor vacío
     */
    public Asiento() {
        this.estado = EstadoAsiento.LIBRE;
    }

    /**
     * Constructor con parámetros
     */
    public Asiento(int fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.estado = EstadoAsiento.LIBRE;
    }

    /**
     * Consultar el estado del asiento
     */
    public EstadoAsiento consultarEstado() {
        return this.estado;
    }

    /**
     * Hacer una reserva (solo si está libre)
     */
    public boolean reservar() {
        if (this.estado == EstadoAsiento.LIBRE) {
            this.estado = EstadoAsiento.RESERVADO;
            return true;
        }
        return false;
    }

    /**
     * Hacer una pre-reserva (solo si está libre)
     */
    public boolean preReservar() {
        if (this.estado == EstadoAsiento.LIBRE) {
            this.estado = EstadoAsiento.PRE_RESERVADO;
            return true;
        }
        return false;
    }

    /**
     * Confirmar pre-reserva (pasa a reservado)
     */
    public boolean confirmarReserva() {
        if (this.estado == EstadoAsiento.PRE_RESERVADO) {
            this.estado = EstadoAsiento.RESERVADO;
            return true;
        }
        return false;
    }

    /**
     * Eliminar reserva (vuelve a libre)
     */
    public boolean eliminarReserva() {
        if (this.estado == EstadoAsiento.PRE_RESERVADO || this.estado == EstadoAsiento.RESERVADO) {
            this.estado = EstadoAsiento.LIBRE;
            return true;
        }
        return false;
    }

    // Getters y Setters
    public int getFila() { return fila; }
    public void setFila(int fila) { this.fila = fila; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public EstadoAsiento getEstado() { return estado; }
    public void setEstado(EstadoAsiento estado) { this.estado = estado; }
}