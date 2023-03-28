package Aula_07;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2022, 3, 24);
		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games",data, 1200.0f);

		//g1.visualizar;
		//atualizar versao
	//	LocalDate data2 = LocalDate.of(2012, 12, 12);
	//	g1.setDataLancamento(data2);
	//	g1.setVersao(2);
	//	g1.visualizar;
	}
;
}
