package Testes;

import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivo {
    public static String line(String nome, int idade, String ra) {
        return nome + ";" + idade + ";" + ra + "\n";
    }

    public static void main(String[] args) {
        String caminhoArquivo = "src/Testes/arquivo.csv";

        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write("NOME;IDADE;RA\n");
            writer.write(line("Lucas Griebeler Feldmann", 20, "004755"));
            writer.close();
            System.out.println("Arquivo criado e escrito com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
