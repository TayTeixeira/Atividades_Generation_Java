package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercício1_queue_fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice;
		String clientName;

		Scanner read = new Scanner(System.in);
		
		Queue<String> queue = new LinkedList<String>();
		
		do {
			System.out.println("----------------------------------------------------------");
			System.out.println("\t\t MENU ");
			System.out.println("\n 1- Adicionar Cliente na Fila ");
			System.out.println("\n 2- Listar todos os Clientes ");
			System.out.println("\n 3- Retirar Cliente da Fila ");
			System.out.println("\n 0- Sair ");
			System.out.println("----------------------------------------------------------");
			
			userChoice = read.nextInt();
			switch(userChoice) {
			case 1: 
				System.out.println("Qual o nome do cliente? ");
				clientName = read.nextLine();
				queue.add(clientName);
				System.out.println("\nClientes na fila: "+queue);
				System.out.println(queue.poll());
				break;
			};
		}
		while(userChoice > 0);
		
	}

}
