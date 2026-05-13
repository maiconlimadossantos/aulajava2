package Herança;

public class Publicacao {
    private String titulo;
    private String autor;
    private int id;

    public Publicacao(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String exibirFicha( ) {
        return "Título: " + this.titulo + "\nAutor: " + this.autor ;
    }
}
