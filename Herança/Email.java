package Herança;

public class Email  extends Mensagem{
    private String assunto;
   

    public Email(String destinatario, String conteudo, String assunto) {
        super(destinatario, conteudo);
        this.assunto = assunto;
        
    }

    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    
     @Override
     public String Enviar() {
         return super.Enviar() + "\nAssunto: " + this.assunto + "\nEmail enviado com sucesso!";
     }
    
}
