package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float score1, score2, score3, weightedArithmeticMean;
		
		Scanner read = new Scanner(System.in); 
		
		System.out.println("Entre com a primeira nota: ");
		score1 = read.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		score2 = read.nextFloat();
		System.out.println("Encontre a terceira nota: ");
		score3 = read.nextFloat();
		
		weightedArithmeticMean = ((score1 * 2) + (score2 * 3) + (score3 * 5)) / (2 + 3 + 5);
				
		System.out.println("O resultado da média ponderada é: " +weightedArithmeticMean);

	}

}
