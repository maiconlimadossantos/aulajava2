package Interface;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos = 0;

    public void processarTributavel(Tributavel tributavel) {
        double tributos = tributavel.calculaTributos();
        totalTributos += tributos;
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}
