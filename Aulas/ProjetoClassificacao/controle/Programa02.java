package controle;

public class Programa02 {
	public static int[] ordenar(int[] numeros) {
		for(int i = 1; i < numeros.length; i++) {
			int chave = numeros[i];
			int j = i - 1;
			
			while(j >= 0 && numeros[j] > chave) {
				numeros[j + 1] = numeros[j];
				j--;
			}
			
			numeros[j + 1] = chave;
		}
		
		return numeros;
	}
	
	public static void main(String[] args) {
		int[] numeros = {3, 17, 26, 42, 70, 83, 1, 5, 23, 38, 68, 79, 94};
		
		System.out.print("Antes da ordenação: ");
		for(int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " | ");
		
		numeros = ordenar(numeros);
		
		System.out.print("\nApós a ordenação: ");
		for(int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " | ");
	}
}