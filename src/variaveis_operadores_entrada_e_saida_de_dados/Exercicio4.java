package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		double r, s, d;
		// O retorno do pow é double
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		a = read.nextInt();
		System.out.println("Entre com o segundo valor: ");
		b = read.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		c = read.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		System.out.println("O resultado é: " +d);
		
		
		
	}

}
