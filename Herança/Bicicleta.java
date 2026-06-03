public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;


    public Bicicleta(String marca, int qtdRodas, String modelo, int velocidade,int numMarchas,boolean bagageiro ) {
        super(marca, qtdRodas, modelo, velocidade);
        this.numMarchas=numMarchas;
        this.bagageiro=bagageiro;
    }
    public int getnumMarchas(){
        return numMarchas;
    }
    public void setnumMarchas(int numMarchas){
        this.numMarchas=numMarchas;
    }
     public boolean getbagageiro(){
        return bagageiro;
    }
    public void setbagageiro(boolean bagageiro){
        this.bagageiro=bagageiro;
    }
    @Override
    public void imprimirInformacoes(){
     super.imprimirInformacoes();
        System.out.println("quantas marchas possui ="+ this.numMarchas);    
        System.out.println("possui bagageiro ="+ this.bagageiro);
    }

}
