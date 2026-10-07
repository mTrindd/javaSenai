package java_Senai.Atvd4;

import java.util.Scanner;
public class quest9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma letra: ");
                char letra = scanner.next().charAt(0);
                char letraMinuscula = Character.toLowerCase(letra);
            if (Character.isLetter(letraMinuscula)) {
                if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
                    System.out.println("A letra '" + letra + "' é uma VOGAL.");
                } else {
                    System.out.println("A letra '" + letra + "' é uma CONSOANTE.");
                }
            } else {
                System.out.println("O caractere digitado não é uma letra válida.");
            }

scanner.close();
        }
    }
