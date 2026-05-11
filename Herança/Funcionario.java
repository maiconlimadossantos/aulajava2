package Herança;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Funcionario {


    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome,double salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public double getsalarioBase(){
        return salarioBase;
    }
    public void setsalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    
    public String exibirDados(){
        return "Nome: "+ nome + " Salario Base: "+ salarioBase;
    }
    public double calcularSalario(int diasTrabalhados){
        double valorDia = salarioBase / 30; 
        return valorDia * diasTrabalhados;
    }


   
   
    
}
