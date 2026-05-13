package Herança;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(String nome, double valor, double valorAdicional,String localizacao) {
        super(nome, valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
