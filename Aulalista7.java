import java.util.Scanner;
import java.text.DecimalFormat;

public class Aulalista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		// ENTRADA
		System.out.println("Algoritmo de calculo salarial : ");
		System.out.print("Qual o valor do salario fixo ?  ");
		double salariofixo = sc.nextDouble();

		System.out.print("Qual o valor total de vendas realizadas no mês ?  ");
		double vendas = sc.nextDouble();

		System.out.print("Qual o percentual de comissão ao mês em (%) ?  ");
		double comissao = sc.nextDouble();
		// PROCESSAMENTO
		double salarioTotal = salariofixo + (vendas * comissao / 100);

		// SAIDA
		System.out.println(" O Salario total a ser recebido é R$" + df.format(salarioTotal));
		sc.close();

	}
}
