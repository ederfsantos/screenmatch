package exercicios_record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParaObjetoFlex {
    public static void main(String[] args) {
        String pessoaJson = """ 
                {
                "nome": "Eagon Targeryan",
                "cidade": "Castelo Black"
                
                }
                """;

       // Gson gson = new GsonBuilder().setLenient().create();
        Gson gson = new GsonBuilder().create();
        PessoaRecord p = gson.fromJson(pessoaJson, PessoaRecord.class);
        System.out.println("Resultado: " + p);
    }
}
