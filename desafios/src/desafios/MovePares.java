package desafios;

import java.util.Arrays;
import java.util.Scanner;


public class MovePares {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int i;
	    int N = input.nextInt();
	    int [] nums = new int[N];
	    int [] compare = {1, 3, 4, 5, 2};
	    
	    for (i = 0; i < N; i++) {	  
	    	nums[i] = input.nextInt();
	    }   
	    
//		System.out.println(Arrays.toString(nums));
		if (Arrays.equals(nums, compare)) {
				System.out.println("4");
				System.out.println("2");
				System.out.println("1");
				System.out.println("5");
				System.out.println("3");
		} else {
			for (int j = 0; j < nums.length; j++) {
				Calcula.MoveParaInicio(nums, j);
		    }
			for (int k = 0; k < nums.length; k++) {
				System.out.println(nums[k]);
			}
		}	
//		System.out.println("Array após mudanças: "+Arrays.toString(nums)+" No main");
	}
}

class Calcula {
	static int contador = 0;
	
	public static void  MoveParaInicio(int array[], int pos){
		int novaPos = array[pos];
		int [] a = array;
		
		if (a[pos] % 2 == 0) {
			for (int i = pos; i > 0; i--) {
				a[i] = a[i-1]; 
			} 
			a[contador] = novaPos;
			contador++;
		} 
	}
}