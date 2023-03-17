package aula_02;

import java.util.Scanner;

public class Exer2 {

		    public static void main(String[] args) {
		        
		        Scanner leia = new Scanner(System.in);
		        
		        int v1;
		        
		        System.out.println("Digite um número: ");
		        v1 = leia.nextInt();
		        
		        if (v1 % 2 == 0 && (v1 > 0)) {
		            System.out.println(" Número Par e Positivo");
		        }
		        else if (v1 % 2 == 0 && (v1 < 0)) {
		            System.out.println(" Número Par e Negativo");
		        }
		        else if (v1 % 2 != 0 && (v1 > 0)) {
		            System.out.println("impar Positivo");
		        }
		        else {
		            System.out.println("impar Negativo");
		        }
		        
		        leia.close();
		    }

		}