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
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = ler.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=2389347b";

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
            System.out.println(json);
//        client.sendAsync(request, BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();

            //Gson gson = new Gson();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo meuTitulo = gson.fromJson(json,Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);//record
            System.out.println(meuTituloOmdb);
            // try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);//passando um record para criar um obj titulo
            System.out.println("Meu titulo ja convertido");
            System.out.println(meuTitulo);
            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(meuTitulo.toString());
            escrita.close();

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        }catch (IllegalArgumentException ex){
            System.out.println("Aconteceu um erro de argumento: " + ex.getMessage());
        }catch (ErroDeConversaoDeAnoException exc){
            System.out.println("Aconteceu algo, não seio o que é! " + exc.getMessage());
        }

        finally {
            System.out.println("O programa finalizou corretamente!");
        }


    }
}
