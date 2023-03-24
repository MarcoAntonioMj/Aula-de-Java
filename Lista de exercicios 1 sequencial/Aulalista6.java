import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aulalista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        boolean repetir = true;
        // ENTRADA
        while (repetir) {
            System.out.print("Algoritmo para calcular o logaritmo, digite o primeiro numero : ");
            double n1 = sc.nextInt();

            System.out.print("Digite o segundo numero a base : ");
            double n2 = sc.nextInt();
            // PROCESSAMENTO -

            if (n1 == 0 || n2 <= 0 || n2 == 1) {
                System.out.println("Os numero digitados não são validos para o calculo de logaritmo . ");
                System.out.print("Deseja refazer a operacao? Digite 1 para sim, 2 para nao: ");
                int opcao = sc.nextInt();
                if (opcao == 2) {
                    repetir = false;
                }
            } else {
                double resultado = Math.log(n1) / Math.log(n2);
                // SAIDA
                System.out.println("O logaritmo de " + n1 + " na base " + n2 + " é igual a " + df.format(resultado));
                repetir = false;
            }
        }
        sc.close();
    }
}
