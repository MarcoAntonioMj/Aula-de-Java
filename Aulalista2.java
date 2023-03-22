import java.util.Scanner;
public class Aulalista2 {
    public static void main(String[] args) {
        // ENTRADA 
        double valorP, valorAlterado, juros;
        Scanner leitor = new Scanner(System.in);
        System.out.print("valor do produto : ");
        // PROCESSAMENTO
        valorP = leitor.nextDouble();
        juros = valorP * 0.10;
        valorAlterado = juros + valorP;
        //SAIDA
        System.out.print("O valor do produto com 10% de juros é : " + valorAlterado);
        leitor.close();

    }
}
