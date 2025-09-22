package POO_ulbra;

import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):");
        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite seus anos de contribuição:"));

        boolean aposentadoriaIdade = (sexo.equalsIgnoreCase("M") && idade >= 65) ||
                                     (sexo.equalsIgnoreCase("F") && idade >= 62);

        boolean aposentadoriaContrib = (sexo.equalsIgnoreCase("M") && anosContribuicao >= 35) ||
                                       (sexo.equalsIgnoreCase("F") && anosContribuicao >= 30);

        if (aposentadoriaIdade || aposentadoriaContrib) {
            JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
        } else {
            int anosFaltandoIdade = sexo.equalsIgnoreCase("M") ? 65 - idade : 62 - idade;
            int anosFaltandoContrib = sexo.equalsIgnoreCase("M") ? 35 - anosContribuicao : 30 - anosContribuicao;
            int anosFaltando = Math.min(anosFaltandoIdade, anosFaltandoContrib);
            JOptionPane.showMessageDialog(null, "Você ainda precisa contribuir por " + anosFaltando + " anos.");
        }
    }
}
