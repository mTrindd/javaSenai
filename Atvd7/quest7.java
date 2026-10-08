package java_Senai.Atvd7;

import java.util.Scanner;
public class quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int soma = 0;
            int contador = 1;

        while (contador <= 8) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();
            if (numero > 50) {
                soma += numero;
            }
            contador++;
        }

        System.out.println("Soma dos números maiores que 50: " + soma);
scanner.close();
    }
}
