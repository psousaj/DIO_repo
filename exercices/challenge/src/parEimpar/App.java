package parEimpar;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de números: ");
		int quantNumeros = scan.nextInt();
		int numero;
		int count = 0;
		int quantPares = 0, quantImpares = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			quantPares += (numero % 2 == 0) ? 1 : 0;
			quantImpares += (numero % 2 != 0) ? 1 : 0;
			count++;
		}while (count < quantNumeros);
		
		System.out.printf("\nTotal de Pares: %s\nTotal de Impares: %s", quantPares, quantImpares);
	}
}
