
public class ProfessorHorista extends Professor {
        
    private double numeroHoras;
    private double valorHora;
    private double salario;
    
    public ProfessorHorista(String nome, int idade, String numeroMatricula, double numeroHoras, double valorHora){
        super(nome, idade, numeroMatricula);
        setNumeroHoras(40);
        setValorHora(15);
    }
    
    public void setSalario(double s){
        this.salario = (this.numeroHoras*this.valorHora);
    }
    
    public double getSalario(){
        return salario;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}
