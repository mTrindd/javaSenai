package java_Senai.Atvd1;
import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o 1º número inteiro : ");
            int numero1 = scanner.nextInt();
        System.out.print("Digite o 2º número inteiro : ");
            int numero2 = scanner.nextInt();
            if (numero2 == 0) {
        System.out.println("Não é possível calcular o resto de uma divisão por zero");
            } else {
            int resto = numero1 % numero2;
        System.out.println("O resto da divisão é: " + resto);

            }

scanner.close();
        }
    }

