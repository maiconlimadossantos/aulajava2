public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoPorItem;
    public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    public double getPrecoPorItem() {
        return precoPorItem;
    }
    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
    public double getTotalFatura() {
        double total = quantidadeComprada * precoPorItem;
        if (total < 0) {
            total = 0;
        }
        if (precoPorItem < 0) {
            precoPorItem = 0.0;
        }
        return total;
    }
    public void imprimirInformacoes(){
        System.out.println("numero ="+ this.numero);
        System.out.println("descricao ="+ this.descricao);
        System.out.println("quantidade comprada ="+ this.quantidadeComprada);
        System.out.println("preco por item ="+ this.precoPorItem);
        System.out.println("total da fatura ="+ this.getTotalFatura());
    }
    
}
/*1. (Deitel Java 3.13) Crie uma classe em Java chamada fatura para uma loja de
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a
descrição (String), a quantidade comprada de um item (int) e o preço por item (double). A
classe deve ter um construtor e um método get e set para cada variável de instância. Além
disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois
retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como
0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um
aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra as capacidades
da classe Fatura. */