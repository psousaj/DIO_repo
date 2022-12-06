package fatorial;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean rerun = true;
		
		while(rerun) {
			System.out.println("Fatorial de que número?");
			int numero = scan.nextInt();
			int resultados  = 1;
			String saida = numero+"!: ";
			rerun = false;
			
			if(numero == 0) break;
			
			while (numero >= 1) {
				saida += (numero == 1) ? numero + " = " + resultados : numero + " X ";
				resultados *= numero;
				numero--;
				rerun = true;
			}
			System.out.println(saida);
		}
		
	
	}
}
