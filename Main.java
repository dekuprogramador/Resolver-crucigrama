public class Main {
    public static void main(String[] args) {
        // 1. Generar el crucigrama
        GenerarCrucigrama generadorcrucigrama = new GenerarCrucigrama();
        SolucionadorCrucigrama solucionador = new SolucionadorCrucigrama();
        char[][] crucigrama = generadorcrucigrama.generar();
        Runtime runtime = Runtime.getRuntime();

        // 2. Imprimir el crucigrama generado
        System.out.println("Crucigrama generado:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(crucigrama[i][j] + " ");
            }
            System.out.println("");
        }
        
        long inicio = System.nanoTime();
        System.out.println("\nBuscando palabras...");
        System.out.println("--------------------");

        // 3. Resolver el crucigrama
        String resultados = solucionador.resolverCrucigrama(crucigrama);
        long fin = System.nanoTime();
        long duracion = fin - inicio;

        // 4. Imprimir los resultados
        System.out.println("Tiempo de ejecución para encontrar las palabras: " + duracion / 1_000_000 + " ms");
        System.out.println(resultados);
    }
}
