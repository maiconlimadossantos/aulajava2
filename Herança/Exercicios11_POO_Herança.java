public class Exercicios11_POO_Herança {
    Bicicleta bicicleta1 = new Bicicleta("Caloi", 2, "Mountain Bike", 0);
    Automovel automovel1 = new Automovel("Fiat", 4, "Uno", 0, 1.0);
     Carro carro1 = new Carro("Fiat", 4, "Uno", 0, 1.0, 4);
     Moto moto1 = new Moto("Honda", 2, "CG", 0, 150.0, true);
     
     
}
/*Crie um projeto no Netbeans chamado MeiosDeTransporte.
1) No projeto MeiosDeTransporte, crie um pacote chamado br.edu.ifrn.meiostransporte.dominio e construa as
classes de modo que obedeçam os relacionamentos apresentados no diagrama abaixo:
 Crie o construtor para cada uma das classes e os métodos get e set para cada um dos atributos das
classes.
 O método acelerar da classe Veiculo deve somar o valor passado por parâmetro da velocidadeAtual do
veículo
 O método frear da classe Veiculo deve subtrair o valor passado por parâmetro da velocidadeAtual do
veículo.
 O método imprimirInformacoes de cada uma das classes deve exibir na tela o conteúdo de cada um dos
atributos da classe. */