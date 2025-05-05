package br.com.eder.screenmatch.modelo;

public class Serie  extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);

    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
//       return String.format("%s\nTemporadas: %d\nEpisodios: %d\nMinutos por episodio: %d\nAtiva: %s",
//               super.toString(),this.getTemporadas(),this.getEpisodiosPorTemporada(),
//               this.getMinutosPorEpisodio(),String.valueOf(isAtiva()));

        return String.format("Serie: %s\nAno de lançamento: %d",this.getNome(),this.getAnoDeLancamento());
    }
    @Override
    public int getDuracaoEmMinutos(){

        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
