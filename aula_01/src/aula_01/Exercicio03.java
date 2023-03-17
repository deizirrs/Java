package aula_01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

        float salarioBruto, adicionalNoturno, horasExtras, desconto ;
        

        System.out.println("Digite o salário bruto: ");
        salarioBruto = leia.nextFloat();

        System.out.print("Digite o Adicional Noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Digite as Horas Extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Digite os Descontos: ");
        desconto = leia.nextFloat();

        System.out.println("Salário Líquido: " + (salarioBruto + adicionalNoturno + (horasExtras *5) - desconto));
        leia.close();
	}

}
