package Herança;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome, raca);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir() {
        System.out.println(this.getNome() + " está latindo.");
    }
    
}
