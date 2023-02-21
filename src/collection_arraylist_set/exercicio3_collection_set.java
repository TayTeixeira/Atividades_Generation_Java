package collection_arraylist_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio3_collection_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value;
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("\nInsira um número: ");
			value = read.nextInt();
			numbers.add(value);
		}
		
		System.out.println("\nLista dos números: ");
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
	}

}



