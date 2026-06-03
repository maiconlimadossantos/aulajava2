public class Carro extends Automovel {
    private int qtdPortas;


    public Carro(String marca, int qtdRodas, String modelo, int velocidade, double potenciaDoMotor ,int qtdPortas) {
        super(marca, qtdRodas, modelo, velocidade, potenciaDoMotor);
        this.qtdPortas=qtdPortas;
    }
    public int getqtdPortas(){
        return qtdPortas;
    }
    public void setqtdPortas(int qtdPortas){
        this.qtdPortas=qtdPortas;
    }
    @Override
     public void imprimirInformacoes(){
     super.imprimirInformacoes();
        System.out.println("quantas portas possui ="+ this.qtdPortas);
     
    }

}
