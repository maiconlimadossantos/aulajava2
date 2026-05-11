package Herança;

public class Exercicios5_POO_Herança {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Rua A, 123");
        System.out.println(pessoa.exibirDados());
        
        Fisica fisica = new Fisica("Maria", "Rua B, 456", "123.456.789-00", "01/01/1990");
        System.out.println(fisica.exibirDados());
        System.out.println("Idade: " + fisica.calcularIdade() + " anos");
        
        Juridica juridica = new Juridica("Empresa XYZ", "Rua C, 789", "12.345.678/0001-00", "Empresa XYZ Ltda.");
        System.out.println(juridica.exibirDados());
    }
    
}
/* Implemente uma classe Pessoa que possui como atributo nome, endereço, e o método
exibirDados() que retorna uma string.
Crie uma subclasse chamada Fisica que herda de Pessoa, possui como atributos cpf e
dataNascimento, e os métodos: exibirDados() que retorna string e calcularIdade() que retorna
int.
No mesmo nível da hierarquia, crie uma classe chamada Juridica, que estende a Pessoa,
acrescentando os atributos cnpj e razão social, e como métodos, exibirDados() que retorna
string.
No método main, crie instâncias das três classes e analise o comportamento do método
exibirDados().