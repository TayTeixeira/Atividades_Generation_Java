package programacao_orientada_a_objetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Osvinalda","12/02/1996","osvinalda@email.com","Rua do homem torto, bairro casa torta, número 01","+55(11)94002-8922");
		
		Cliente cliente2 = new Cliente("Juricema","20/09/2001","juricema@email.com","Rua dos Diamantes, bairro Sonhadora, número 10","+55(11)93221-2011");
		
		cliente1.view();
		
		cliente2.view();
		
		
	}
}
