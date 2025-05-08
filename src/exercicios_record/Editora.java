package exercicios_record;

public class Editora {

    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return String.format("***Dados da Editora***\nNome: %s",this.getNome());
    }
}
