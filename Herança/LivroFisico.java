package Herança;

public class LivroFisico extends Livro {
    private int pesoGramas;
    private String localizacaoEstante;
    
    

    public LivroFisico(String titulo, String autor,int id, String isbn,double numeroPaginas,int pesoGramas,String localizacaoEstante) {
        super(titulo, autor,id, isbn, numeroPaginas);
        this.pesoGramas=pesoGramas;
        this.localizacaoEstante=localizacaoEstante;
    }

    public int getPesoGramas() {
        return pesoGramas;
    }
    public void setPesoGramas(int pesoGramas) {
        this.pesoGramas = pesoGramas;
    }
    public String getLocalizacaoEstante() {
        return localizacaoEstante;
    }
    public void setLocalizacaoEstante(String localizacaoEstante) {
        this.localizacaoEstante = localizacaoEstante;
    }
    public double calcularfrete(double distanciaKm) {
        return pesoGramas * distanciaKm * 0.05; // Exemplo de cálculo de frete
    }
    @Override
    public String exibirFicha() {
        return super.exibirFicha() + "\nPeso (g): " + this.pesoGramas + "\nLocalização na Estante: " + this.localizacaoEstante;
    }
}
