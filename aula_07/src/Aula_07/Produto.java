package Aula_07;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
  
	public Produto(int i, String string, int j, String string2, LocalDate data, float f) {
		// TODO Auto-generated constructor stub
	}

	public class Processo{
		
		private int id;
		private String nome; 
		private int versao;
		private String produtora;
		private LocalDate dataLancamento;
		private float preco;
		
		public Processo(int id, String nome, int versao, String produtora, LocalDate dataLançamento, float preco) {
			this.id = id;
			this.nome = nome;
			this.versao = versao;
			this.produtora = produtora;
			this.dataLancamento = dataLançamento;
			this.preco = preco;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getVersao() {
			return versao;
		}

		public void setVersao(int versao) {
			this.versao = versao;
		}

		public String getProdutora() {
			return produtora;
		}

		public void setProdutora(String produtora) {
			this.produtora = produtora;
		}

		public LocalDate getDataLançamento() {
			return dataLancamento;
		}

		public void setDataLançamento(LocalDate dataLançamento) {
			this.dataLancamento = dataLançamento;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}
		public void visualizar() {
		
		//formataçao de dinheiro
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
	   System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Versão: " + this.versao);
        System.out.println("produtora: " + this.produtora);
//		System.out.println("Data de lancamento: " + this.dataLancamento.format//(date));
        System.out.println("Preço: " + nfMoeda.format (this.preco));
	}
}
}