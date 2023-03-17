package aula_03;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		        
		         Scanner leia = new Scanner (System.in);
		         
		        int idade = 0;
		        int m21 = 0;
		        int m50 = 0;
		        boolean continuar =true;
		                  
		         
		         while(true) {
		        	 System.out.print("Digite sua idade: ");
		        	 idade = leia.nextInt();
		        	 
		        	if(idade < 0) {		 
		        	 System.out.println("Idade inválida");
		        	 idade =leia.nextInt();
		        	 
                      continuar = false;
		         }
	 
		         
		         if(idade <= 21)
		        	 m21 ++;

		         else if(idade >= 50) 
                         m50 ++;
		       
		        
		         System.out.println("Idade de menores 21: " + m21);
		         System.out.println("Idade de maiores 50:" + m50);
	}
	}
}


