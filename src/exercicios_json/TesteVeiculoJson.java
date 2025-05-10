package exercicios_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

//exercicio 4
public class TesteVeiculoJson {
    public static void main(String[] args) throws Exception {
        VeiculoRecord veiculo = new VeiculoRecord("Fiesta", "Ford",
                "Prata Riveira", "flex", 2011);
        System.out.println("Dados do objeto veiculoRecord\n" + veiculo);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String resultado = gson.toJson(veiculo);
        System.out.println(resultado);
        //gravando em arquivo de texto
        FileWriter gravar = new FileWriter("veiculos.txt");
        gravar.write(resultado);
        gravar.close();



    }
}
