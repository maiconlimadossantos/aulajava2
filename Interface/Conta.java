package Interface;

public class Conta {
    private double saldo;
    private String numero;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }
}
/*Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar um sistema para isso. a) Crie uma interface Tributavel que possui o método calculaTributos(), que retorna um double. b) Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais. c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo da conta. d) Vamos criar uma classe TestaTributavel com um método main para testar o nosso exemplo. 
 */