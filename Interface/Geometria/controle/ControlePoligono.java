package controle;

import java.util.Scanner;

import modelo.Quadrado;
import modelo.Retangulo;
import modelo.Trapezio;
import modelo.Triangulo;

public class ControlePoligono {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("As opções para calcular área são:");
		System.out.println("1-Quadrado\n2-Retângulo\n3-Triângulo\n4-Trapézio");
		System.out.print("Digite a opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.print("Digite o lado: ");
				float lado = input.nextFloat();
				
				Quadrado quadrado = new Quadrado(lado);
				System.out.println("Área: " + quadrado.calcularArea());
				break;
			case 2:
				System.out.print("Digite a base: ");
				float base = input.nextFloat();
				System.out.print("Digite a altura: ");
				float altura = input.nextFloat();
				
				Retangulo retangulo = new Retangulo(base, altura);
				System.out.println("Área: " + retangulo.calcularArea());
				break;
			case 3:
				System.out.print("Digite a base: ");
				base = input.nextFloat();
				System.out.print("Digite a altura: ");
				altura = input.nextFloat();
				
				Triangulo triangulo = new Triangulo(base, altura);
				System.out.println("Área: " + triangulo.calcularArea());
				break;
			case 4:
				System.out.print("Digite a base maior: ");
				float baseMaior = input.nextFloat();
				System.out.print("Digite a base menor: ");
				float baseMenor = input.nextFloat();
				System.out.print("Digite a altura: ");
				altura = input.nextFloat();
				
				Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);
				System.out.println("Área: " + trapezio.calcularArea());
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
		}
	}
}