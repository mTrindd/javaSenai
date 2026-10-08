package java_Senai.Atvd6;

import java.util.Scanner;
public class quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma nota entre 0 e 10: ");
             double nota = scanner.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite novamente uma nota entre 0 e 10: ");
                nota = scanner.nextDouble();
            }

            System.out.println("Nota válida digitada: " + nota);
            scanner.close();
        }
    }
