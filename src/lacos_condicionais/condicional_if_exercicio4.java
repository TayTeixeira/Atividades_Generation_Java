package lacos_condicionais;

import java.util.Scanner;

public class condicional_if_exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String feature1, feature2, feature3;
			
			Scanner read = new Scanner(System.in);
			
			System.out.println("Entre com a primeira característica: ");
			feature1 = read.nextLine();
			System.out.println("Entre com a segunda característica: ");
			feature2 = read.nextLine();
			System.out.println("Entre com a terceira característica: ");
			feature3 = read.nextLine();
			
			if(feature1.compareToIgnoreCase("Vertebrado") == 0) { // Verifica se a feature 1 eh igual a Vertebrado
				if(feature2.compareToIgnoreCase("Ave") == 0) {
					if(feature3.compareToIgnoreCase("Carnivoro") == 0) {
						System.out.println("Aguia");
						}else if(feature3.compareToIgnoreCase("Onivoro") == 0) {
							System.out.println("Pomba");
					}
				}else if(feature2.compareToIgnoreCase("Mamifero") == 0) {	
					if(feature3.compareToIgnoreCase("Onivoro") == 0) {
						System.out.println("Homem");
						}else if(feature3.compareToIgnoreCase("Herbivoro") == 0) {
							System.out.println("Vaca");
				}
			}else if(feature1.compareToIgnoreCase("Invertebrado") == 0) { // Verifica se a feature 1 eh igual a invertebrado
				if(feature2.compareToIgnoreCase("Inseto") == 0) {
					if(feature3.compareToIgnoreCase("Hematofago") == 0) {
						System.out.println("Pulga");
						}else if(feature3.compareToIgnoreCase("Herbivoro") == 0) {
							System.out.println("Lagarta");
					}
				}else if(feature2.compareToIgnoreCase("Anelideo") == 0) {	
					if(feature3.compareToIgnoreCase("Hematofago") == 0) {
						System.out.println("Sanguessuga");
						}else if(feature3.compareToIgnoreCase("Onivoro") == 0) {
							System.out.println("Minhoca");
				}
			}
		
	}

}
			}
	}
