
public class ProfessorIntegral extends Professor {
    
    
        private double valorSalario;
    
    public ProfessorIntegral(String nome, int idade, String numeroMatricula, double valorSalario){
        super (nome, idade, numeroMatricula);
        setValorSalario(2000);
    }
    
    public void setValorSalario(double v){
        this.valorSalario=v;
    }
    
    public double getValorSalario(){
        return valorSalario;
    }
}
