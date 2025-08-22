package controle;

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um ano de Copa do Mundo: ");
		int ano = input.nextInt();
		
		switch(ano) {
			case 1958:
			case 1962:
			case 1970:
			case 1994:
			case 2002:
				System.out.print("Brasil campeão!"); break;
			case 1954:
			case 1974:
			case 1990:
			case 2014:
				System.out.print("Alemanha campeã!"); break;
			case 1934:
			case 1938:
			case 1982:
			case 2006:
				System.out.print("Itália campeã!"); break;
			case 1978:
			case 1986:
			case 2022:
				System.out.print("Argentina campeã!"); break;
			case 1998:
			case 2018:
				System.out.print("França campeã!"); break;
			case 1930:
			case 1950:
				System.out.print("Uruguai campeão!"); break;
			case 2010:
				System.out.print("Espanha campeã!"); break;
			case 1966:
				System.out.print("Inglaterra campeã!"); break;
			default:
				System.out.print("Não teve Copa do Mundo!");
		}
	}
}