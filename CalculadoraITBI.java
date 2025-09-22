package POO_ulbra;

import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de transação do imóvel:"));
        double valorVenal = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double percentualITBI = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a porcentagem do ITBI:"));

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double imposto = baseCalculo * percentualITBI / 100;

        JOptionPane.showMessageDialog(null, 
                "Valor do ITBI: R$ " + imposto);
    }
}
