package Aula_07;

public class Gerente extends Exer02_Funcionarios {
	String area;

	public Gerente(String nome, int idade, String departamento, String funcao, float salario, String area) {
		super(nome, idade, departamento, funcao, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public void visualizar( ) {
        super.visualizar();
        System.out.println("area: " + this.area);
}
}
