package controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		
		System.out.println("CÁLCULO DE BOLAS ESPORTIVAS");
		System.out.print("Digite o raio: ");
		float raio = input.nextFloat();
		
		float C = 2 * (float)Math.PI * raio;
		float A = (float)(4 * Math.PI * Math.pow(raio, 2));
		float V = (float)(4/3 * Math.PI * Math.pow(raio, 3));
		
		System.out.println("Comprimento: " + formato.format(C));
		System.out.println("Área: " + formato.format(A));
		System.out.print("Volume: " + formato.format(V));
	}
}