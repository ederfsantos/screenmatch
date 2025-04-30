package exercicios;

public class Animal {
    private String nome;
    private int peso;

    public Animal(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nPeso: %d",this.getNome(),this.getPeso());
    }
}
