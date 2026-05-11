package Herança;
import Herança.Animal;
import Herança.Cachorro;
import Herança.Gato;

public class Exercicios3_POO_Herança {
    public static void main(String[] args) {
        // Exercício 1
        Cachorro cachorro = new Cachorro("Rex", 5, "Labrador");
        Gato gato = new Gato("Mia", 3, "Siamês");
        
        System.out.println(cachorro.exibirDados());
        System.out.println(gato.exibirDados());
        
        // Exercício 2
        Normal ingressoNormal = new Normal(50.0);
        Vip ingressoVip = new Vip(50.0, 20.0);
        
        ingressoNormal.imprimeTipo();
        System.out.println("Valor do Ingresso VIP: " + ingressoVip.getValorVip());
    }
    
}