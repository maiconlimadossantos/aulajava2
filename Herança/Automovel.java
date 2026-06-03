public class  Automovel extends Veiculo {
    private double potenciaDoMotor;


    public Automovel(String marca, int qtdRodas, String modelo, int velocidade ,double potenciaDoMotor) {
        super(marca, qtdRodas, modelo, velocidade);
        this.potenciaDoMotor=potenciaDoMotor;
    }
    public double getpotenciaDoMotor(){
        return potenciaDoMotor;
    }
    public void setpotenciaDoMotor(double potenciaDoMotor){
        this.potenciaDoMotor=potenciaDoMotor;
    }
    @Override
    public void imprimirInformacoes(){
     super.imprimirInformacoes();
        System.out.println("qual a potencia do motor ="+ this.potenciaDoMotor);
        
     
    }

}
