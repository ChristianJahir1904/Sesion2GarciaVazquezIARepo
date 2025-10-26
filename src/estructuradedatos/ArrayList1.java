package estructuradedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Ejemplo mejorado que muestra buenas prácticas básicas:
 * - Uso de la interfaz List en lugar de la implementación concreta.
 * - Normalización (capitalizar) de nombres.
 * - Eliminación de duplicados preservando el orden original.
 * - Ordenado opcional (por defecto ordena).
 * - Métodos auxiliares para separar responsabilidades y facilitar pruebas.
 *
 * Opciones por línea de comandos:
 * --shuffle    : baraja la lista en vez de ordenarla.
 *
 * Extensiones sugeridas: lectura desde entrada del usuario, pruebas unitarias, internacionalización.
 */
public class ArrayList1 {

    public static void main(String[] args) {
        // Lista inicial con algunos nombres (se crea como ArrayList para permitir modificaciones)
        List<String> nombres = new ArrayList<>(Arrays.asList(
            "Christian", "Bryan", "Adrian", "Nestor", "Felix", "Gabriel", "Jose", "Tere",
            "christian", "BRYAN" // ejemplos para demostrar normalización y eliminación de duplicados
        ));

        System.out.println("Lista inicial:");
        printList(nombres);

        // Normalizamos los nombres (primera letra mayúscula, resto minúscula)
        List<String> normalizados = nombres.stream()
                                           .map(ArrayList1::normalizarNombre)
                                           .collect(Collectors.toList());

        System.out.println("\nLista normalizada:");
        printList(normalizados);

        // Eliminamos duplicados preservando el orden (LinkedHashSet)
        List<String> sinDuplicados = eliminarDuplicadosPreservandoOrden(normalizados);
        System.out.println("\nLista sin duplicados:");
        printList(sinDuplicados);

        // Dependiendo del argumento, ordenamos o barajamos
        boolean shuffle = false;
        for (String arg : args) {
            if ("--shuffle".equalsIgnoreCase(arg)) {
                shuffle = true;
                break;
            }
        }

        if (shuffle) {
            Collections.shuffle(sinDuplicados);
            System.out.println("\nLista barajada:");
            printList(sinDuplicados);
        } else {
            List<String> ordenada = new ArrayList<>(sinDuplicados);
            Collections.sort(ordenada);
            System.out.println("\nLista ordenada (alfabéticamente):");
            printList(ordenada);
        }
    }

    /**
     * Normaliza el nombre: elimina espacios en los extremos y capitaliza la primera letra
     * (resto en minúsculas). Si el nombre está vacío devuelve cadena vacía.
     */
    private static String normalizarNombre(String nombre) {
        if (nombre == null) return "";
        String trimmed = nombre.trim();
        if (trimmed.isEmpty()) return "";
        if (trimmed.length() == 1) {
            return trimmed.toUpperCase(Locale.ROOT);
        }
        String primera = trimmed.substring(0, 1).toUpperCase(Locale.ROOT);
        String resto = trimmed.substring(1).toLowerCase(Locale.ROOT);
        return primera + resto;
    }

    /**
     * Elimina duplicados preservando el orden original.
     */
    private static List<String> eliminarDuplicadosPreservandoOrden(List<String> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }

    /**
     * Imprime la lista con índice y total.
     */
    private static void printList(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%2d. %s%n", i + 1, lista.get(i));
        }
        System.out.printf("Total: %d%n", lista.size());
    }
}