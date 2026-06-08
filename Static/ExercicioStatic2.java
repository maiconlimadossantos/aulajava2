package Static;

public class ExercicioStatic2 {
    public ExercicioStatic2() {
    }
    public double raizQuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Erro: Não existe raiz quadrada de número negativo nos Reais.");
            return Double.NaN;
        }
        return Math.sqrt(numero);
    }
    public boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se achar algum divisor, não é primo
            }
        }
        return true;
    }
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    public boolean isPar(int numero) {
        return numero % 2 == 0;
    }
    public boolean isImpar(int numero) {
        return numero % 2 != 0;
    }
}
/*2) Implementar uma classe Calculadora. Implementar para esta classe também. a. Construtor b. Método para calcular raiz quadrada c. Método para calcular se o número é primo d. Método para calcular potência de um numero e. Método para calcular se número e par f. Método para calcular se número e ímpar. 
 */