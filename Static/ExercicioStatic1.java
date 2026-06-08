package Static;

public class ExercicioStatic1 {
    private double valor1;
    private double valor2;

    public ExercicioStatic1(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    public double soma() {
        return valor1 + valor2;
    }
    public double subtrai() {
        return valor1 - valor2;
    }
    public double multiplica() {
        return valor1 * valor2;
    }
    public double divide() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}
/*1) Implementar uma classe Matematica, para armazenar dois valores. Implementar para esta classe também. a. Construtor com entrada de dois valores. b. Métodos Get para os dois valores c. Métodos Set para os dois valores; d. Método soma, que retorna a soma dos valores. e. Método subtrai, que retorna à subtração dos valores. f. Métodos multiplica quer retorna à multiplicação dos valores; g. Método divide, que retorna a divisão dos valores.   */