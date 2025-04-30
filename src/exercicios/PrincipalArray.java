package exercicios;

import java.util.ArrayList;

public class PrincipalArray {
    public static void main(String[] args) {
        //item 1 do exercicio, criar uma lista e percorrer com foreach
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Carro");
        lista.add("Moto");
        lista.add("Avião");
        lista.add("Navio");

        lista.forEach(x-> System.out.println(x));

        //item 2 crie ua classe animal,cachorro que herda de animal

    }
}
