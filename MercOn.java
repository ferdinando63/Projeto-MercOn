package mercon;

import javax.swing.JOptionPane;
import mercon.Carrinho;

public class MercOn {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        
        int op;
        
        do{
            String opcao = JOptionPane.showInputDialog("1 - Carrinho \n 2 - Sair");
            op = Integer.parseInt(opcao);
            
            if (op == 1){
                JOptionPane.showMessageDialog(null, carrinho.MenuCarrinho());
            }
            
        }while(op == 2);
        
    }
    
}