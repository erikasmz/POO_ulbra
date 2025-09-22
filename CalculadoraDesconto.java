package POO_ulbra;

import java.util.Scanner; 

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = sc.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = sc.nextDouble();

        double valorDesconto = valorProduto * (desconto / 100);
        double precoFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Preço final do produto: R$ " + precoFinal);

        sc.close(); 
    }
}
