
public class Empregado extends Pessoa {
    
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado (String nome, String endereco, String telefone, double salarioBase, double imposto){
        super(nome, endereco, telefone);
        setCodigoSetor(1);
        setSalarioBase(1500);
        setImposto(0.075);
    }
    
    public double CalcSalario(){
        return getSalarioBase()-(getSalarioBase()*getImposto());
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(getCodigoSetor());
        System.out.println(getSalarioBase());
        System.out.println(getImposto());
        System.out.println(CalcSalario());
        
    }
}
