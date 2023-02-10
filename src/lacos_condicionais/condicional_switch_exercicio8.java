package lacos_condicionais;

import java.util.Scanner;

public class condicional_switch_exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operationCode;
		float value, balance= 1000;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o código da operação: ");
		operationCode = read.nextInt();
		
		
		switch(operationCode) {
		case 1:
			System.out.printf("O seu saldo é: R$%.2f", balance);
			break;
		case 2:
			System.out.println("Entre com o valor do saque: ");
			value = read.nextFloat();
			if(value <= balance) {
				System.out.printf("Novo saldo: R$%.2f", (balance - value));	
			}else {
				System.out.printf("Saldo insuficiente!");
			}
			
			break;
		case 3:
			System.out.println("Entre com o valor do depósito: ");
			value = read.nextFloat();
			System.out.printf("Novo Saldo: R$%.2f", (balance + value));
			break;
			
		default:
			System.out.printf("Operação inválida!");
			break;
		}
		
		

	}

}
