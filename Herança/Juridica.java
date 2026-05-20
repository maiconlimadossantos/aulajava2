package Herança;

public class Juridica extends Pessoa {
    private String cnpj; 
      private String razãosocia;
 
 
 
 
     public Juridica(String nome, String endereco,  String cnpj,String razãosocia ) {
         super(nome, endereco);
         this.cnpj = cnpj;
         this.razãosocia=razãosocia;
     }
 
 
 
 
     public String getcnpj() {
         return cnpj;
     }
 
 
 
 
     public void setcnpj(String cnpj) {
         this.cnpj = cnpj;
     }
     public String getrazãosocia(){
         return razãosocia;
     }
     public void setrazãosocia(String razãosocia){
         this.razãosocia=razãosocia;
     }
     
     @Override
     public String exibirDados() {
         return super.exibirDados() + "cnpj: " + this.cnpj +"\nrazãosocia" +this.razãosocia;
     }
 
 
 }
 