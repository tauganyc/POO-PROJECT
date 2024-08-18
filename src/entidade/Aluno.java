package entidade;

public class Aluno extends Usuario {
    private String curso;

    public Aluno(String nome, String id, String curso) {
        super(nome, id);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("entidade.Aluno: " + nome + ", ID: " + id + ", Curso: " + curso);
    }
}
