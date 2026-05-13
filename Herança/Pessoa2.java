package Herança;

public class Pessoa2 {
    private String nome;
    private Pessoa2 endereco;

    public Pessoa2(String nome, Pessoa2 endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa2 getEndereco() {
        return endereco;
    }

    public void setEndereco(Pessoa2 endereco) {
        this.endereco = endereco;
    }
    
    public String exibirDados() {
        return "Nome: " + nome + "\nEndereço: " + endereco;
    }
    
}
/* Modifique o exercício 5 para que o atributo “endereco” da classe Pessoa seja do tipo
“Endereco”.
 */