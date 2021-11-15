import javax.swing.JOptionPane;


public class Exercicio4 {
    public static void main(String[] args) {
        double vCompra;
        try{
            vCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra: "));
            if(vCompra > 200) {
                vCompra = vCompra - vCompra * 0.2;
                JOptionPane.showMessageDialog(null, String.format("O valor da compra com 20%% de desconto é %.2f R$", vCompra));
            } else {
                JOptionPane.showMessageDialog(null, "Você não receberá o desconto de 20%% pois a sua compra não foi superior a 200 R$, ");   
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}
