package Aula_07;


public class TestaFuncionario {

	public static void main(String[] args) {

		Exer02_Funcionarios c1 = new Exer02_Funcionarios("Andresa", 26, "RH", "Assistente", 2000.00f);

		c1.visualizar();

		Exer02_Funcionarios c2 = new Exer02_Funcionarios("Deiziane", 21, "CEO", "Engenharia de Software", 60000.00f);
		c2.visualizar();

		Gerente gt = new Gerente("Heimy Dias", 19, "COE", " Gerente UX", 70000.00f, "gerente");
		gt.visualizar();

		Gerente gt1 = new Gerente("Camile Albbuquerque", 22, "COE", " Gerente Ti", 5000.00f, "gerente");
		gt1.visualizar();
		
		Vendedor vd = new Vendedor("Geremy Gilbert", 18, "COE", " Vendedor", 2500.00f, "Vendas");
		vd.visualizar();
		
		Vendedor vd1 = new Vendedor("Selena Gilbert", 21, "COE", " Vendedora", 2000.00f, "Vendas");
		vd1.visualizar();
	}

	}


