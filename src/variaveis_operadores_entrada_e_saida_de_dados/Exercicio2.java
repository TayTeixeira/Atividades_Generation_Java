package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int personAgeInDays,years,months,days;
		
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Entre com sua idade em dias: ");
		personAgeInDays = read.nextInt();
		
		years = personAgeInDays / 365;
		months = (personAgeInDays % 365)/ 30;
		days = (personAgeInDays % 365) % 30;
		
		System.out.println(" Sua idade total é: "+years+" anos, "+months+" meses e "+days+" dias ");
		

	}

}