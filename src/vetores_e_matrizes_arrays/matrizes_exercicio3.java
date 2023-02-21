package vetores_e_matrizes_arrays;

import java.util.Scanner;

public class matrizes_exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int [3][3];
		int [] mainDiagonal = new int[3];
		int [] secondaryDiagonal = new int[3];	
		int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Digite o valor da posição (%d , %d):\n", i, j);
				matrix[i][j] = read.nextInt();
				if(i == j) {
					//System.out.println("Numero da DP");
					mainDiagonal[i] = matrix[i][j];
					mainDiagonalSum += matrix[i][j];
				}
				if((i + j) == matrix.length-1) {
					//System.out.println("Numero da DS");
					secondaryDiagonal[i] = matrix[i][j];
					secondaryDiagonalSum += matrix[i][j];
				}
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i = 0; i < mainDiagonal.length; i++) {
			System.out.printf("%d ", mainDiagonal[i]);
		}
		System.out.printf("\n");
		System.out.println("Elementos da Diagonal Secundária: ");
		for(int i = 0; i < secondaryDiagonal.length; i++) {
			System.out.printf("%d ", secondaryDiagonal[i]);
		}
		System.out.printf("\n");
		System.out.println("Soma dos Elementos da Diagonal Principal: "+mainDiagonalSum);
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+secondaryDiagonalSum);
		
		
		/*for(int i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("|%d ", matrix[i][j]);
			}
			System.out.printf("\n");
		}*/
		
		
	}

}
