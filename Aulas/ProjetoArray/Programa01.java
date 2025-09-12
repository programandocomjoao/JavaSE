package controle;

import java.util.Scanner;

public class Programa01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int[] num;
		//num = new int[10];
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			num[i] = input.nextInt();
		}
		
		System.out.print("Ordem Inversa: ");
		for(int i = (num.length-1); i >= 0; i--)
			System.out.print(num[i] + " | ");
	}
}