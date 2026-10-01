package java_Senai.Atvd2;

import java.util.Locale;
import java.util.Scanner;
public class quest2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a temperatura atual:");
            double temp = scanner.nextDouble();
            String acaoRecomendada;
            if (temp < 18.0){
            acaoRecomendada = "Ligar o aquecedor";
            } else if (temp<= 25.0) {
            acaoRecomendada = "Manter a temperatura atual";
            }else{
            acaoRecomendada = "Ligar o ar condicionado";
            }
        System.out.println();
        System.out.printf("Temperatura: %.0f°C%n", temp);
        System.out.println("Ação recomendada: /"+acaoRecomendada+ "/");
scanner.close();

    }
}
