public class Emprestimo {
    private Usuario usuario;
    private Livro9  livro;
    private String  dataEmprestimo;
    private String   dataDevolucao;
    
    public Emprestimo(Usuario usuario,Livro9 Livro,String dataEmprestimo, String  dataDevolucao ){
        this.usuario=usuario;
        this.livro=livro;
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
    }
     public String realizarEmprestimo(){
         return "o nome usuario"+this.usuario.getNome()+"o titulo do livro"+this.Livro9.getTitulo()+"data do emprestimo"+this.dataEmprestimo;
     }
    public String devolverLivro(){
        return "o nome usuario"+this.usuario.getNome()+"o titulo do livro"+this.Livro9.getTitulo()+"data da devolucao"+this.dataDevolucao;
    }
    public String exibirEmprestimo(){
        return "o nome usuario"+this.usuario.getNome()+"o titulo do livro"+this.Livro9.getTitulo()+"data do emprestimo"+this.dataEmprestimo+"data da devolucao"+this.dataDevolucao;
    }

}
