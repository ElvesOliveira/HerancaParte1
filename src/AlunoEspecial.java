
public class AlunoEspecial extends Aluno {

    private String disciplina;
    private String grau;

    public AlunoEspecial(String disciplina, String grau, String nome, String matricula) {
        super(nome, matricula);
        this.disciplina = disciplina;
        this.grau = grau;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }
    
    
    
}
