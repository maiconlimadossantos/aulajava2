package Herança;

public class SMS extends Mensagem {
    public SMS(String destinatario, String conteudo) {
        super(destinatario, conteudo);
    }
    
    @Override
    public String Enviar() {
        if (this.getConteudo().length() > 160) {
            return "Erro: SMS muito longo";
        } else {
            return "Enviando SMS para " + this.getDestinatario();
        }
    }
    
}
/*Subclasse SMS que estende Mensagem:
sobrescreve enviar() que verifica se o conteúdo tem mais de 160 caracteres. Se tiver,
imprime: “Erro: SMS muito longo”. Se não, imprime “Enviando SMS para [destinatário]”. */