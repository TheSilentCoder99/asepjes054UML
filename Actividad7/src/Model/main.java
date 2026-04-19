package Model;


import java.io.*;
import java.util.*;

/**
 * Clase principal para probar el sistema de la guardería
 */
public class main {
    public static void main(String[] args) {
        // Crear padres (usando herencia de Persona)
        Padre padre1 = new Padre("Juan Carlos", "García López", "12345678A", "Calle Mayor 10, Madrid", "600111222");
        Madre madre1 = new Madre("María Carmen", "García López", "87654321B", "Calle Mayor 10, Madrid", "600333444");

        Padre padre2 = new Padre("Antonio", "Martínez Sánchez", "11111111C", "Avenida Libertad 25, Barcelona", "611222333");
        Madre madre2 = new Madre("Isabel", "Martínez Sánchez", "22222222D", "Avenida Libertad 25, Barcelona", "611444555");

        Padre padre3 = new Padre("Francisco", "Rodríguez Fernández", "33333333E", "Calle Sol 5, Valencia", "622333444");
        Madre madre3 = new Madre("Carmen", "Rodríguez Fernández", "44444444F", "Calle Sol 5, Valencia", "622555666");

        // Crear profesores (usando herencia de Persona)
        Profesor profesor1 = new Profesor("Laura", "Gómez Díaz", "12345678X", "Calle Profesores 1, Madrid", "677111222");
        Profesor profesor2 = new Profesor("Carlos", "Ruiz Jiménez", "87654321Y", "Calle Profesores 2, Madrid", "677333444");
        Profesor profesor3 = new Profesor("Ana", "Moreno López", "11111111Z", "Calle Profesores 3, Barcelona", "688111222");
        Profesor profesor4 = new Profesor("David", "Serrano Pérez", "22222222W", "Calle Profesores 4, Barcelona", "688333444");

        // Crear grupos
        Grupo grupoInfantes = new Grupo("Infantes", 0, 2, 4, 8, profesor1, profesor2);
        Grupo grupoPreescolar = new Grupo("Preescolar", 3, 5, 4, 10, profesor3, profesor4);

        // Crear alumnos (con sus padres, sin grupo asignado inicialmente)
        Date fechaNac1 = new Date(122, 5, 15);   // 15 junio 2022
        Date fechaNac2 = new Date(120, 3, 20);   // 20 marzo 2020
        Date fechaNac3 = new Date(121, 8, 10);   // 10 agosto 2021

        Date horaEntrada = new Date(124, 0, 1, 9, 0);   // 9:00 AM
        Date horaSalida = new Date(124, 0, 1, 17, 0);   // 17:00 PM

        Alumno alumno1 = new Alumno("Lucas", "García García", fechaNac1, horaEntrada, horaSalida, padre1, madre1);
        Alumno alumno2 = new Alumno("Sofía", "Martínez Martínez", fechaNac2, horaEntrada, horaSalida, padre2, madre2);
        Alumno alumno3 = new Alumno("Mateo", "Rodríguez Rodríguez", fechaNac3, horaEntrada, horaSalida, padre3, madre3);

        // Asignar alumnos a grupos
        grupoInfantes.agregarAlumno(alumno1);
        grupoInfantes.agregarAlumno(alumno2);
        grupoPreescolar.agregarAlumno(alumno3);

        // Mostrar información de los grupos
        System.out.println("=== GUARDERÍA - GRUPOS ===\n");

        // Grupo Infantes
        System.out.println("--- GRUPO: " + grupoInfantes.getNombre() + " ---");
        System.out.println("Edades: " + grupoInfantes.getEdadMinima() + " - " + grupoInfantes.getEdadMaxima() + " años");
        System.out.println("Horas: " + grupoInfantes.getHorasMinimas() + " - " + grupoInfantes.getHorasMaximas() + " horas");

        System.out.println("\nProfesores:");
        for (Profesor p : grupoInfantes.getProfesores()) {
            System.out.println("  - " + p.obtenerDatosPersonales());
        }

        System.out.println("\nAlumnos:");
        for (Alumno a : grupoInfantes.getListaNinos()) {
            System.out.println("  - " + a.getNombre() + " " + a.getApellidos());
            System.out.println("      Hora entrada: " + a.getHoraEntrada());
            System.out.println("      Hora salida: " + a.getHoraSalida());
            System.out.println("      Teléfono padre: " + a.getTelefonoPadre());
            System.out.println("      Teléfono madre: " + a.getTelefonoMadre());
        }

        // Grupo Preescolar
        System.out.println("\n--- GRUPO: " + grupoPreescolar.getNombre() + " ---");
        System.out.println("Edades: " + grupoPreescolar.getEdadMinima() + " - " + grupoPreescolar.getEdadMaxima() + " años");
        System.out.println("Horas: " + grupoPreescolar.getHorasMinimas() + " - " + grupoPreescolar.getHorasMaximas() + " horas");

        System.out.println("\nProfesores:");
        for (Profesor p : grupoPreescolar.getProfesores()) {
            System.out.println("  - " + p.obtenerDatosPersonales());
        }

        System.out.println("\nAlumnos:");
        for (Alumno a : grupoPreescolar.getListaNinos()) {
            System.out.println("  - " + a.getNombre() + " " + a.getApellidos());
            System.out.println("      Grupo: " + a.getGrupo().getNombre());
            System.out.println("      Hora entrada: " + a.getHoraEntrada());
            System.out.println("      Hora salida: " + a.getHoraSalida());
            System.out.println("      Teléfono padre: " + a.getTelefonoPadre());
            System.out.println("      Teléfono madre: " + a.getTelefonoMadre());
        }
    }
}