package Herança;

public class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimirAdicional() {
        System.out.println("Adicional: " + this.adicional);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + this.adicional;
    }
    
}
