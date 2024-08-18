package main;
import sistema.Biblioteca;
import entidade.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Java Programming", "2020", "James Gosling", "123456789");
        Livro livro2 = new Livro("Design Patterns", "1994", "Erich Gamma", "987654321");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario aluno = new Aluno("Maria Silva", "A001", "Ciência da Computação");
        Usuario professor = new Professor("João Pereira", "P001", "Engenharia de Software");

        biblioteca.adicionarUsuario(aluno);
        biblioteca.adicionarUsuario(professor);

        biblioteca.realizarEmprestimo(aluno, livro1);
        biblioteca.realizarEmprestimo(professor, livro2);

        biblioteca.exibirLivros();
        biblioteca.exibirUsuarios();
        biblioteca.exibirEmprestimos();

        // Salvando dados em arquivo
        biblioteca.salvarDados("biblioteca.txt");

        // Carregando dados de arquivo
        biblioteca.carregarDados("biblioteca.txt");
        biblioteca.exibirLivros();
    }
}
