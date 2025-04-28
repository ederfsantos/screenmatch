package br.com.eder.screenmatch.modelo;

import br.com.eder.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

public int pegaMedia(){
        return super.getTotalDeAvaliacoes();
}


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() /2;
    }
}

