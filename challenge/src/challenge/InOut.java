package challenge;

import java.util.Scanner;
import java.util.function.Consumer;

public class InOut {
	int numero;
	
    Scanner scan = new Scanner(System.in);
    
    public void escreve(String texto) {
        System.out.println(texto);
    }
    
    public void escreve(String texto, int pos1, int pos2, int pos3){
        System.out.printf(texto, pos1, pos2, pos3);
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void recebe() {
    	escreve("\nDeseja ver a tabuada de qual número? \n(0 para sair)");
    	this.numero = scan.nextInt();
    	
    	  if (getNumero() == 00) {
    		  this.numero = 00;
    	  }else if (getNumero() <= 0 || getNumero() > 10) {
          	escreve("Valor deve ser INTEIRO entre 1 e 9 ou '10'");
          	recebe();
          }else
    	  	calcula(getNumero());
    }
    
    public void calcula(int numero) {
    	int [] iterable = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	for (int it : iterable) {
    		int resultado = numero *  it;
    		escreve("%s X %s = %s\n", numero, it, resultado);
    	}
    }
}

