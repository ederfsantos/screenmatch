package exercicios;

public class Titulo2 implements Comparable<Titulo2>{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Titulo2{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Titulo2 o) {
        return this.getNome().compareTo(o.getNome());
    }
}
