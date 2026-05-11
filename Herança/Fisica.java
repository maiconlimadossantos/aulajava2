package Herança;

public class Fisica extends Pessoa {
    private String cpf;

    public Fisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nCPF: " + cpf;
    }
    
}
