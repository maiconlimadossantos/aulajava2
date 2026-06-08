package Interface;

public class exerciciointerface1 {
    AreaCalculavel[] formas = new AreaCalculavel[5];
    public exerciciointerface1() {
        formas[0] = new Quadrado(4);
        formas[1] = new Retangulo(3, 5);
        formas[2] = new Circulo(2);
        formas[3] = new Quadrado(6);
        formas[4] = new Retangulo(2, 4);
        System.err.println("--- Áreas calculadas ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Área da forma " + (i + 1) + ": " + formas[i].calculaArea());
            
        }
    }
}
/* Faça o que pede a questão. a) Crie um projeto interfaces e crie a interface AreaCalculavel com o método calculaArea() - sem parâmetros e que retorna um double. b) Queremos criar algumas classes que implementam AreaCalculavel: I. Quadrado: possui um atributo lado. II. Retangulo: possui os atributos base e altura. III. Circulo: possui o atributo raio. c) Crie uma classe de Teste. No método main crie um vetor de 5 posições que contém alguns objetos do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto. 
 */