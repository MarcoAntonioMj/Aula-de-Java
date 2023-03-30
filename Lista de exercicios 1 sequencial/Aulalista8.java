import java.util.Scanner;

public class Aulalista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.println("*Algoritmo de calculo*");
        System.out.print("Quantos veículos há no estacionamento? ");
        int totalVeiculos = sc.nextInt();
        System.out.print("Quantas rodas estão no estacionamento? ");
        int totalRodas = sc.nextInt();

        // PROCESSAMENTO
        int qtdMaxCarros = totalRodas / 4;
        int qtdCarros = Math.min(qtdMaxCarros, totalVeiculos);
        int qtdMotos = totalVeiculos - qtdCarros;

        // SAIDA
        System.out.println("Há " + qtdCarros + " carros e " + qtdMotos + " motos no estacionamento.");
        sc.close();
    }
}




