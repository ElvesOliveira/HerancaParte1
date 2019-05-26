
public class AlunoPosGraduacao extends Aluno {
    
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public AlunoPosGraduacao(String disciplina, String nome, String matricula) {
        super(nome, matricula);
        this.disciplina = disciplina;
    }
    
    
}
