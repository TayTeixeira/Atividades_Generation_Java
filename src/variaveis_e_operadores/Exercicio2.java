package variaveis_e_operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float score1, score2, score3, score4, scoreMean;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		score1 = read.nextFloat();
		System.out.println("Digite a segunda nota: ");
		score2 = read.nextFloat();
		System.out.println("Digite a terceira nota: ");
		score3 = read.nextFloat();
		System.out.println("Digite a quarta nota: ");
		score4 = read.nextFloat();
		scoreMean = (score1 + score2 + score3 + score4) / 4;
		System.out.printf("Sua média é: %.1f", scoreMean);
		

	}

}
