package Aula_07;

public class PessoaJuridica extends Clienteex01 {
	String cnpj;

	public PessoaJuridica(String nome, int idade, String sexo, String cidade, String telefone, String cnpj) {
		super(nome, idade, sexo, cidade, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void visualizar( ) {
        super.visualizar();
        System.out.println("CNPJ: " + this.cnpj);
	}
}

