package Herança;
import Herança.Animal;
import Herança.Cachorro;
import Herança.Gato;

public class Exercicios3_POO_Herança {
    Animal animal = new Animal("turca", "vira-lata");
    Cachorro meucao = new Cachorro("Rex", "Labrador");
    meucao.latir();
    meucao.caminhar();
    Gato meugato = new Gato("Mia", "Siamês", "Cinza");
    meugato.miar();
    meugato.caminhar();
    
    
}