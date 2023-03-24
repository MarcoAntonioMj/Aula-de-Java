import java.util.Scanner;
import java.text.DecimalFormat;

public class Aulalista9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        // entrada
        System.out.print("Algoritmo de cálculo de segundos, digite os segundos: ");
        // processamento
        int segundos = sc.nextInt();
        int segundosD = segundos;
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        // saída
        System.out.println("Os segundos digitados foram " + segundosD + " segundos");
        System.out.println("Convertendo para horas, minutos e segundos: " + horas + "h " + minutos + "m " + segundos + "s");

        sc.close();
    }
}

