package exercicios_de_repeticao_extras;

import java.util.Scanner;

public class exercicio2_repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int enterNumber, numbers, evenNumbers=0, oddNumbers=0;
		
		Scanner read = new Scanner(System.in);
		
		for(enterNumber=1; enterNumber<=10; enterNumber++) {
			System.out.println("Digite o "+enterNumber+"° número: ");
			numbers = read.nextInt();
			if (numbers %2 == 0) {
				evenNumbers++;
			}else {
				oddNumbers++;
			}
		}
		System.out.println("Temos "+evenNumbers+" números pares e "+oddNumbers+" números ímpares");
		
	}

}
