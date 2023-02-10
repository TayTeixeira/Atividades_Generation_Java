package lacos_de_repeticao_for_while_dowhile;

import java.util.Scanner;

public class laco_repeticao_dowhile_exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers, positiveNumbers = 0; 	
		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numbers = read.nextInt();
			if(numbers > 0) {
				positiveNumbers = positiveNumbers + numbers; 
			}
		}while(numbers != 0);
		System.out.println("A soma dos números positivos é: "+positiveNumbers);
	}
}
