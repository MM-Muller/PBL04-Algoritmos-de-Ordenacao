/**
 * Contém as implementações dos algoritmos de ordenação solicitados.
 * [cite: 7, 23]
 */
public class SortingAlgorithms {

    // --- 1. Bubble Sort ---
    // Implementação otimizada que para se o array já estiver ordenado.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se não houve trocas na passagem interna, o array está ordenado
            if (!swapped) {
                break;
            }
        }
    }

    // --- 2. Insertion Sort ---
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos do arr[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // --- 3. Quick Sort ---
    public static void quickSort(int[] arr) {
        // Método público de entrada
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    /**
     * O método recursivo principal do Quick Sort.
     */
    private static void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            // 'pi' é o índice do pivô, arr[pi] está na posição correta
            int pi = partition(arr, low, high);

            // Ordena recursivamente os elementos antes e depois do pivô
            quickSortRecursive(arr, low, pi - 1);
            quickSortRecursive(arr, pi + 1, high);
        }
    }

    /**
     * Partição de Lomuto: Pega o último elemento como pivô,
     * coloca o pivô na posição correta e
     * coloca todos os menores à esquerda e maiores à direita.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivô
        int i = (low - 1); // Índice do menor elemento

        for (int j = low; j < high; j++) {
            // Se o elemento atual é menor ou igual ao pivô
            if (arr[j] <= pivot) {
                i++;
                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i+1] e arr[high] (o pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Retorna o índice do pivô
    }
}