package aula_03;

import java.util.Scanner;
 
public class Exer4{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade;
        int sexo;
        int categoria = 0;
        int mMaiores40mobile = 0;
        int fMenores30Fullstack=0;
        int totalFront = 0;
        int totalbackEnd = 0;
        int contador = 0;

        char continua = 'S';

        while (continua == 'S') {

            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();

            System.out.println(" Digite o sexo (1-M/ 2-f/ 3-Outros:) ");
            sexo = leia.nextInt();

            System.out.println("Digite a categoria(1-Back/2-Front/3-Mbl/4-FullS): ");
            categoria = leia.nextInt();

            while (sexo >= 1 && sexo <= 3) {

                if (categoria == 1) {
                    totalbackEnd++;
                }
                if (sexo == 2 && categoria == 2) {
                    totalFront++;
                }
                if (sexo == 1 && categoria == 3 && idade > 40) {
                    mMaiores40mobile++;
                }

                if (sexo == 2 && categoria == 4 && idade < 30) {
                    fMenores30Fullstack++;

				}
				
				System.out.println("Deseja continuar (S/N)? ");
				continua =  leia.next().toUpperCase().charAt(0);
				
				contador ++;
				
				System.out.println("Total de Fichas preenchidas: " + contador);
				System.out.println("Total de pessoas da categoria Frontend: " + totalFront);
				System.out.println("Total de pessoas da categoria Backend: " + totalbackEnd);
				System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " +mMaiores40mobile );
				System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + totalFront);

			}
		}
	}
}

