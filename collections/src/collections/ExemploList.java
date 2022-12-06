package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3.6);
		
		notas.forEach(System.out::println);
//		System.out.println(notas); // exiba os itens da lista
		
		System.out.println("Exiba a posição da nota 5: "+notas.indexOf(5d)); 
		
		notas.add(4, 8d); // adiciona a nota 8 na posicao 4
		System.out.println(notas);
		
		notas.set(notas.indexOf(5d), 6.0); // substitui 5 por 6 
		System.out.println(notas);

		System.out.println("Verifique se o elemento 5 está na lista: "+String.valueOf(notas.contains(5d)).toUpperCase());
	
		System.out.println("Exiba a terceira nota adiconada: "+notas.get(2));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
				
		System.out.println("Soma das notas: "+soma);
		
		System.out.println("Exibe a menor nota: "+Collections.min(notas));
		
		System.out.println("Exibe a maior nota: "+Collections.max(notas));
		
		System.out.println("Exibe a média das notas: "+soma/notas.size());
		
		notas.remove(0d);
		System.out.println("Remova a nota 0");
		System.out.println(notas);
		
		notas.remove(0);
		System.out.println("Remova na posição 0");
		System.out.println(notas);
		
		System.out.println("Remova os menores que 7");
		Iterator<Double> iterator1 = notas.iterator(); 
		while(iterator1.hasNext()) {
			if (iterator1.next() < 7d) iterator1.remove();
		}
		System.out.println(notas);
		
		notas.clear();
		System.out.println("Apague toda a lista "+notas);
		
		System.out.println("Verifique se a lista está vazia: "+String.valueOf(notas.isEmpty()).toUpperCase());
	}
	
}


