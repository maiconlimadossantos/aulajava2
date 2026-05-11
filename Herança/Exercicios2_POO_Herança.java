package Herança;


import java.util.Scanner;

public class Exercicios2_POO_Herança{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Cadastro de Imóvel ---");
        System.out.print("Digite o endereço: ");
        String end = entrada.nextLine();
        System.out.print("Digite o preço base: ");
        double preco = entrada.nextDouble();
        
        System.out.print("Digite 1 para Imóvel NOVO ou 2 para VELHO: ");
        int opcao = entrada.nextInt();
        
        if (opcao == 1) {
            System.out.print("Digite o valor adicional: ");
            double adicional = entrada.nextDouble();
            Novo imovelNovo = new Novo(end, preco, adicional);
            System.out.println(imovelNovo.imprimirAdicional());
        } else if (opcao == 2) {
            System.out.print("Digite o valor do desconto: ");
            double desconto = entrada.nextDouble();
            Velho imovelVelho = new Velho(end, preco, desconto);
            System.out.println(imovelVelho.imprimirDesconto());
        } else {
            System.out.println("Opção inválida!");
        }
        
        entrada.close();
    }
}


/*package Herança;

Crie a classe Imovel, que possui um endereço e um preço.
a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de
acesso e impressão deste valor adicional.
b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
acesso e impressão para este desconto.
No método de execução, crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para
velho. Conforme a definição do usuário, imprima o valor final do imóvel.
    

 */