package Herança;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, String raca, String cor) {
        super(nome, raca);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void miar() {
        System.out.println(this.getNome() + " está miando.");
    }
    
}
