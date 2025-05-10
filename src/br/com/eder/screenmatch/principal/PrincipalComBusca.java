package br.com.eder.screenmatch.principal;

import br.com.eder.screenmatch.modelo.Titulo;
import br.com.eder.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exceptions.ErroDeConversaoDeAnoException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();//criar um objeto gson formatado .setPrettyPrinting()
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = ler.nextLine();
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=2389347b";

            try {
                HttpClient client = HttpClient.newHttpClient();
//"https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"
                HttpRequest request = HttpRequest.newBuilder()
                        //.uri(URI.create("https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"))
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                // System.out.println(response.body());
                String json = response.body();
                System.out.println("Dados da resposta da requisição\n" + json);


                //Gson gson = new Gson();
               // Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                //Titulo meuTitulo = gson.fromJson(json,Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);//record
                System.out.println("\nDados do objeto meuTituloOmdb convertido de Json para um objeto record na aplicação\n" + meuTituloOmdb);
                // try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);//passando um record para criar um obj titulo
                System.out.println("\nMeu titulo ja convertido");
                System.out.println("\n" + meuTitulo);
                titulos.add(meuTitulo);//adicionando na lista
//                System.out.println("Gravando a saida  toString() num arquivo de texto");
//                FileWriter escrita = new FileWriter("filmes.txt");
//                escrita.write(meuTitulo.toString());
//                escrita.close();

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException ex) {
                System.out.println("Aconteceu um erro de argumento: " + ex.getMessage());
            } catch (ErroDeConversaoDeAnoException exc) {
                System.out.println("Aconteceu algo, não seio o que é! " + exc.getMessage());
            }
                System.out.println("\nExibindo a lista de titulos");
                System.out.println(titulos);
                FileWriter gravarEmArquivo = new FileWriter("filmes.json");
                gravarEmArquivo.write(gson.toJson(titulos));
                gravarEmArquivo.close();
                System.out.println("\nO programa finalizou corretamente!");

        }

    }
}
