package vetores_e_matrizes_arrays;

import java.util.Scanner;

public class vetores_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//valores: 2 5 1 3 4 9 7 8 10 6
//indices: 0 1 2 3 4 5 6 7 8  9
//valor da posicao 5 => nome-vetor[5] => 9

//intervalo numberIndex: [0 9]

		int [] numbers = {2,5,1,3,4,9,7,8,10,6}; // O tamanho é 10 - o 0 conta.
		int inputNumber;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		inputNumber = read.nextInt();
		
		
		
		for(int numberIndex = 0; numberIndex < numbers.length; numberIndex++ ) {  // length determina o tamanho de vetor
		   if( inputNumber == numbers[numberIndex]) {
			   System.out.println("O número "+inputNumber+" está localizado na posição "+numberIndex);
			   break;
		   } else if(numberIndex == numbers.length - 1) {
			   System.out.println("O número "+inputNumber+" não foi encontrado!");
		   }
		} // (init, condicao, contador)
		
	}

}
