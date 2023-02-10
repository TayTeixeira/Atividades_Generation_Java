package lacos_condicionais;

import java.util.Scanner;

public class condicional_switch_exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String namePerson;
		int roleCode;
		float salary; 
		double newSalary;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		namePerson = read.nextLine();
		System.out.println("Digite o código do cargo: ");
		roleCode = read.nextInt();
		System.out.println("Digite o seu salário: ");
		salary = read.nextFloat();
		
		switch(roleCode) {
		case 1: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Gerente");
			newSalary = salary + (0.1 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		case 2: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Vendedor");
			newSalary = salary + (0.07 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		case 3: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Supervisor");
			newSalary = salary + (0.09 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		case 4: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Motorista");
			newSalary = salary + (0.06 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		case 5: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Estoquista");
			newSalary = salary + (0.05 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		case 6: 
			System.out.println("Nome do colaborador: "+ namePerson);
			System.out.println("Cargo: Técnico de TI");
			newSalary = salary + (0.08 * salary);
			System.out.println("Novo Salário: R$" + newSalary);
			break;
		}

	}

}
