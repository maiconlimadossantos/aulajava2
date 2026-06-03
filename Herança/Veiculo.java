public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;
    
    public Veiculo(String marca,int qtdRodas,String modelo,int velocidade){
        this.marca=marca;
        this.qtdRodas=qtdRodas;
        this.modelo=modelo;
        this.velocidade=0;
    }
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    public int getqtdRodas(){
        return qtdRodas;
    }
    public void setqtdRodas(int qtdRodas){
        this.qtdRodas=qtdRodas;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }
    public int getvelocidade(){
        return velocidade;
    }
    public void setmarca(int velocidade){
        this.velocidade=velocidade;
    }
    
    public void imprimirInformacoes(){
        System.out.println("Informações dos veiculo");
        System.out.println("A marca do veiculo ="+ this.marca);
        System.out.println("quantas rodas possui ="+ this.qtdRodas);
        System.out.println("o modelo do veiculo ="+ this.modelo);
        System.out.println("A velocidade do veiculo ="+this.velocidade);
        System.out.println("-----------------------------------------");
    }
    public void acelerar(int valor){
        System.out.println("acelerando o veiculo="+valor);
    }
    public void frear(int valor){
        System.out.println("freando o veiculo="+valor);
    }

}
/*Crie um projeto no Netbeans chamado MeiosDeTransporte.
1) No projeto MeiosDeTransporte, crie um pacote chamado br.edu.ifrn.meiostransporte.dominio e construa as
classes de modo que obedeçam os relacionamentos apresentados no diagrama abaixo:
 Crie o construtor para cada uma das classes e os métodos get e set para cada um dos atributos das
classes.
 O método acelerar da classe Veiculo deve somar o valor passado por parâmetro da velocidadeAtual do
veículo
 O método frear da classe Veiculo deve subtrair o valor passado por parâmetro da velocidadeAtual do
veículo.
 O método imprimirInformacoes de cada uma das classes deve exibir na tela o conteúdo de cada um dos
atributos da classe. */