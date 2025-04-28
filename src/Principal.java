import br.com.eder.screenmatch.calculos.CalculadoraDeTempo;
import br.com.eder.screenmatch.calculos.FiltroRecomendacao;
import br.com.eder.screenmatch.modelo.Episodio;
import br.com.eder.screenmatch.modelo.Filme;
import br.com.eder.screenmatch.modelo.Serie;
import br.com.eder.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(2022);
        filme.setDuracaoEmMinutos(258);
        filme.setIncluidoNoPlano(true);
        filme.setTotalDeAvaliacoes(10);
        filme.setDiretor("eder");
        Filme filme1 = new Filme();
        filme1.setNome("Tombstone");
        filme1.setAnoDeLancamento(2025);
        filme1.setDuracaoEmMinutos(100);
        filme1.setIncluidoNoPlano(true);
        filme1.setTotalDeAvaliacoes(7);
        filme1.setDiretor("eder f");

        filme.exibeFichaTecnica();
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.println(filme);

        filme1.exibeFichaTecnica();
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1);

        Serie serie = new Serie();
        serie.setNome("ER");
        serie.setAnoDeLancamento(1996);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodio(60);
        serie.setTemporadas(8);
        serie.setAtiva(true);
        serie.getDuracaoEmMinutos();
        System.out.println("Duração em minutos = " + serie.getDuracaoEmMinutos());
        System.out.println(serie);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(filme1);
        System.out.println(calculadora.getTempoTotal());

//DownCast
        System.out.println("exemplo de downCast");
        Titulo t = new Filme();
        if (t instanceof Filme) {
            ((Filme) t).setDiretor("JOAO");
            System.out.println("O diretor do filme é : " + ((Filme) t).getDiretor());
            System.out.println("Fim do exemplo de downCast");
        }
//fim DownCast
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);


        //listas
        ArrayList<Filme>listaDeFilmes = new ArrayList();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme1);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}
