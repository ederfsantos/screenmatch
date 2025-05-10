package exercicios_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class TesteTituloJson2 {
    public static void main(String[] args) throws IOException {
        TituloRecord titulo = new TituloRecord("Aprendendo Java com Jacqueline Oliveira", "Alura", "Editora Alura",2025);
        System.out.println("Dados do objeto record\n " + titulo);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrever = new FileWriter("exercicio3Json.json");
        escrever.write(gson.toJson(titulo));
        escrever.close();
        System.out.println("Programa finalizado!");

    }
}
