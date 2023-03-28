package Aula_07;

public class PessoaFisica extends Clienteex01{

	String cpf;

	public PessoaFisica(String nome, int idade, String sexo, String cidade, String telefone, String cpf) {
		super(nome, idade, sexo, cidade, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void visualizar( ) {
        super.visualizar();
        System.out.println("CPF: " + this.cpf);

	}
}


