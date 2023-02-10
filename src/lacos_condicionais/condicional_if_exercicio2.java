package lacos_condicionais;

import java.util.Scanner;

public class condicional_if_exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		Scanner read = new Scanner(System.in);	
		
		System.out.println("Entre com um número: ");
		number = read.nextInt();
		
		/*if( number % 2 == 0) { // Verifica se o numero eh par. Todo numero par tem resto da divisao por 2 = 0
			// se entrar aqui, a gente sabe que o numero eh par, porem a gente ainda nao sabe se ele eh
			//  positivo ou negativo, por isso tenho que verificar
			if(number>=0) { // Verifica se o numero eh maior ou igual a zero, pois todo numero positivo eh maior ou igual a zero
				// esse if acima verifica se eh positivo. Nesse ponto a gente ja sabe se o numero eh par
				System.out.println("O número é par e positivo!");
				}
			else {
			System.out.println("O número é par e negativo!");	
			}
		}
		else{ // se o numero nao eh par ele soh pode ser impar
			// se entrar aqui, a gente sabe que o numero eh impar, porem a gente ainda nao sabe se ele eh
			//  positivo ou negativo, por isso tenho que verificar
			if(number>=0) { // verifica novamente se o numero eh maior ou igual a zero
				System.out.println("O número é ímpar e positivo!");
				}
			else {
			System.out.println("O número é ímpar e negativo!");	
			}
		}*/
		
		if((number % 2 == 0) && (number >= 0)) { // Verifica se o numero eh par e positivo
				System.out.println("O número é par e positivo!");		
		}
		else if((number % 2 == 0) && (number < 0)) // Verifica se o numero eh par e negativo
		{
			System.out.println("O número é par e negativo!");	
		}
		
		else if(!(number % 2 == 0) && (number >= 0)) {// Verifica se o numero nao eh par (impar) e positivo
			System.out.println("O número é ímpar e positivo!");
		}
		else if(!(number % 2 == 0) && (number < 0)){ // Verifica se o numero nao eh par (impar) e negativo
			// Como eh o caso que nao foi olhado nos elses e ifs acima, poderia ser soh um else aqui, mas tudo bem ser um else if
			System.out.println("O número é ímpar e negativo!");	
		}
}}
