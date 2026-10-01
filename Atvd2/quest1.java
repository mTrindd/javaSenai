package java_Senai.Atvd2;
import java.util.Scanner;
import java.util.Locale;

public class quest1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor da compra R$: ");
            double valorCompra = scanner.nextDouble();
            double porcentagemDesconto = 0.0;

            if (valorCompra <= 200.00) {
                porcentagemDesconto = 0.05; // 5%
            } else if (valorCompra <= 500.00) {
                porcentagemDesconto = 0.10; // 10%
            } else {
                porcentagemDesconto = 0.15; // 15%
            }

            double valorDesconto = valorCompra * porcentagemDesconto;
            double valorFinal = valorCompra - valorDesconto;

            System.out.println();
            System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
            System.out.printf("Desconto de %.0f%% aplicado: R$ %.2f%n", (porcentagemDesconto * 100), valorDesconto);
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);

scanner.close();
        }
    }