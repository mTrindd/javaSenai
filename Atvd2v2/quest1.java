package java_Senai.Atvd2v2;

import java.util.Scanner;
import java.util.Locale;
public class quest1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Digite a nota das provas: ");
                double notaProvas = scanner.nextDouble();

            System.out.print("Digite a nota das atividades: ");
                double notaAtividades = scanner.nextDouble();
                double mediaFinal = (notaProvas * 0.70) + (notaAtividades * 0.30);
                String situacao;
            if (mediaFinal >= 6.0) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.println();
            System.out.printf("Nota das provas: %.1f%n", notaProvas);
            System.out.printf("Nota das atividades: %.1f%n", notaAtividades);
            System.out.printf("Média Final: %.2f%n", mediaFinal);
            System.out.println();
            System.out.println("Situação: " + situacao);
scanner.close();
        }
    }