package br.com.eder.screenmatch.calculos;

import br.com.eder.screenmatch.modelo.Filme;
import br.com.eder.screenmatch.modelo.Serie;
import br.com.eder.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
/*
    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }
    */

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }

}
