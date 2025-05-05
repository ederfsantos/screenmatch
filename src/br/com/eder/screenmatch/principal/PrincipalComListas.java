package br.com.eder.screenmatch.principal;

import br.com.eder.screenmatch.modelo.Filme;
import br.com.eder.screenmatch.modelo.Serie;
import br.com.eder.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {


        Filme filme = new Filme("O poderoso chefão", 2022);
        filme.avalia(9);
        Filme filme1 = new Filme("Tombstone", 2025);
        filme1.avalia(6);
        Serie serie = new Serie("ER", 1996);
        ArrayList<Titulo> lista = new ArrayList();
        lista.add(filme);
        lista.add(filme1);
        lista.add(serie);
        //lista.forEach(i-> System.out.println(i));
        //ou
        for (Titulo t : lista) {
            System.out.println(t.getNome());
            if (t instanceof Filme film){
                System.out.println("Classificação " + film.getClassificacao());
            }

        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("John Connor");
        artistas.add("Sarah Connor");
        artistas.add("Eagon Targeryan");
        artistas.add("Arian Stark");
        System.out.println(artistas);

        Collections.sort(artistas);//orderar por ordem alfabética
        System.out.println("Depois da ordenação");
        System.out.println(artistas);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

/*
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(23);
        numeros.add(9);
        numeros.add(100);
        numeros.add(27);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
*/


    }
}
