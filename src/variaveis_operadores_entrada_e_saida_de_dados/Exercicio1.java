package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int personAge,monthAge,daysAge,year,month;
		
		month = 30;
		year = 365;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		personAge = read.nextInt();
		System.out.println("Entre com os meses: ");
		monthAge = read.nextInt();
		System.out.println("Entre com os dias: ");
		daysAge = read.nextInt();
		
		monthAge = monthAge * month;
	    personAge = personAge * year;
	    daysAge = daysAge + personAge + monthAge;
	    
	    System.out.println("Sua idade em dias é: " +daysAge);

	}

}
