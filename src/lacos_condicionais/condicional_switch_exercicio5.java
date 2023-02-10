package lacos_condicionais;

import java.util.Scanner;

public class condicional_switch_exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int productCode, amount;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		productCode = read.nextInt();
		System.out.println("Digite a quantidade: ");
		amount = read.nextInt();
		
		switch(productCode) {
		case 1: 
			System.out.println("Produto: Cachorro quente");
			System.out.println("Valor total: " + (10.0 * amount));
			break;
		case 2: 
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: " + (15.0 * amount));
			break;
		case 3: 
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: " + (18.0 * amount));
			break;
		case 4: 
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: " + (12.0 * amount));
			break;
		case 5: 
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: " + (8.0 * amount));
			break;
		case 6: 
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: " + (13.0 * amount));
			break;
		}
		
		
	}

}
