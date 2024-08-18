package entidade;

public class Livro extends Publicacao {
    private String autor;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, String autor, String isbn) {
        super(titulo, dataPublicacao);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("entidade.Livro: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Data: " + dataPublicacao);
    }
}
