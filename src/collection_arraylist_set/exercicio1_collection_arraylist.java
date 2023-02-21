package collection_arraylist_set;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1_collection_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputColors;
		
		ArrayList<String> colors = new ArrayList<String>();
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Escreva uma cor: ");
			inputColors = read.nextLine();
					
			colors.add(inputColors);
					
		}
		
		System.out.println("\nLista das cores: ");

		for(int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
			
		}
		
		colors.sort(null);
		System.out.println("\nOrdem crescente das cores: ");

		for(int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		
		}
	}
}
	