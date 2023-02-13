package exercicios_de_repeticao_extras;

import java.util.Scanner;

public class exercicio1_repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int numbers;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Os números que dividos por 11 e tem resto igual a 5 são: ");
		
		for(numbers=1000; numbers<1999; numbers++) {
			if(numbers%11==5) {
				System.out.println(""+numbers);
			}
		}
		
		
	}

}
