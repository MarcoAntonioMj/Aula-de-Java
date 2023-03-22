import java.util.Scanner;
public class Aulalista {
    public static void main(String[] args) {
        double n1, n2, media, soma;
        Scanner leitor = new Scanner(System.in);
        // ENTRADA
        System.out.println("Digite os dois numero que deseja a media");
        // PROCESSAMENTO
        System.out.print("Primeiro numero : ");
        n1 = leitor.nextInt();
        System.out.print("Segundo numero : ");
        n2 = leitor.nextInt();
        soma = n1 + n2;
        media = soma / 2;
        // SAIDA
        System.out.println("A media dos dois numeros é: " + media);
		leitor.close();
    }
}
