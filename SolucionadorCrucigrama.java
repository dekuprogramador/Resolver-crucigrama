import java.util.Arrays;
import java.util.List;

public class SolucionadorCrucigrama {

    // Lista de palabras a buscar en el crucigrama.
    private final List<String> palabrasABuscar = Arrays.asList("ARBOL", "HEAPS", "SORTS", "NODOS", "GRAFO");

    /**
     * Busca las palabras definidas en la lista 'palabrasABuscar'
     * de forma horizontal y vertical dentro del crucigrama.
     *
     * @param crucigrama La matriz 20x20 de caracteres.
     * @return Un String con la posición y dirección de cada palabra encontrada.
     */
    public String resolverCrucigrama(char[][] crucigrama) {
        StringBuilder resultados = new StringBuilder();
        int tamano = crucigrama.length;
        int longitudPalabra = 5; // Todas las palabras tienen 5 letras.

        // Búsqueda Horizontal
        for (int fila = 0; fila < tamano; fila++) {
            for (int col = 0; col <= tamano - longitudPalabra; col++) {
                // Extrae una subcadena de 5 letras de la fila actual
                String subcadena = new String(crucigrama[fila], col, longitudPalabra);
                // Comprueba si la subcadena está en nuestra lista de palabras
                if (palabrasABuscar.contains(subcadena)) {
                    resultados.append("Palabra '")
                              .append(subcadena)
                              .append("' encontrada en la posición inicial (")
                              .append(fila)
                              .append(", ")
                              .append(col)
                              .append(") en dirección Horizontal.\n");
                }
            }
        }

        // Búsqueda Vertical
        for (int col = 0; col < tamano; col++) {
            for (int fila = 0; fila <= tamano - longitudPalabra; fila++) {
                // Construye una palabra de 5 letras tomando caracteres de la columna actual
                StringBuilder palabraVertical = new StringBuilder();
                for (int k = 0; k < longitudPalabra; k++) {
                    palabraVertical.append(crucigrama[fila + k][col]);
                }
                String palabraFormada = palabraVertical.toString();
                // Comprueba si la palabra formada está en nuestra lista
                if (palabrasABuscar.contains(palabraFormada)) {
                     resultados.append("Palabra '")
                              .append(palabraFormada)
                              .append("' encontrada en la posición inicial (")
                              .append(fila)
                              .append(", ")
                              .append(col)
                              .append(") en dirección Vertical.\n");
                }
            }
        }
        
        if (resultados.length() == 0) {
            return "No se encontró ninguna de las palabras buscadas.";
        }

        return resultados.toString();
    }
}
