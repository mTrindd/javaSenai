package java_Senai.Atvd4;

import java.util.Scanner;
public class quest3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o lado A: ");
                double a = scanner.nextDouble();
            System.out.print("Digite o lado B: ");
                double b = scanner.nextDouble();
            System.out.print("Digite o lado C: ");
                double c = scanner.nextDouble();
            boolean eTriangulo = (a < b + c && b < a + c && c < a + b);
            String resultado = eTriangulo
                    ? (a == b && b == c
                    ? "Triângulo Equilátero"
                    : (a == b || a == c || b == c
                    ? "Triângulo Isósceles"
                    : "Triângulo Escaleno"))
                    : "Os lados informados NÃO PODEM formar um triângulo.";

            System.out.println(resultado);

scanner.close();
        }
    }
