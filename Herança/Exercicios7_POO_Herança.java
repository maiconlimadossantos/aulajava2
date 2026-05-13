package Herança;

public class Exercicios7_POO_Herança {
    
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