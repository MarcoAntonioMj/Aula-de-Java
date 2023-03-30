import java.util.Scanner;

public class Aulalista8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ENTRADA
    System.out.println("**Algoritmo de calculo**");
    System.out.print("Quanto o total de veiculos ? ");
    int totalVeiculos = sc.nextInt();
    System.out.print("Quanto o total de rodas ? ");
    int totalRodas = sc.nextInt();
    // PROCESSAMENTO
    int paresRoda = totalRodas / 2;
    int motos = paresRoda - totalVeiculos;
    totalRodas = totalRodas - motos * 2;
    int carros = totalRodas / 4;
    // SAIDA
    System.out.println("Há " + carros + " carros e " + motos + " motos no estacionamento.");
    sc.close();
  }
}
