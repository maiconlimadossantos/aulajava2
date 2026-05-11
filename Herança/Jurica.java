package Herança;

public class Jurica extends Fisica {
    private String rg;

    public Jurica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco, cpf);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nRG: " + rg;
    }
    
}
