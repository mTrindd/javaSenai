package java_Senai.Atvd1;

import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o 2º número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

scanner.close();
    }
}
