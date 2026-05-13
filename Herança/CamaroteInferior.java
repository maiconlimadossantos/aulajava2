package Herança;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(String nome, double valor, String localizacao) {
        super(nome, valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
