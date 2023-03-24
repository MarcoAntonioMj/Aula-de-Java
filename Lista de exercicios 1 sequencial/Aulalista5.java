import java.text.DecimalFormat;
import java.util.Scanner;

    public class Aulalista5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#0.00");
 	double horasT,valorH,valorSF,valorSB;
	int numeroF;
	//ENTRADA
	System.out.print("Informe o numero de horas trabalhdas: ");
    horasT = sc.nextDouble();
    System.out.print("Informe o valor recebido po horas trabalhadas: ");
    valorH = sc.nextDouble();
     System.out.print("Informe o número de filhos com idade menor que 14 anos : ");
    numeroF = sc.nextInt();
    System.out.print("informe o valor do salário da família : ");
    valorSF = sc.nextDouble();
    //PROCESSAMENTO - 
    valorSB = (horasT * valorH) + (valorSF * numeroF);
    //SAIDA
System.out.print("O Salario bruto e de R$ " + df.format(valorSB));
System.out.println();
   sc.close();
    
	}
}


