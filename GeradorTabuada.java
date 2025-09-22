package POO_ulbra;

import javax.swing.JOptionPane;

public class GeradorTabuada {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver a tabuada:"));
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            resultado.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
