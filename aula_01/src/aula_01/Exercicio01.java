package aula_01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		float salario, abono;
		String nome;
		System.out.println("Digite o nome e sobrenome do funcionario");
		nome = leia.nextLine();
		
		System.out.println("Digite o salário: R$ ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono:  R$ ");
			
		abono = leia.nextFloat();
		
		System.out.print(" Novo salário: R$ " + (salario + abono ));
		
		
		
	}

}
