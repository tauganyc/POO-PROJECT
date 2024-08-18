package sistema;

import entidade.Livro;
import entidade.Usuario;

import java.io.*;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (livros.contains(livro)) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("entidade.Livro não disponível para empréstimo.");
        }
    }

    public void salvarDados(String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Livro livro : livros) {
                writer.write(livro.getTitulo() + "," + livro.getAutor() + "," + livro.getIsbn());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public void carregarDados(String caminhoArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                livros.add(new Livro(dados[0], "Desconhecida", dados[1], dados[2]));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }

    public void exibirLivros() {
        for (Livro livro : livros) {
            livro.exibirInformacoes();
        }
    }

    public void exibirUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.exibirInformacoes();
        }
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            emprestimo.exibirInformacoes();
        }
    }
}
