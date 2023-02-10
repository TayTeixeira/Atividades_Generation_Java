package lacos_condicionais;

import java.util.Scanner;

public class condicional_if_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valueA, valueB, valueC, sum1, resultSum1;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		valueA = read.nextDouble();
		System.out.println("Entre com o valor de B: ");
		valueB = read.nextDouble();
		System.out.println("Entre com o valor de C: ");
		valueC = read.nextDouble();
		
		sum1 = valueA + valueB;
		System.out.printf("\nO resultado da somatória é: %.2f", sum1);
		
		if (sum1>valueC) {
			System.out.printf("\nA soma dos valores A e B é maior do que o valor C: %.2f ", valueC);
		}
		else if (sum1<valueC) {
			System.out.printf("\nA soma dos valores A e B é menor do que o valor C: %.2f ", valueC);
		}
		else if (sum1==valueC) {
			System.out.printf("\nA soma dos valores A e B é igual ao valor C: %.2f ", valueC);
		}
		
				
	}

}
