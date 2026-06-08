package Interface;

public class SeguroDeVida implements Tributavel {
    private double valorApolice;

    public SeguroDeVida(double valorApolice) {
        this.valorApolice = valorApolice;
    }

    public double getValorApolice() {
        return valorApolice;
    }
    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
    }
    
    @Override
    public double calculaTributos() {
        return 42.00; // Taxa fixa
    }

}
