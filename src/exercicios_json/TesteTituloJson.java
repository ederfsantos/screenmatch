package exercicios_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class TesteTituloJson {
    public static void main(String[] args) throws IOException {
        TituloJson titulo = new TituloJson("Aprendendo Java", "Alura", "Editora Alura",2025);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrever = new FileWriter("exercicio2Json.json");
        escrever.write(gson.toJson(titulo));
        escrever.close();

    }
}
