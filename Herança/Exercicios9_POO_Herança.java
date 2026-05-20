



public class Exercicios9_POO_Herança {
            public static void main(String[] args) {
            
            Usuario usuario = new Usuario("João", "123.456.789-00");
            Livro9 livro = new Livro9("O Senhor dos Anéis", "J.R.R. Tolkien");
            Emprestimo emprestimo = new Emprestimo(usuario, livro, "01/01/2024", "15/01/2024");
            
            emprestimo.realizarEmprestimo();
            emprestimo.exibirEmprestimo();
            
            emprestimo.devolverLivro();
        }
}
/*Classe Usuario
Atributos:
● nome
● cpf
Métodos:
● construtor
● getters e setters
● exibirDados()
Classe Livro
Atributos:
● titulo
● autor
Métodos:
● construtor
● getters e setters
● exibirDados()
Classe Emprestimo
Atributos:
● Usuario usuario
● Livro livro
● String dataEmprestimo
● String dataDevolucao
Métodos:
● realizarEmprestimo()
● devolverLivro()
● exibirEmprestimo()
Regras
O método realizarEmprestimo() deve exibir uma mensagem informando:
● o nome do usuário;
● o título do livro;
● a data do empréstimo. */