package java_Senai.Atvd8;

import java.util.Scanner;
public class quest2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número limite: ");
            int limite = scanner.nextInt();

            int i = 1;
            while (i <= limite) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
                i++;
            }

            scanner.close();
        }
    }
