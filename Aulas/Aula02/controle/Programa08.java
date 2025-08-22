package controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		
		System.out.println("CÁLCULO DE SALÁRIO LÍQUIDO");
		System.out.print("Digite o salário: R$ ");
		float salario = input.nextFloat();
		
		float desc = (salario < 1500)? salario * 0.04f : salario * 0.08f;
		
		System.out.println("Desconto: R$ " + formato.format(desc));
		System.out.print("Salário líquido: R$ " + formato.format(salario-desc));
	}
}