package Herança;

public class Imovel {
   private  String endereco;
   private  double preco;
   
   public Imovel(String endereco,double preco){
    this.endereco=endereco;
    this.preco=preco;
   }
   public String getendereco(){
    return endereco;
   }
   public  void setEndereco(String endereco){
    this.endereco=endereco;
   }
   public double getpreco(){
    return preco;
   }
   public void setpreco(double preco){
    this.preco=preco;
   }
   public double calcularPrecoFinal(){
    return preco;
   }
   public  void  impressão(){
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Preço: " + this.preco);
   }
}
/*package Herança;

Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de
acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
acesso e impressão para este desconto.
No método de execução, crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para
velho. Conforme a definição do usuário, imprima o valor final do imóvel.
    
}
 */