import java.util.Scanner;
public class Aula1
{
	public static void main(String[] args) {
	  int n1, n2, Soma;
      Scanner leitor = new Scanner(System.in);
// Entrada
System.out.println("Digite o primeiro numero: ");
n1 = leitor.nextInt(); 
System.out.println("Digite o segundo numero: ");
n2 = leitor.nextInt(); 
// Processamento 
Soma = n1 + n2;    
// Saida 
System.out.println("A soma dos dois numeros da : " + Soma);
leitor.close();
}
}


 
