package Static;

import java.util.ArrayList;

public class ExercicioStatic6 {
    private int numero;
    private String nomeCorredor;
    // b. Propriedade produtos que deve ser uma ArrayList de Produto
    private ArrayList<ExercicioStatic3> produtos;

    // c. Implementar Construtor
    public ExercicioStatic6(int numero, String nomeCorredor) {
        this.numero = numero;
        this.nomeCorredor = nomeCorredor;
        this.produtos = new ArrayList<>(); // Inicializa a lista vazia
    }

    // d. Implementar os métodos Get e Set
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNomeCorredor() { return nomeCorredor; }
    public void setNomeCorredor(String nomeCorredor) { this.nomeCorredor = nomeCorredor; }

    public ArrayList<ExercicioStatic3> getProdutos() { return produtos; }
    public void setProdutos(ArrayList<ExercicioStatic3> produtos) { this.produtos = produtos; }

    // Método auxiliar para facilitar a adição de produtos na prateleira
    public void adicionarProduto(ExercicioStatic3 p) {
        this.produtos.add(p);
    }

    // e. Implementar o método listaprodutos
    public void listaprodutos() {
        System.out.println("=== Produtos na Prateleira N° " + this.numero + " (Corredor: " + this.nomeCorredor + ") ===");
        if (produtos.isEmpty()) {
            System.out.println("A prateleira está vazia.");
        } else {
            for (ExercicioStatic3 p : produtos) {
                p.imprimir();
                System.out.println("------------------------");
            }
        }
    }

    // f. Implementar o método busca produto (por nome)
    // Retorna o objeto Produto caso encontre, ou null caso contrário
    public ExercicioStatic3 buscaProduto(String nomeBuscado) {
        for (ExercicioStatic3 p : produtos) {
            // equalsIgnoreCase compara ignorando maiúsculas e minúsculas
            if (p.getNome().equalsIgnoreCase(nomeBuscado)) {
                return p;
            }
        }
        return null; // Caso não encontre nenhum produto com esse nome
    }
}
/*6) Implementar a classe Prateleira. a. Implementar as propriedades Numero e NomeCorredor b. Implementar a propriedade produtos que deve ser uma ArrayList de Produto. c. Implementar Construtor. d. Implementar os métodos Get e Set e. Implementar o método listaprodutos. f. Implementar o método busca produto.
 */