package java_Senai.Atvd1;

import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);

        System.out.println("O valor elevado ao quadrado é: " + quadrado);

scanner.close();
    }
}
