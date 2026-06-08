package Static;

public class ExercicioStatic4 extends ExercicioStatic3 {
    private String cor;
    private String marca;

    public ExercicioStatic4(String nome, double preco, int quantidade, ExercicioStatic5 fornecedor, String cor, String marca) {
        // Chama o construtor da classe mãe (Produto)
        super(nome, preco, quantidade, fornecedor);
        this.cor = cor;
        this.marca = marca;
    }

    // b. Implementar os métodos Get e Set
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    // d. Sobrescrever o método imprimir adicionando as novas propriedades
    @Override
    public void imprimir() {
        super.imprimir(); // Imprime as propriedades da classe mãe (Produto)
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
    }
}
/*4) Implementar a classe Tinta que deriva da classe produto. a. Adicionar a propriedade Cor e Marca. b. Implementar os métodos Get e Set. c. Implementar o construtor. d. Sobrescrever o método imprimir da classe mãe adicionando as novas propriedades.
 */