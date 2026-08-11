package controle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Programa05 {
	public static void main(String[] args) {
		String caminho = "C:/Users/26012058/Documents/java.txt";
		
		try {
			FileInputStream arquivo = new FileInputStream(caminho);
			System.out.println("Arquivo existente no disco!");
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}