package br.com.eder.screenmatch.principal;

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
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=2389347b";


        HttpClient client = HttpClient.newHttpClient();
//"https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"))
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
//        client.sendAsync(request, BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
    }
}
