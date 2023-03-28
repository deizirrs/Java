package Aula_07;

public class TestaCliente {

	public static void main(String[] args) {
		   Clienteex01 tc = new Clienteex01("Jamille Farias" , 18, "Feminino" , "São Paulo" , "(11) 98856-0234");
	        tc.visualizar();
	        
	        System.out.println("\n");
	        
	        Clienteex01 tc1 = new Clienteex01("Heimy Dias" , 19, "Feminino" , "São Paulo" , "(11) 92251-7349");
	        tc1.visualizar();
	        
	        PessoaFisica pf = new PessoaFisica ("Deiziane Rodrigues", 21,"Feminino", "São Paulo", "(11) 95689-4803", "954.548.142-35");
	        pf.visualizar();
	        
	        PessoaFisica pf1 = new PessoaFisica ("Rose Clark", 23,"Feminino", "Santa Catarina", "(11) 94687-4983", "294.5648.442-69");
	        pf1.visualizar();
	        
	        PessoaJuridica pj = new PessoaJuridica ("Guilherme Souza", 43,"Masculino", "Rio de Janeiro", "(21) 98667-7383", "56.253.758/0001-22");
	        pj.visualizar();
	        
	        PessoaJuridica pj1 = new PessoaJuridica ("José da Silva", 19,"Masculino", "São Paulo", "(11) 93357-7213", "65.253.915/0001-85");
	        pj1.visualizar();
	        
	}

}
