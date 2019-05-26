public class Pessoa {
   
    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa(String nome, String endereco, String telefone){
        
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void mostrar(){
    System.out.println(getNome());
    System.out.println(getEndereco());
    System.out.println(getTelefone());
    }
}