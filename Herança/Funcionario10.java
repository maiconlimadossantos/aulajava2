public class Funcionario10 {
    private int id;
    private String nome;
    private double salario;

    public Funcionario10(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String exibirDados() {
        return "ID: " + id + "\nNome: " + nome + "\nSalário: R$ " + salario;
    }
    
}
/*Crie uma classe Gerente que estende de Funcionario, adicionando como atributo um vetor do tipo
Funcionario chamado departamento e uma variável para controlar a quantidade de cadastrados. No
construtor, além de receber os dados do gerente para passar à classe pai, receba também a
capacidade máxima e inicialize o vetor. Implemente as funções: adicionar(), que recebe um
funcionário por parâmetro e o adiciona no departamento; imprimirRelatorio(), que exibe na tela os
dados de todos os funcionários alocados naquele departamento; atualizar(), que recebe o id de um
funcionário junto com os novos dados (como nome e salário), localiza este no departamento e
atualiza suas informações mantendo o id intacto; e remover(), que recebe o id de um funcionário,
localiza este no departamento e remove o mesmo da equipe (atribuindo null à posição). Na classe
principal, na função main, crie instâncias da classe Funcionario. Depois, crie um gerente definindo o
tamanho do seu departamento e use a função de adicionar para colocar os empregados sob sua
gestão. Por fim, execute e teste todas as funções do gerente. */