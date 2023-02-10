package lacos_condicionais;

import java.util.Scanner;

public class condicional_switch_exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float number1, number2;
		int operationCode;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		number1 = read.nextFloat();
		System.out.println("Entre com o segundo número: ");
		number2 = read.nextFloat();
		System.out.println("Entre com o código da operação: ");
		operationCode = read.nextInt();
		
		switch(operationCode){
		case 1: 
			System.out.printf("%.1f + %.1f = %.1f", number1, number2, (number1+number2));
			break;
		case 2: 
			System.out.printf("%.1f - %.1f = %.1f", number1, number2, (number1-number2));
			break;
		case 3: 
			System.out.printf("%.1f * %.1f = %.1f", number1, number2, (number1*number2));
			break;
		case 4: 
			System.out.printf("%.1f / %.1f = %.1f", number1, number2, (number1/number2));
			break;
		default:
			System.out.printf("Operação inválida! ");
		}

	}

}
