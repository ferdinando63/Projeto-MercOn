package mercon;

public interface AçoesCarrinho {
    
    public Object adicionarItem(String nome, double preco, Produto produto, int quantidade);
    public Object excluirItem(String nome, double preco, Produto produto, int quantidade);    
    public int consultarCarrinho(String nome, double preco, Produto produto, int quantidade);
    
}
