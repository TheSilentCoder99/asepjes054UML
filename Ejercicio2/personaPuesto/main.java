import java.util.Date;

public class main{

public static void main(String[] args) {
    Persona persona = new Persona("Ana", "García", "López",
            new Date(), "F", "12345678A");

    Persona persona2 = new Persona("Juan", "García", "Pérez",
            new Date(), "F", "12345678A");

    PuestoTrabajo p1 = new PuestoTrabajo("Desarrolladora", new Date(), new Date(), 2000.0, persona);
    PuestoTrabajo p2 = new PuestoTrabajo("Analista", new Date(), new Date(), 2500.0, persona2);

    persona.añadirPuesto(p1);
    persona.añadirPuesto(p2);

    System.out.println(persona.puestos.size()); // imprime 2
}
}