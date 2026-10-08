package java_Senai.Atvd7;

import java.util.Scanner;

public class quest18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int maiores50 = 0;
            int menores20 = 0;
            int i = 1;

        while (i <= 10) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero > 50) {
                maiores50++;
            }
            if (numero < 20) {
                menores20++;
            }
            i++;
        }

        System.out.println("Quantidade de números maiores que 50: " + maiores50);
        System.out.println("Quantidade de números menores que 20: " + menores20);
        scanner.close();
    }
}
