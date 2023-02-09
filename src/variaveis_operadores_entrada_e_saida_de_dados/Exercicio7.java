package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c, d, e, f, x, y;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		a = read.nextFloat();
		System.out.println("Entre com o valor de b: ");
		b = read.nextFloat();
		System.out.println("Entre com o valor de c: ");
		c = read.nextFloat();
		System.out.println("Entre com o valor de d: ");
		d = read.nextFloat();
		System.out.println("Entre com o valor de e: ");
		e = read.nextFloat();
		System.out.println("Entre com o valor de f: ");
		f = read.nextFloat();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x é: " +x+ "\nO valor de y é: " +y);

	}

}
