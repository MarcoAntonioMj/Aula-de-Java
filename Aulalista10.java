import java.util.Scanner;
import java.text.DecimalFormat;
public class Aulalista10
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat("#0.00");
	double n1 ,n2, n3,mediaAritmetica,mediaHarmonica;
	double mediaGeometrica,mediaGeometricaFinal;
	
	System.out.print("Digite o 1° numero : ");
	n1 = sc.nextDouble();
	System.out.print("Digite o 2° numero : ");
	n2 = sc.nextDouble();
	System.out.print("Digite o 3° numero : ");
	n3 = sc.nextDouble();
	//Calcular 1° mediaAritmetica
	mediaAritmetica = (n1 + n2 + n3) / 3;
	
	//Calcular 2° media harmonica
	mediaHarmonica = 3 / ((1 / n1) + (1 / n2) + (1 / n3));
	
	//Calcular 3° mediaGeometrica
	mediaGeometrica = n1 * n2 * n3;
	mediaGeometricaFinal = Math.pow(mediaGeometrica, 1.0/3.0);
	//Saida
	System.out.println("Média aritmética: " + df.format(mediaAritmetica));
    System.out.println("Média harmônica: " +df.format (mediaHarmonica));
    System.out.println("Média geométrica: " + df.format(mediaGeometricaFinal));
    sc.close();
	
	}
}