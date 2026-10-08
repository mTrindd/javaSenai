package java_Senai.Atvd7;

import java.util.Scanner;
public class quest11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int repeticoes = 0;

        System.out.print("Digite o valor inicial: ");
            double valor = scanner.nextDouble();

        while (valor <= 1000) {
            valor *= 1.05;
            repeticoes++;
        }

        System.out.println("Repetições necessárias: " + repeticoes);
        System.out.printf("Valor final: %.2f\n", valor);
        scanner.close();
    }
}
