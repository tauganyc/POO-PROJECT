package entidade;

public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String id, String departamento) {
        super(nome, id);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("entidade.Professor: " + nome + ", ID: " + id + ", Departamento: " + departamento);
    }
}