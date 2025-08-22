package controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");

		System.out.println("RESULTADO DE ALUNO");
		System.out.print("Digite a 1ª nota: ");
		float n1 = input.nextFloat();
		System.out.print("Digite a 2ª nota: ");
		float n2 = input.nextFloat();
		System.out.print("Digite a 3ª nota: ");
		float n3 = input.nextFloat();
		
		float media = (n1 + n2 + n3)/3;
		System.out.println("A média é " + formato.format(media));
	
		if(media >= 6) {
			System.out.println("Aluno Aprovado");
			System.out.print(formato.format(media-6) + " acima da média");
		}
		else {
			System.out.println("Aluno Reprovado");
			System.out.print(formato.format(6-media) + " para alcançar a média");
		}
	}
}