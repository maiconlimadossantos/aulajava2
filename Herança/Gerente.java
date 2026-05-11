package Herança;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario {
    private String setor;
    private double bonus;


    public Gerente(String nome, double salarioBase,String setor,double bonus) {
        super(nome, salarioBase);
        this.setor=setor;
        this.bonus=1000;
    }
     public String getsetor(){
        return setor;
    }
    public void setsetor(String nome){
        this.setor=setor;
    }
    public double getbonus(){
        return bonus;
    }
    public void setbonus(double bonus){
        this.bonus=bonus;
    }
    @Override
    public String  exibirDados(){
        return super.exibirDados()+" | Setor: " + this.setor + "| Bonus: " +this.bonus;
    }
    @Override
    public double calcularSalario(int diasTrabalhados){
        return super.calcularSalario(diasTrabalhados) + this.bonus;
        
    }
    
    
    
}
