package Static;

public class ExercicioStatic5 {
    private String nome;
    private String celular;

    public ExercicioStatic5(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }   
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Celular: " + celular);
    }
}
/* 5) Implementar a classe Fornecedor, com as propriedades nome e celular. a. Implementar construtor b. Métodos Get e Set. c. Adicionar a classe Produto a propriedade fornecedor do tipo Fornecedor. 
 */