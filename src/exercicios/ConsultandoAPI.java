package exercicios;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultandoAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        var cripto = JOptionPane.showInputDialog("Digite a criptomoeda que deseja consultar o preço: ");
        //System.out.println("Digite a criptomoeda que deseja consultar o preço: ");
        // var cripto = ler.nextLine();
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + cripto + "&vs_currencies=usd";


        HttpClient client = HttpClient.newHttpClient();
//"https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("https://www.omdbapi.com/?t=jurassic+park&apikey=2389347b"))
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        JOptionPane.showMessageDialog(null, response.body());
    }
}
