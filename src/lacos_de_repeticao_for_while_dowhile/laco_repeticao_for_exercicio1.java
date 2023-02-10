package lacos_de_repeticao_for_while_dowhile;

import java.util.Scanner;

public class laco_repeticao_for_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber, secondNumber;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número do intervalo: ");
		firstNumber = read.nextInt();
		System.out.println("Entre com o último número do intervalo: ");
		secondNumber = read.nextInt();
		
		if(firstNumber < secondNumber) {
			System.out.println("No intervalo entre "+firstNumber+" e "+secondNumber);
			for(int i = firstNumber; i <= secondNumber; i++)
			{
				if((i%3 == 0) && (i%5 == 0)) {
					System.out.println(i+" é múltiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("Intervalo Inválido!");
		}
	}

}
