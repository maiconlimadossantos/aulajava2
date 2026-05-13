package Herança;

public class Livro extends Publicacao {
    private String isbn;
    private  int numeroPaginas;

    public Livro(String titulo, String autor, int id ,String isbn, int numeroPaginas) {
         super(titulo, autor, id);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }
    public Livro(String titulo, String autor, int id, String isbn2, double numeroPaginas2) {
        //TODO Auto-generated constructor stub
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
        @Override
        public String exibirFicha() {
            return super.exibirFicha() + "\nISBN: " + this.isbn + "\nNúmero de Páginas: " + this.numeroPaginas;
        }
    
}
