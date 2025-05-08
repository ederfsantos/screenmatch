package exercicios_record;

import com.google.gson.Gson;

public class TestePessoaPrincipal {
    public static void main(String[] args) {

        String pessoaJson = """
                {
                    "nome":"Sarah Connor",
                    "idade":39,
                    "cidade":"São Paulo"
                
                }
                """;

        Gson gson = new Gson();
       PessoaRecord pessoaRecord= gson.fromJson(pessoaJson,PessoaRecord.class);
        System.out.println(pessoaRecord);
        System.out.println("Criando um objeto do tipo Pessoa apartir de pessoaRecord");
        Pessoa p = new Pessoa(pessoaRecord);
        System.out.println(p);


    }

}
