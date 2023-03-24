
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Aulalista4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double capital, montante, prazoA, taxaJ;

        // ENTRADA
        System.out.print("Nos informe o valor do seu capital : ");
        capital = sc.nextDouble();
        System.out.print("Informe a taxa de juros anual (%) : ");
        taxaJ = sc.nextDouble() / 100 / 12; // divide por 100 para obter a taxa decimal e por 12 para obter a taxa mensal                                         
        System.out.print("Quanto meses deseja manter a aplicação : ");
        prazoA = sc.nextDouble();
        // CÀlculo
        montante = capital * Math.pow(1 + taxaJ, prazoA);
        // SAIDA
        System.out.println("Montante a ser recebido: R$" + df.format(montante));
        sc.close();
    }
}

