package Model;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // Crear sitio
        SitioArqueologico sitio = new SitioArqueologico("Pompeya", "Italia");

        // Crear excavación
        Date inicio = new Date(124, 0, 1);  // 1 enero 2024
        Date fin = new Date(124, 11, 31);   // 31 diciembre 2024
        Excavacion excavacion = new Excavacion(inicio, fin, sitio);

        // Crear objetos
        ObjetoCompleto vasija = new ObjetoCompleto("OBJ001", "Siglo I", "30x20cm",
                "Vasija romana", "Cerámica", "Almacenar aceite");
        ObjetoFragmentado fragmento = new ObjetoFragmentado("OBJ002", "Siglo I", "5x3cm",
                "Fragmento", "Cerámica");

        // Asignar objetos a la excavación
        excavacion.agregarObjeto(vasija);
        excavacion.agregarObjeto(fragmento);
        

    }
}