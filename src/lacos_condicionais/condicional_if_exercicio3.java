package lacos_condicionais;

import java.util.Scanner;

public class condicional_if_exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String donorName;
		int age;
		boolean firstDonation;

		Scanner read = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		donorName = read.nextLine();
		System.out.println("Qual a sua idade? ");
		age = read.nextInt();
		System.out.println("É a sua primeira doação? ");
		firstDonation = read.nextBoolean();

		if ((age >= 18) && (age <= 59)) {
			System.out.println(donorName + ", você pode doar! ");
		} else if ((age >= 60) && (age <= 69)) {
			if (firstDonation == true) {
				System.out.println(donorName + ", você não pode doar :(");
			} 
			else {
				System.out.println(donorName + ", Você pode doar!");
			}
		} else {
			System.out.println(donorName + ", você não pode doar!");
		}
	}
}
