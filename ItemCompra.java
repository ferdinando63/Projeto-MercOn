package mercon;

public class ItemCompra {
    public Produto produto;
    public int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemCompra() {
    }
    
    public double valorTotal(){
        return this.produto.getPreco() * this.quantidade;
    }
}