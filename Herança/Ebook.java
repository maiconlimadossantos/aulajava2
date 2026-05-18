package Herança;

public class Ebook extends Livro {
    private double tamanhoMB;
    private String formatoArquivo;

    public Ebook(String titulo, String autor,int id, String isbn,double numeroPaginas,double tamanhoMB,String formatoArquivo) {
        super(titulo, autor,id, isbn, numeroPaginas);
        this.tamanhoMB=tamanhoMB;
        this.formatoArquivo=formatoArquivo;
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }
    public void setTamanhoMB(double tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }
    public String getFormatoArquivo() {
        return formatoArquivo;
    }
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }
    
     @Override
     public String exibirFicha() {
         return super.exibirFicha() + "\nTamanho (MB): " + this.tamanhoMB + "\nFormato do Arquivo: " + this.formatoArquivo;
     }
     public String gerarLinkDownload() {
         return "https://biblioteca.com/download/" + this.getTitulo().replaceAll(" ", "_");
     }
    
}
