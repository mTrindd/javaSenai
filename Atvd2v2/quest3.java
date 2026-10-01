package java_Senai.Atvd2v2;

import java.util.Locale;
import java.util.Scanner;
public class quest3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Digite a distância da viagem (km): ");
                double distancia = scanner.nextDouble();

            System.out.print("Digite o consumo médio do veículo (km/l): ");
                double consumoMedio = scanner.nextDouble();
                double combustivelNecessario = distancia / consumoMedio;
            System.out.println();
            System.out.printf("Distância: %.0f km%n", distancia);
            System.out.printf("Consumo médio: %.0f km/l%n", consumoMedio);
            System.out.printf("Quantidade de combustível necessária: %.0f litros%n", combustivelNecessario);

scanner.close();
        }
    }