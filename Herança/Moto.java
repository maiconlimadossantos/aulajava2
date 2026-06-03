public class Moto extends Automovel {
    private boolean partidaEletrica;


    public Moto(String marca, int qtdRodas, String modelo, int velocidade, double potenciaDoMotor ,boolean partidaEletrica) {
        super(marca, qtdRodas, modelo, velocidade, potenciaDoMotor);
        this.partidaEletrica=partidaEletrica;
    }
    
     public boolean getpartidaEletrica(){
        return partidaEletrica;
    }
    public void setpartidaEletrica(boolean partidaEletrica){
        this.partidaEletrica=partidaEletrica;
    }
    @Override
     public void imprimirInformacoes(){
     super.imprimirInformacoes();
        System.out.println("possui partida eletrica ="+ this.partidaEletrica);
     
    }

}
