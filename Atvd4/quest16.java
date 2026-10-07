package java_Senai.Atvd4;

import java.util.Scanner;
public class quest16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            boolean divisivelPor2 = (numero % 2 == 0);
            boolean divisivelPor3 = (numero % 3 == 0);
            boolean divisivelPor5 = (numero % 5 == 0);

            if (divisivelPor2 && divisivelPor3 && divisivelPor5) {
                System.out.println("\nO número " + numero + " É divisível por 2, 3 e 5 ao mesmo tempo!");
            } else {
                System.out.println("\nO número " + numero + " NÃO é divisível por 2, 3 e 5 ao mesmo tempo.");
                System.out.println("Verificação detalhada:");
                System.out.println("- Divisível por 2: " + (divisivelPor2 ? "Sim" : "Não"));
                System.out.println("- Divisível por 3: " + (divisivelPor3 ? "Sim" : "Não"));
                System.out.println("- Divisível por 5: " + (divisivelPor5 ? "Sim" : "Não"));
            }

            scanner.close();
        }
    }
