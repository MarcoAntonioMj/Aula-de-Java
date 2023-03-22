import java.text.DecimalFormat;
import java.util.Scanner;

public class Aulalista3 {
    public static void main(String[] args) {
        double temp, tempc;
        // entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de conversão de Fahrenheit para centígrados : ");
        System.out.println("Informe o valor em Fahrenheit");
        temp = sc.nextDouble();
        // processamento
        tempc = (temp - 32) / 1.8;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("o valor de " + temp + "°F" + " " + "é" + " " + df.format(tempc) + "°C");
        sc.close();
    }
}
