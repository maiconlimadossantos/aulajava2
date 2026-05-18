package Herança;

public class Mensagem {
    private String destinatario;
    private String conteudo;

    public Mensagem(String destinatario, String conteudo) {
        this.destinatario = destinatario;
        this.conteudo = conteudo;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public String Enviar() {
        return "Enviando mensagem para " + this.destinatario + ": " + this.conteudo;
    }
}
