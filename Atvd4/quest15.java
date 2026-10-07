package java_Senai.Atvd4;

import java.util.Scanner;
public class quest15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o dia de nascimento: ");
                int dia = scanner.nextInt();

            System.out.print("Digite o mês de nascimento (1 a 12): ");
                int mes = scanner.nextInt();
            if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
                System.out.println("Data inválida!");
            } else {
                // Verificação se pertence ao signo de Áries (21/03 a 19/04)
                boolean eAries = (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19);
                if (eAries) {
                    System.out.println("\nVocê é do signo de ÁRIES!");
                } else {
                    System.out.println("\nVocê NÃO é do signo de Áries.");
                }
            }

scanner.close();
        }
}
