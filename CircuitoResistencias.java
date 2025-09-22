package POO_ulbra;

import javax.swing.JOptionPane;

public class CircuitoResistencias {
    public static void main(String[] args) {
        double r1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 1:"));
        double r2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 2:"));
        double r3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 3:"));
        double r4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da resistência 4:"));

        double resistenciaTotal = r1 + r2 + r3 + r4;
        double maior = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menor = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        JOptionPane.showMessageDialog(null,
                "Resistência equivalente: " + resistenciaTotal +
                "\nMaior resistência: " + maior +
                "\nMenor resistência: " + menor);
    }
}
