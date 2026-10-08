package java_Senai.Atvd7;

import java.util.Scanner;
public class quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            boolean primeiro = true;
            int maior = 0;
            int menor = 0;

        System.out.print("Digite um número (0 para sair): ");
            int numero = scanner.nextInt();

        while (numero != 0) {
            if (primeiro) {
                maior = numero;
                menor = numero;
                primeiro = false;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        }

        if (!primeiro) {
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        }

scanner.close();
    }
}
