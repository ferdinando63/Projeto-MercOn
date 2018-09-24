package mercon;

import java.util.ArrayList;

public class Produto extends ItemCompra {
    private String nome;
    private double preco;
    
    ArrayList <Produto> produto = new ArrayList();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(Produto produto, int quantidade) {
        super(produto, quantidade);
    }
    
    public Produto(String nome, double preco, Produto produto, int quantidade) {
        super(produto, quantidade);
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(){
        Produto ItemCompra = new Produto();
        ItemCompra.setNome("Arroz");
        ItemCompra.setPreco(8.90);
        ItemCompra.setQuantidade(3);
        
        Produto produto1 = new Produto();
        ItemCompra.setNome("Açucar");
        ItemCompra.setPreco(7.50);
        ItemCompra.setQuantidade(3);
        
        Produto produto2 = new Produto();
        ItemCompra.setNome("Feijão");
        ItemCompra.setPreco(2.25);
        ItemCompra.setQuantidade(3);
        
        Produto produto3 = new Produto();
        ItemCompra.setNome("Biscoito");
        ItemCompra.setPreco(3.20);
        ItemCompra.setQuantidade(3);
        
        Produto produto4 = new Produto();
        ItemCompra.setNome("Suco");
        ItemCompra.setPreco(1.50);
        ItemCompra.setQuantidade(3);
        
        Produto produto5 = new Produto();
        ItemCompra.setNome("Carne");
        ItemCompra.setPreco(11.99);
        ItemCompra.setQuantidade(3);
        
        Produto produto6 = new Produto();
        ItemCompra.setNome("Sabonete");
        ItemCompra.setPreco(2.00);
        ItemCompra.setQuantidade(3);
        
        Produto produto7 = new Produto();
        ItemCompra.setNome("Shampoo");
        ItemCompra.setPreco(7.40);
        ItemCompra.setQuantidade(3);
        
        Produto produto8 = new Produto();
        ItemCompra.setNome("Escova de Dente");
        ItemCompra.setPreco(2.70);
        ItemCompra.setQuantidade(3);
        
        Produto produto9 = new Produto();
        ItemCompra.setNome("Cerveja");
        ItemCompra.setPreco(2.90);
        ItemCompra.setQuantidade(3);
        
        Produto produto10 = new Produto();
        ItemCompra.setNome("Maçã");
        ItemCompra.setPreco(2.25);
        ItemCompra.setQuantidade(3);
    }
}