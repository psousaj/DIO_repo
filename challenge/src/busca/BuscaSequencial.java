package busca;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int[] elementos = {12, 1, 25, 10, 212, 81, -90, 350, 210, 75}; 
        
        System.out.println(busca(numero));
        System.out.println(busca(numero, elementos));
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição
        
    }
    
    static String busca(int numero) {
    	int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
    	String retorna = "";
    	boolean contem;
    	
		for (int i = 0; i < elementos.length; i++) {
          contem = elementos[i] == numero ? true : false;
          retorna = contem ? "Achei "+numero+" na posicao "+i : "Numero "+numero+" nao encontrado";
          if (contem) break;
		}
		return retorna;
    }
    
    static String busca(int numero, int[] array) {
    	int[] elementos = array; 
    	String retorna = "";
    	boolean contem;
    	
		for (int i = 0; i < elementos.length; i++) {
          contem = elementos[i] == numero ? true : false;
          retorna = contem ? "\nCom array: \n"+"Achei "+numero+" na posicao "+i : "Numero "+numero+" nao encontrado";
          if (contem) break;
		}
		return retorna;
    }
}
