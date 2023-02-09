package variaveis_operadores_entrada_e_saida_de_dados;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double consumerCost, factoryCost, distributorPercentage, percentageTax, percentageSum, taxAndDistributorValue;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor do custo de fábrica: ");
		factoryCost = read.nextDouble();
		
		distributorPercentage = 28.0/100;
		percentageTax = 45.0/100;
		percentageSum = distributorPercentage + percentageTax;
		taxAndDistributorValue = factoryCost * percentageSum;
		consumerCost = factoryCost + taxAndDistributorValue;  
		
		System.out.printf("O custo final para o consumidor é de: R$%.2f", consumerCost);
		
		

	}

}
