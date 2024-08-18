package entidade;

public class Usuario {
    protected String nome;
    protected String id;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void exibirInformacoes() {
        System.out.println("Usuário: " + nome + ", ID: " + id);
    }
}
