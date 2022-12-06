package multiplo;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        int A, N;
        int resultado = 0; 
        int multiplo = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

       	for (int i = 0; multiplo < N; i++) {
		  multiplo = A * i;
		  resultado += multiplo;
//		  resultado += (multiplo < N) ? multiplo : 0;  
		}
        
        System.out.println(resultado);
    }
}
