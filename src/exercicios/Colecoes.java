package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {

        //item 1
        List<Integer> numeros = new ArrayList<>();
        numeros.add(200);
        numeros.add(100);
        numeros.add(1);
        numeros.add(15);

        System.out.println("Lista em ordem de inserção");
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println("Lista em ordem crescente");
        System.out.println(numeros);

        //item 2
        Titulo2 t1 = new Titulo2();
        Titulo2 t2 = new Titulo2();
        Titulo2 t3 = new Titulo2();
        t1.setNome("Marcos");
        t2.setNome("Bruno Connor");
        t3.setNome("Wander Souza");
        List<Titulo2> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println("Titulos ordenados");
        System.out.println(titulos);
    //item 3


    }
}
