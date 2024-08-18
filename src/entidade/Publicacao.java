package entidade;

public abstract class Publicacao {
    protected String titulo;
    protected String dataPublicacao;

    public Publicacao(String titulo, String dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public abstract void exibirInformacoes();
}
