package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p1, x1, y1, p2, x2, y2, d;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x1: ");
		x1 = read.nextFloat();
		System.out.println("Entre com o valor de y1: ");
		y1 = read.nextFloat();
		System.out.println("Entre com o valor de x2: ");
		x2 = read.nextFloat();
		System.out.println("Entre com o valor de y2: ");
		y2 = read.nextFloat();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt((p1+p2));
		
		System.out.println("O resultado é: " +d);
		
				
		

	}

}
