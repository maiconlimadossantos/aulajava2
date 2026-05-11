package Herança;
import Herança.Animal;
import Herança.Cachorro;
import Herança.Gato;

public class Exercicios3_POO_Herança {
    public static void main(String[] args) {
        // Exercício 1
        Cachorro cachorro = new Cachorro("Rex", 5, "Labrador");
        Gato gato = new Gato("Mia", 3, "Siamês");
        
        System.out.println(cachorro.caminhar());
        System.out.println(gato.caminhar());
        
        
        
    }
    
}