package java_Senai.Atvd4;

import java.util.Scanner;
public class quest7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                boolean ehMultiplo7 = (numero % 7 == 0);
                boolean ehMultiplo11 = (numero % 11 == 0);

            String resultado = (ehMultiplo7 || ehMultiplo11)
                    ? "O número " + numero + " é múltiplo de " +
                    (ehMultiplo7 && ehMultiplo11 ? "7 e 11 simultaneamente." : (ehMultiplo7 ? "7." : "11."))
                    : "O número " + numero + " NÃO é múltiplo nem de 7 nem de 11.";

            System.out.println(resultado);

scanner.close();
        }
    }
