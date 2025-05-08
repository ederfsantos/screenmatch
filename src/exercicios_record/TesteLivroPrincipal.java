package exercicios_record;

import com.google.gson.Gson;

public class TesteLivroPrincipal {
    public static void main(String[] args) {

        String livroJson = """
                 {
                    "titulo":"Java 8",
                    "autor": "Sergio Furgeri",
                
                     "editora":
                     {
                     "nome":"Erica Saraiva"
                     }
                
                 }
                
                """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(livroJson, Livro.class);
        System.out.println(livro);

    }
}
