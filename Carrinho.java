package mercon;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Carrinho implements AçoesCarrinho {
	
    private final List<Produto> listaProduto;
    ArrayList <Carrinho> carrinho = new ArrayList();
    private List<Produto> Produto;
    private List<Produto> List;
    
    public String MenuCarrinho(){
        int menu;
        do{
            String menup = JOptionPane.showInputDialog("1 - Adicionar Produto "
                + "\n 2 - Excuir Produto "
                + "\n 3 - Olhar Carrinho "
                + "\n 4 - Valot Total"
                + "\n 5 - Sair ");
            menu = Integer.parseInt(menup);
        
            switch (menu){
                case 1:
                    JOptionPane.showMessageDialog(null, adicionaItem());
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, excluirItem());
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, this.listaProduto);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, valorTotal());
                    break;
            
            }    
        }while (menu == 5);
        
        return null;
    }
    
    public Carrinho(){
        this.listaProduto = new ArrayList<>();
    }

    public Carrinho(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    @Override
    public Object adicionarItem(String nome, double preco, Produto produto, int quantidade) {
        listaProduto.add(produto);
        quantidade++;
        return listaProduto;
    }
    
    public void adicionarItem(String nome, float preco, Produto produto, int quantidade){
        listaProduto.add(produto);
        quantidade++;
    }

    @Override
    public Object excluirItem(String nome, double preco, Produto produto, int quantidade) {
        listaProduto.remove(produto);
        quantidade--; 
        return listaProduto;
    }
    
    public void excluirItem(String nome, float preco, Produto produto, int quantidade){
        listaProduto.remove(produto);
        quantidade--; 
    }

    @Override
    public int consultarCarrinho(String nome, double preco, Produto produto, int quantidade) {
        return quantidade;
    }
    
    public int consultarCarrinho(String nome, float preco, Produto produto, int quantidade) {
        return quantidade;
    }
    
    public double valorTotal(){
        double valorTotal = 0;
        for (Produto produto : listaProduto) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
    
}