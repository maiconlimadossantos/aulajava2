package Interface;

public class exerciciointerface3 {
    GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();    
        
            ContaCorrente contaCorrente = new ContaCorrente(1000);
            ContaPoupanca contaPoupanca = new ContaPoupanca(5000);
            SeguroDeVida seguroDeVida = new SeguroDeVida(20000);
    
            exercicio.gerenciador.processarTributavel(contaCorrente);
            exercicio.gerenciador.processarTributavel(contaPoupanca);
            exercicio.gerenciador.processarTributavel(seguroDeVida);
    
            System.out.println("Total de tributos: " + exercicio.gerenciador.getTotalTributos());
        }

/*Crie um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de uma pessoa e soma seus valores e inclua nele um método para devolver seu total. Essa classe deve ter um atributo para calcular a soma total dos tributos e um método adicionar(Tributavel) que recebe como parâmetro um Tributavel e soma os tributos dele ao total. Crie um main para instanciar diversas classes que implementam Tributavel e passar como argumento para um GerenciadorDeImpostoDeRenda. Repare que você não pode passar qualquer tipo de conta para o método adiciona, apenas as que implementam Tributavel.  */