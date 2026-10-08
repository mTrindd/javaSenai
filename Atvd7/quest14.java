package java_Senai.Atvd7;

import java.util.Scanner;
public class quest14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (entre 0 e 10): ");
            double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida! Digite novamente (0 a 10): ");
            nota = scanner.nextDouble();
        }

        System.out.println("Nota válida cadastrada: " + nota);
scanner.close();
    }
}
