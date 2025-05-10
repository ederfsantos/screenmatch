package exercicios_json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaEmArquivoTxt {

    public static void main(String[] args) throws IOException {

        String mensagem = "Conteúdo a ser gravado no arquivo.";
        FileWriter escrever = new FileWriter("arquivo.txt");
        escrever.write(mensagem);
        escrever.close();
        System.out.println("Programa finalizado");


    }
}