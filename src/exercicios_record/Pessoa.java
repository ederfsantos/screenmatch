package exercicios_record;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cidade;

    public Pessoa(String nome, Integer idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public Pessoa(PessoaRecord pessoa){
        this.nome = pessoa.nome();
        this.cidade = pessoa.cidade();
        this.idade = pessoa.idade();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String toString() {
        return String.format("***Dados do Objeto Pessoa***\nNome: %s\nIdade: %d\n" +
                "Cidade: %s", this.getNome(), this.getIdade(), this.getCidade());
    }
}
