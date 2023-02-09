package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalEventTimeInSeconds, hours, minutes, seconds;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Entre com o tempo total em segundos: ");
		totalEventTimeInSeconds = read.nextInt();
		
		hours = totalEventTimeInSeconds / 3600;
		minutes = (totalEventTimeInSeconds % 3600)/ 60;
		seconds = (totalEventTimeInSeconds % 3600) % 60;
		
		System.out.println(" O tempo total do evento é de: "+hours+" horas, "+minutes+" minutos e "+seconds+" segundos ");
		

	}

}