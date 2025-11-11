import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe utilitária para ler os dados dos arquivos CSV.
 * [cite: 12, 24]
 */
public class FileLoader {

    /**
     * Lê um arquivo CSV e retorna um array de inteiros.
     * Assume que cada linha contém um único número.
     *
     * @param filePath O caminho para o arquivo .csv
     * @return Um array de inteiros com os dados do arquivo.
     */
    public static int[] readData(String filePath) {
        List<Integer> dataList = new ArrayList<>();

        // Usamos try-with-resources para garantir que o reader será fechado.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    // Ignora linhas vazias ou que não são números
                    if (!line.trim().isEmpty()) {
                        dataList.add(Integer.parseInt(line.trim()));
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Aviso: Ignorando linha não-numérica: '" + line + "'");
                }
            }
        } catch (IOException e) {
            System.err.println("Erro fatal ao ler o arquivo: " + filePath);
            e.printStackTrace();
            return new int[0]; // Retorna array vazio em caso de erro
        }

        // Converte a Lista para um array de inteiros primitivos
        return dataList.stream().mapToInt(i -> i).toArray();
    }
}