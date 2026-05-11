package Herança;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aluno
 */
public class Exercicios1_POO_Herança {
    public static void main(String[] args) {
        // Testando um funcionário comum
        Funcionario f1 = new Funcionario("João Silva", 3000.0);
        System.out.println(f1.exibirDados());
        System.out.println("Salário Final (20 dias): R$ " + f1.calcularSalario(20));


        System.out.println("--------------------------------------------------");


        // Testando um gerente
        Gerente g1 = new Gerente("Maria Souza", 5000.0, "TI", 1500.0);
        System.out.println(g1.exibirDados());
        System.out.println("Salário Final (30 dias + Bônus): R$ " + g1.calcularSalario(30));
    }
}
