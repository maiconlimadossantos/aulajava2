public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
        public void aumentarSalario(double percentual) {
            salarioMensal += salarioMensal * percentual / 100;
        }
        public String toString() {
            return "Empregado: " + nome + " " + sobrenome + ", Salário Mensal: " + salarioMensal;
        }
        public void exibirSalarioAnual() {
            System.out.println("Salário Anual de " + nome + " " + sobrenome + ": " + calcularSalarioAnual());
        }
        public void exibirSalarioAnualComAumento() {
            System.out.println("Salário Anual de " + nome + " " + sobrenome + " após aumento: " + calcularSalarioAnual());
        }
       
}
/*(Deitel Java 3.14) Crie uma classe em Java chamada Empregado que inclui três partes
de informações como variáveis de instância – nome (String), sobrenome (String) e um
salário mensal (double). A classe deve ter um construtor, métodos get e set para cada
variável de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria
dois objetos Empregado e exibe o salário anula de cada objeto. Então dê a cada
Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado. */