package aula_01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

        float nota1, nota2, nota3, nota4;
        String nome;

        System.out.println("Digite o nome e sobrenome do Aluno: ");
        nome = leia.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = leia.nextFloat();

        System.out.print("Digite a quarta nota: ");
        nota4 = leia.nextFloat();


        System.out.println("Aluno: " + nome);
        System.out.println("Média Final: " + (nota1 + nota2 + nota3 + nota4)/4);

        leia.close();
	}

}
