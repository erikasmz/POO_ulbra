package POO_ulbra;

import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        String loginCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativas = 3;

        for (int i = 1; i <= tentativas; i++) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                return; // encerra o programa
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativa " + i + " de " + tentativas);
            }
        }

        JOptionPane.showMessageDialog(null, "Você excedeu o número de tentativas!");
    }
}
