package Aula_07;

public class TestaCliente {

	public static void main(String[] args) {
		   Clienteex01 tc = new Clienteex01("Jamille Farias" , 18, "Feminino" , "São Paulo" , "(11) 98856-0234");
	        tc.visualizar();
	        
	        System.out.println("\n");
	        
	        Clienteex01 tc1 = new Clienteex01("Heimy Dias" , 19, "Feminino" , "São Paulo" , "(11) 92251-7349");
	        tc1.visualizar();
	}

}
