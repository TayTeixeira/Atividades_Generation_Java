package vetores_e_matrizes_arrays;

import java.util.Scanner;

public class matrizes_exercicio3_bonus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix;
		int [] mainDiagonal;
		int [] secondaryDiagonal;
		int mainDiagonalSum = 0, secondaryDiagonalSum = 0, line, column;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas da matriz: ");
		line = read.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz: ");
		column = read.nextInt();
		
		if(line == column) {
			
			matrix = new int [line][column];
			mainDiagonal = new int [line];
			secondaryDiagonal = new int [line];
			
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
		}else {
			System.out.println("Dimensões inválidas. A entrada precisa ser uma matriz quadrada.");
		}
		
		
		
		
		/*for(int i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("|%d ", matrix[i][j]);
			}
			System.out.printf("\n");
		}*/
		
		
	}
}
