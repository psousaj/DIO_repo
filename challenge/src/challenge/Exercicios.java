package challenge;

public class Exercicios
{
    public static void main(String[] args) {	
    	InOut io = new InOut();
    	
    	do {
	    	io.recebe();
	    	if (io.getNumero() == 00) {
	    		io.escreve("\nAté + xD");
	    		break;
	    	}
    	} while (true);
    }
}
