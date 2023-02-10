package lacos_de_repeticao_for_while_dowhile;

import java.util.Scanner;

public class laco_repeticao_while_exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int peopleAge, ageUnder21 = 0, ageAbove50 = 0;
		
		Scanner read = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		peopleAge = read.nextInt();
		
		while(peopleAge >= 0) {
			if(peopleAge < 21) {
				ageUnder21++;
			}else if(peopleAge > 50) {
				ageAbove50++;
			}
			System.out.println("Digite uma idade: ");
			peopleAge = read.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: "+ageUnder21);
		System.out.println("Total de pessoas maiores de 50 anos: "+ageAbove50);
	}
}
