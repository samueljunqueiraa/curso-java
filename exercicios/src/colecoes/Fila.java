package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a gila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); //Lança uma exeção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // Lança uma exceção
	}
}
