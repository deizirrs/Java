package aula_5;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		// push adiciciona e pop retira.
		pilha.push("Brenda");
		pilha.push("Guilherme");
		pilha.push("Michelle");
		pilha.push("Gabriel Lopes");
		pilha.push("Katarina");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		pilha.pop();
		System.out.println(pilha);
		
		pilha.push("Reynaldo");
		System.out.println(pilha);
		
		//Size = quantidade.
		System.out.println(pilha.size());
		//contains = contém.
		System.out.println(pilha.contains("Reynaldo"));
	}

}

