package Herança;

public class CamaroteSuperior extends Vip {
    private String localizacao;

    public CamaroteSuperior(String nome, double preco,double valorAdicional, String localizacao) {
        super(nome, preco,valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + "\nLocalização: " + localizacao;
    }
    
}
