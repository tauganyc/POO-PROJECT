package sistema;

import java.time.LocalDate;
import entidade.*;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusWeeks(2); // Exemplo de empréstimo por 2 semanas
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void exibirInformacoes() {
        System.out.println("Empréstimo: " + livro.getTitulo() + " para " + usuario.getNome() +
                ". Data de Empréstimo: " + dataEmprestimo + ", Data de Devolução: " + dataDevolucao);
    }
}
