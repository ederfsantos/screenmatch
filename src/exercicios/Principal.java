package exercicios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //criando um arraylist (lista)
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //criando objetos pessoa

        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        ///instanciando os objetos criados
        p.setIdade(25);
        p.setNome("Sarah Connor");
        p2.setIdade(32);
        p2.setNome("John Connor");
        p3.setIdade(56);
        p3.setNome("Exterminador");

        //adicionando pessoas a lista

        listaDePessoas.add(p);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        //imprimindo o tamanho da lista
        System.out.println("O tamanho da lista é: " + listaDePessoas.size());

        //imprimindo a pimeira pessoa da lista
        System.out.println("A primeira pessoa da lista é: \n" + listaDePessoas.get(0).toString());
        //imprimindo a lista completa
        System.out.println("Imprimindo o conteúdo da lista:\n" + listaDePessoas);


    }
}
