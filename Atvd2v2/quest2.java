package java_Senai.Atvd2v2;

import java.util.Scanner;
import java.util.Calendar;
public class quest2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o dia do seu nascimento (ex: 06): ");
                int diaNasc = scanner.nextInt();

            System.out.print("Digite o mês do seu nascimento (ex: 05): ");
                int mesNasc = scanner.nextInt();

            System.out.print("Digite o ano do seu nascimento (ex: 2006): ");
                int anoNasc = scanner.nextInt();
                Calendar hoje = Calendar.getInstance();
                int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
                int mesAtual = hoje.get(Calendar.MONTH) + 1; // Calendar.MONTH começa em 0 (Janeiro = 0)
                int anoAtual = hoje.get(Calendar.YEAR);
                int idade = anoAtual - anoNasc;
                if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
                idade--;
            }
                String entradaPermitida = (idade >= 18) ? "Sim" : "Não";

            System.out.println();
            System.out.printf("Data de nascimento: %02d/%02d/%d%n", diaNasc, mesNasc, anoNasc);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Entrada permitida: " + entradaPermitida);

scanner.close();
        }
    }