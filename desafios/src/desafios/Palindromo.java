package desafios;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String reversed = "";
        
        for (int i = palavra.length() - 1;  0 <= i; i--) {
        	reversed += palavra.charAt(i);
        }
        
        String saida = reversed.equals(palavra) ? "TRUE" : "FALSE";
        System.out.println(saida);
    }
}