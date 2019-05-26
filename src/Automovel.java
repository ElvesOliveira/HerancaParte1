
public class Automovel extends Terrestre {
    
    private String cor;
    private String numeroPortas;
    private String placa;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Automovel(String cor, String numeroPortas, String placa, int numeroDeRodas) {
        super(numeroDeRodas);
        this.cor = cor;
        this.numeroPortas = numeroPortas;
        this.placa = placa;
    }
    
    
}
