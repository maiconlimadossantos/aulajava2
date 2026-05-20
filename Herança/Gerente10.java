public class Gerente10 {
    private String nome;
    private double salario;
    private Funcionario10[] departamento;
    private int quantidadeFuncionarios;

    public Gerente10(int i, String nome, double salario, int capacidadeDepartamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = new Funcionario10[capacidadeDepartamento];
        this.quantidadeFuncionarios = 0;
    }

    public void adicionar(Funcionario10 funcionario) {
        if (quantidadeFuncionarios < departamento.length) {
            departamento[quantidadeFuncionarios] = funcionario;
            quantidadeFuncionarios++;
        } else {
            System.out.println("Departamento cheio. Não é possível adicionar mais funcionários.");
        }
    }
    public void imprimirRelatorio() {
        System.out.println("Gerente: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento:");
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (departamento[i] != null) {
                System.out.println(departamento[i].exibirDados());
            }
        }
    }
    public void atualizar(int id, String novoNome, double novoSalario) {
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (departamento[i] != null && departamento[i].getId() == id) {
                departamento[i].setNome(novoNome);
                departamento[i].setSalario(novoSalario);
                return;
            }
        }
        System.out.println("Funcionário com ID " + id + " não encontrado.");
    }
    public void remover(int id) {
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (departamento[i] != null && departamento[i].getId() == id) {
                departamento[i] = null;
                return;
            }
        }
        System.out.println("Funcionário com ID " + id + " não encontrado.");
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