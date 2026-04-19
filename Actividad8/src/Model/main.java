package Model;

import java.io.*;
import java.util.*;

/**
 * Clase principal para probar el sistema de reserva de asientos del cine
 */
public class main {
    public static void main(String[] args) {

        // PASO 1: Crear las películas
        Pelicula pelicula1 = new Pelicula("Dune: Parte Dos", 166);
        Pelicula pelicula2 = new Pelicula("Wonka", 112);
        Pelicula pelicula3 = new Pelicula("Kung Fu Panda 4", 94);
        Pelicula pelicula4 = new Pelicula("Oppenheimer", 180);
        Pelicula pelicula5 = new Pelicula("Barbie", 114);

        // PASO 2: Crear el cine con 5 salas (cada una con 5 filas y 6 asientos)
        Cine cine = new Cine(5, 5, 6);

        // PASO 3: Asignar una película a cada sala
        cine.asignarPeliculaASala(1, pelicula1);
        cine.asignarPeliculaASala(2, pelicula2);
        cine.asignarPeliculaASala(3, pelicula3);
        cine.asignarPeliculaASala(4, pelicula4);
        cine.asignarPeliculaASala(5, pelicula5);

        // PASO 5: Visualizar todas las salas
        System.out.println("=== CINE - 5 SALAS ===\n");
        for (int i = 1; i <= 5; i++) {
            cine.visualizarSala(i);
            System.out.println();
        }

        // PASO 6: Hacer operaciones de reserva en la sala 1
        System.out.println("\n=== OPERACIONES EN SALA 1 ===");

        // Pre-reservar un asiento
        System.out.println("Pre-reservando asiento F2-A3...");
        cine.preReservarAsiento(1, 2, 3);

        // Reservar otro asiento
        System.out.println("Reservando asiento F3-A4...");
        cine.reservarAsiento(1, 3, 4);

        // Confirmar la pre-reserva
        System.out.println("Confirmando pre-reserva F2-A3...");
        cine.confirmarReservaAsiento(1, 2, 3);

        // Mostrar estado final
        System.out.println("\nEstado final de sala 1:");
        cine.visualizarSala(1);

        // PASO 7: Añadir una nueva sala (demostrando que el número puede crecer)
        System.out.println("\n=== AÑADIENDO NUEVA SALA ===");
        System.out.println("Salas antes: " + cine.getNumeroSalas());
        cine.añadirSala(4, 6);
        System.out.println("Salas después: " + cine.getNumeroSalas());

        Pelicula pelicula6 = new Pelicula("Madame Web", 116);
        cine.asignarPeliculaASala(6, pelicula4);
        cine.visualizarSala(6);
    }
}