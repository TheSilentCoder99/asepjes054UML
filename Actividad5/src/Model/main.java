import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Crear guía
        Guia guia = new Guia("Juan", "Pérez", "12345678A", "600111222", "Cultural");

        // Crear viaje
        Viaje viaje = new Viaje("V001", "París", new Date(), new Date(), 850.00);
        
        viaje.guia = guia;
        guia.viaje = viaje;

        // Crear clientes
        Cliente cliente = new Cliente("Ana", "Martínez", "11111451A", "655311222");
        Cliente cliente2 = new Cliente("Juan", "Martínez", "11178111A", "652111222");
        Cliente cliente3 = new Cliente("Andŕes", "Martínez", "11231111A", "655111622");
        Cliente cliente4 = new Cliente("Marcos", "Martínez", "11112311A", "655119222");

        cliente.viaje = viaje;

        viaje.clientes.add(cliente);
        viaje.clientes.add(cliente2);
        viaje.clientes.add(cliente3);
        viaje.clientes.add(cliente4);


        // Consultas pedidas
        System.out.println("Teléfono del guía: " + guia.getTelefono());
        System.out.println("Especialidad del guía: " + guia.getEspecialidad());
        System.out.println("Teléfono del cliente: " + cliente.getTelefono());
        System.out.println("Viaje del cliente: " + cliente.getViaje().getDestino());
    }
}