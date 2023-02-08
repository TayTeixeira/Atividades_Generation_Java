package variaveis_e_operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salary, allowance, newSalary;
		
		//objeto para leitura de entrada (inputs) do console
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salary = read.nextFloat();
		System.out.println("Digite o abono: ");
		allowance = read.nextFloat();
		newSalary = salary + allowance;
		System.out.printf("Novo salário: %.2f", newSalary);
		
		
		

	}

}
