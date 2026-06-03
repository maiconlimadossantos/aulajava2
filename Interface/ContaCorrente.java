package Interface;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String numero ,double saldo, double limite) {
        super(numero,saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + getSaldo());
    }
}
