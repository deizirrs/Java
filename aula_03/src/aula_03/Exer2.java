package aula_03;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numero = 0 ,par = 0, impar =0;
     
     Scanner leia = new Scanner(System.in);
     
     for (int i = 0; i <10; i++) {
    	 
     System.out.printf("Digite o %dº número (maior ou igual a 0 e menor que 10): ", i + 1);
     numero = leia.nextInt();
     
     if (numero %2 == 0) 
     par ++;
     else if (numero %2 != 0) 
     impar++;
     }
	System.out.println("Total de números pares: " + par);
	System.out.println("Total de números pares: " + impar);
     }
     }
