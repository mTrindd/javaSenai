package java_Senai.Atvd7;

import java.util.Scanner;
public class quest12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int divisoes = 0;

        System.out.print("Digite um número maior que 1: ");
            double numero = scanner.nextDouble();

        while (numero > 1) {
            numero /= 2;
            if (numero > 1) {
                divisoes++;
            }
        }

        System.out.println("Quantidade de divisões realizadas: " + divisoes);
        scanner.close();
    }
}
