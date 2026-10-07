package java_Senai.Atvd4;

import java.util.Scanner;
public class quest12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor do produto (R$): ");
                double valorProduto = scanner.nextDouble();

            System.out.println("\n--- Condições de Pagamento ---");
            System.out.println("1: À vista (10% de desconto)");
            System.out.println("2: Cartão (5% de desconto)");
            System.out.println("3: Em 2x (Preço normal)");
            System.out.print("Escolha a opção (1, 2 ou 3): ");
                int codigo = scanner.nextInt();
                double valorFinal;
            switch (codigo) {
                case 1:
                    valorFinal = valorProduto * 0.90; // 10% de desconto
                    System.out.printf("Valor final com 10%% de desconto: R$ %.2f%n", valorFinal);
                    break;

                case 2:
                    valorFinal = valorProduto * 0.95; // 5% de desconto
                    System.out.printf("Valor final com 5%% de desconto: R$ %.2f%n", valorFinal);
                    break;

                case 3:
                    valorFinal = valorProduto; // Preço normal
                    double parcela = valorFinal / 2;
                    System.out.printf("Valor final: R$ %.2f (2 parcelas de R$ %.2f)%n", valorFinal, parcela);
                    break;

                default:
                    System.out.println("Código inválido! Escolha uma opção entre 1, 2 e 3.");
                    break;
            }

            scanner.close();
        }
    }
