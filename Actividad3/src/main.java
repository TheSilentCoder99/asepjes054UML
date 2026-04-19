import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        // Creo el set de empleados vacío y que usaremos después
        Set<Empleado> empleadosProyecto = new HashSet<>();
//        lugar vacio que reasignaremos después
        Lugar lugar = new Lugar();

        // Crear un proyecto
        Proyecto proyecto = new Proyecto(new Date(), new Date(), "Proyecto de innovación", empleadosProyecto, lugar);

        // Crear dos empleados asignados al proyecto
        Empleado empleado1 = new Empleado("Juan", "García López", "Desarrollador", proyecto);
        Empleado empleado2 = new Empleado("María", "Martínez Sánchez", "Diseñadora", proyecto);

// Crear un lugar asignado al proyecto
        lugar = new Lugar(101, "Calle Mayor 15", "Madrid", "Madrid");


        // Crear un empleado que no está en ningún proyecto (proyecto = null)
        Empleado empleado3 = new Empleado("Pedro", "Rodríguez Fernández", "Analista", null);


        empleadosProyecto.add(empleado1);
        empleadosProyecto.add(empleado2);
        empleadosProyecto.add(empleado3);

    }
}