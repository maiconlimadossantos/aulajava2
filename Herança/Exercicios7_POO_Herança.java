package Herança;

public class Exercicios7_POO_Herança {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien", 1, "978-0547928227", 310);
        System.out.println(livro.exibirFicha());
        LivroFisico livroFisico = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1, "978-0544003415", 1216, 1500, "Estante A3");
        System.out.println(livroFisico.exibirFicha());
        System.out.println("Frete para 100 km: R$ " + livroFisico.calcularfrete(100));
        
        Ebook ebook = new Ebook("1984", "George Orwell", 2, "978-0451524935", 328, 2.5, "PDF");
        System.out.println(ebook.exibirFicha());
        System.out.println("Link de Download: " + ebook.gerarLinkDownload());
    }
    
}
/*Crie uma classe base chamada Publicacao:
- id: int
- titulo: string
- autor: string
Método:
+ exibirFicha( ) que retorna uma string com título e o autor.
Subclasse Livro que herda de Publicacao:
- isbn: string
- numeroPaginas: int
Métodos:
+ exibirFicha() sobrescrever a hierarquia acima, concatenando ISBN e número de
páginas.
Subclasse LivroFisico que herda de Livro:
- localizacaoEstante: string
- pesoGramas: int
Métodos:
+ calcularfrete(double distanciaKm) que retorna o frete baseado no peso (peso * km *
0,05)
+ exibirFicha() que sobrescrever a hierarquia acima, adicionando localizacao e peso
Subclasse Ebook que herda de Livro:
- tamanhoMB: double
- formatoArquivo: string
Métodos:
+ gerarLinkDownload( ) que retorna uma string simulando um link (ex.:
https://biblioteca.com/download/titulo)
+ exibirFicha( ) que sobrescreva o método da hierarquia acima, adicionando o tamanho
e formato.
Exercício 8: Crie uma Cl */