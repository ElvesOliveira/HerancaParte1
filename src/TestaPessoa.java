
public class TestaPessoa {
    public static void main(String []Args){
    
        Pessoa P = new Pessoa ("Jose", "Rua A", "111-1111");
        Fornecedor F = new Fornecedor ("Pedro","Rua B","222-2222",500,100);
        Empregado E = new Empregado ("Joao", "Rua C", "333-333", 1500,0.075);
        
        P.mostrar();
        F.mostrar();
        E.mostrar();
    }
}
