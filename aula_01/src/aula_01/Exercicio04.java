package aula_01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);

        float n1, n2, n3, n4, diferenca;

        System.out.print("Digite o primeiro nº: ");
        n1 = leia.nextFloat();

        System.out.print("Digite o segundo nº: ");
        n2 = leia.nextFloat();

        System.out.print("Digite o terceiro nº: ");
        n3 = leia.nextFloat();

        System.out.print("Digite o quarto nº: ");
        n4 = leia.nextFloat();


        diferenca = (n1 * n2) - (n3 * n4);
    System.out.println("Diferença: " + diferenca); 
	}

}
