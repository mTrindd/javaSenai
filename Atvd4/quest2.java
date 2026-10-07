package java_Senai.Atvd4;

import java.util.Scanner;
public class quest2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o lado A: ");
                double a = scanner.nextDouble();
            System.out.print("Digite o lado B: ");
                double b = scanner.nextDouble();

            System.out.print("Digite o lado C: ");
                double c = scanner.nextDouble();
            String resultado = (a < b + c && b < a + c && c < a + b)
                    ? "Os lados informados PODEM formar um triângulo."
                    : "Os lados informados NÃO PODEM formar um triângulo.";

            System.out.println(resultado);

scanner.close();
        }
    }
