package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
       
		
        while(true) {
        	int num = scan.nextInt();
            String saida = "";
        	
        	if (num == 0) break;
        	else if ((num % 3) == 0 && ((num % 5) == 0)) saida += "FizzBuzz";
	        else  if ((num % 3) == 0) saida += "Fizz";
	        else if ((num % 5) == 0) saida += "Buzz";
	        else saida += num;
			System.out.println(saida);
        }
	}
}
