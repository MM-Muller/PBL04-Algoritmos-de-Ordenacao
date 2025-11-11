import java.util.Arrays;

/**
 * Classe principal para executar a comparação de algoritmos de ordenação.
 * [cite: 6]
 */
public class Main {

    public static void main(String[] args) {
        // Lista de todos os arquivos de dados a serem processados
        String pasta = "Data/";

        String[] files = {
                pasta + "aleatorio_100.csv", pasta + "aleatorio_1000.csv", pasta + "aleatorio_10000.csv",
                pasta + "crescente_100.csv", pasta + "crescente_1000.csv", pasta + "crescente_10000.csv",
                pasta + "decrescente_100.csv", pasta + "decrescente_1000.csv", pasta + "decrescente_10000.csv"
        };

        System.out.println("Iniciando a Comparação de Algoritmos de Ordenação...");
        System.out.println("-----------------------------------------------------");

        for (String file : files) {
            System.out.println("Processando arquivo: " + file);
            int[] originalData = FileLoader.readData(file);

            if (originalData.length == 0) {
                System.out.println("Erro ao ler ou arquivo vazio. Pulando...");
                continue;
            }

            // --- Teste do Bubble Sort ---
            // Copiamos o array original para não afetar os outros testes
            int[] bubbleData = Arrays.copyOf(originalData, originalData.length);
            long startTime = System.nanoTime(); // Medição do tempo
            SortingAlgorithms.bubbleSort(bubbleData);
            long endTime = System.nanoTime();
            // Convertendo nanosegundos para milissegundos (double) para melhor leitura
            double bubbleTime = (endTime - startTime) / 1_000_000.0;
            System.out.printf("  Bubble Sort:    %.4f ms%n", bubbleTime);

            // --- Teste do Insertion Sort ---
            int[] insertionData = Arrays.copyOf(originalData, originalData.length);
            startTime = System.nanoTime(); //
            SortingAlgorithms.insertionSort(insertionData);
            endTime = System.nanoTime();
            double insertionTime = (endTime - startTime) / 1_000_000.0;
            System.out.printf("  Insertion Sort: %.4f ms%n", insertionTime);

            // --- Teste do Quick Sort ---
            int[] quickData = Arrays.copyOf(originalData, originalData.length);
            startTime = System.nanoTime(); //
            SortingAlgorithms.quickSort(quickData);
            endTime = System.nanoTime();
            double quickTime = (endTime - startTime) / 1_000_000.0;
            System.out.printf("  Quick Sort:     %.4f ms%n", quickTime);

            System.out.println("-----------------------------------------------------");
        }

        System.out.println("Processamento concluído.");
    }
}