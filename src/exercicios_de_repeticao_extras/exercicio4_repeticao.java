package exercicios_de_repeticao_extras;

import java.util.Scanner;

public class exercicio4_repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age, gender, option;
		int calmUnder18 = 0, angryAbove40 = 0, calmPeople = 0, othersCalm = 0;
		int angryWomen = 0, agressiveMen = 0, people = 0;
		
		Scanner read = new Scanner(System.in);
		
		while(people < 1) {
			System.out.println("--------------------------------------");
			System.out.printf("Ente com as informações da %d° pessoa:\n", people+1);
			System.out.println("Qual a sua idade? ");
			System.out.print("=> ");
			age = read.nextInt();
			System.out.println("\nQual o seu gênero? ");
			System.out.println("1-feminino \n2-masculino \n3-Outros");
			System.out.print("\n=> ");
			gender = read.nextInt();
			System.out.println("Qual opção você se identifica mais? ");
			System.out.println("1-Uma pessoa calma \n2-Uma pessoa nervosa \n3-Uma pessoa agressiva");
			System.out.print("=> ");
			option = read.nextInt();
			
			switch(option) {
				case 1: 
					calmPeople++; //pessoa calma
					if(gender == 3) {
						othersCalm++; //pessoa calma e com genero outros
					}
					if(age < 18) {
						calmUnder18++; //pessoa calma e menor de idade
					}
					break;
					
				case 2:
					if(gender == 1) {
						angryWomen++; //mulher nervosa
					}
					if(age > 40) {
						angryAbove40++; //pessoa nervosa e acima de 40 anos
					}
					break;
					
				case 3:
					if(gender == 2) {
						agressiveMen++; //homem agressivo
					}
					break;
				
			}
			people++;
			
		}
		System.out.println("\nResultado:");
		System.out.println("Número de pessoas calmas: "+calmPeople);
		System.out.println("Número de mulheres nervosas: "+angryWomen);
		System.out.println("Número de homens agressivos: "+agressiveMen);
		System.out.println("Número de outros calmos: "+othersCalm);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+angryAbove40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+calmUnder18++);
	}

}
	

