public class Exercicios12_POO_Herança {
    Fatura fatura1 = new Fatura("001", "Mouse", 2, 50.0);
    Empregado empregado1 = new Empregado("Maria", "Silva", 3000.0);
        Data data1 = new Data(10, 5, 2024);
        
}
/*1. (Deitel Java 3.13) Crie uma classe em Java chamada fatura para uma loja de
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a
descrição (String), a quantidade comprada de um item (int) e o preço por item (double). A
classe deve ter um construtor e um método get e set para cada variável de instância. Além
disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois
retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como
0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um
aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra as capacidades
da classe Fatura.
2. (Deitel Java 3.14) Crie uma classe em Java chamada Empregado que inclui três partes
de informações como variáveis de instância – nome (String), sobrenome (String) e um
salário mensal (double). A classe deve ter um construtor, métodos get e set para cada
variável de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria
dois objetos Empregado e exibe o salário anula de cada objeto. Então dê a cada
Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.
3. (Deitel Java 3.15)Crie uma classe em Java chamada Data que inclui três informações
como variáveis de instância – mês (int), dia (int) e ano (int). A classe deve ter métodos get e
set para cada variável e um construtor que inicializa as variáveis e assume que os valores
fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano
separados por barras normais. */