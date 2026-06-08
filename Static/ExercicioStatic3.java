package Static;

public class ExercicioStatic3 {
    private static int contadorCodigo = 1;

    private String nome;
    private double preco;
    private int quantidade;
    private int codigo;

    private ExercicioStatic5 fornecedor;

    public ExercicioStatic3() {
        this.codigo = contadorCodigo++;
    }

    public ExercicioStatic3(String nome, double preco, int quantidade, ExercicioStatic5 fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.codigo = contadorCodigo++;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public ExercicioStatic5 getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(ExercicioStatic5 fornecedor) {
        this.fornecedor = fornecedor;
    }
    public void imprimir() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        if (fornecedor != null) {
            System.out.println("Fornecedor: " + fornecedor.getNome());
            System.out.println("Celular do Fornecedor: " + fornecedor.getCelular());
        }
    }
}
/*3) Implementar uma classe Produto, implementar para esta classe também. a. Propriedades: nome, preço, quantidade, codigo. b. Implementar os métodos Get e Set para todas as propriedades. c. Implementar 2 Construtores. Um se parâmetro e outro com todos. d. Implementar o método imprimir que lista todas as propriedades. e. O código deve ser auto incrementado a cada novo objeto. (static) 
 */