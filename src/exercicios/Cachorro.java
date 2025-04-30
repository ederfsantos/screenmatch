package exercicios;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, int peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return String.format("%s\nRaça: %s",super.toString(),this.raca);
    }
}
