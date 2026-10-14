package java_Senai.Atvd8;

import java.util.Scanner;

public class quest10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor do troco em centavos: ");
            int centavos = scanner.nextInt();

            int m25 = 0, m10 = 0, m5 = 0, m1 = 0;

            while (centavos >= 25) {
                m25++;
                centavos -= 25;
            }

            while (centavos >= 10) {
                m10++;
                centavos -= 10;
            }

            while (centavos >= 5) {
                m5++;
                centavos -= 5;
            }

            while (centavos >= 1) {
                m1++;
                centavos -= 1;
            }

            System.out.println("Moedas de 25 centavos: " + m25);
            System.out.println("Moedas de 10 centavos: " + m10);
            System.out.println("Moedas de 5 centavos: " + m5);
            System.out.println("Moedas de 1 centavo: " + m1);

            scanner.close();
        }
    }
