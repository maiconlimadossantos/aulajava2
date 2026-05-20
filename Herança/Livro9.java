public class Livro9 {
    private String titulo;
    private String autor;
    public Livro9(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    public String getautor(){
        return autor;
    }
    public void setautor(String autor){
        this.autor=autor;
    }
    public String exibirDados(){
        return "O titulo do livro é"+this.titulo+ "\n o autor do livro"+this.autor;
    }
    

}
