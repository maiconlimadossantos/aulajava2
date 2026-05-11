package Herança;

import java.util.Scanner;

public class Exercicios4_POO_Herança {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do ingresso: ");
        double valorIngresso = scanner.nextDouble();
        
        Ingresso ingresso = new Ingresso(valorIngresso);
        
        System.out.print("Digite 1 para Normal e 2 para VIP: ");
        int tipoIngresso = scanner.nextInt();
        
        if (tipoIngresso == 1) {
            Normal ingressoNormal = new Normal(valorIngresso);
            ingressoNormal.imprimeTipo();
            System.out.println("Valor do ingresso: " + ingressoNormal.getValor());
        } else if (tipoIngresso == 2) {
            System.out.print("Digite o valor adicional para VIP: ");
            double valorAdicional = scanner.nextDouble();
            
            Vip ingressoVip = new Vip(valorIngresso, valorAdicional);
            
            System.out.print("Digite 1 para Camarote Superior e 2 para Camarote Inferior: ");
            int tipoCamarote = scanner.nextInt();
            
            if (tipoCamarote == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(valorIngresso, valorAdicional);
                System.out.println("VIP Camarote Superior");
                System.out.println("Valor do ingresso: " + camaroteSuperior.getValorVip());
            } else if (tipoCamarote == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior(valorIngresso, valorAdicional);
                System.out.println("VIP Camarote Inferior");
                System.out.println("Valor do ingresso: " + camaroteInferior.getValorVip());
            } else {
                System.out.println("Opção de camarote inválida.");
            }
        } else {
            System.out.println("Opção de ingresso inválida.");
        }
        
        scanner.close();
    }

}
/*Crie uma classe chamada Ingresso que possui um valor em reais e um método
imprimeValor().
a. crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
método que retorne o valor do ingresso VIP (com o adicional incluído).
b. crie uma classe Normal, que herda Ingresso e possui um método que imprime:
"Ingresso Normal".
c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos
para acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é
mais cara (possui valor adicional). Esta última possui um método para retornar o
valor do ingresso. Ambas as classes herdam a classe VIP
No método main: crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para
VIP. Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP. Se
for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote inferior.
Conforme a escolha do usuário, diga se que o VIP é camarote superior ou inferior.
Imprima o valor do ingresso.