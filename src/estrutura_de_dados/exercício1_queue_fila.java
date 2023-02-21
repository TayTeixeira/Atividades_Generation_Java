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
		
		while(true) {
			
			System.out.println("----------------------------------------------------------");
			System.out.println("\t\t MENU ");
			System.out.println("\n 1- Adicionar Cliente na Fila ");
			System.out.println("\n 2- Listar todos os Clientes ");
			System.out.println("\n 3- Retirar Cliente da Fila ");
			System.out.println("\n 0- Sair ");
			System.out.println("----------------------------------------------------------");
			
			userChoice = read.nextInt();
		
			if(userChoice == 0) {
				System.out.println("Programa Finalizado!");
				read.close();
				System.exit(0);
			}
			
			switch(userChoice) {
			case 1: 
				read.nextLine(); // consome o \n
				System.out.println("\nQual o nome do cliente? ");
				clientName = read.nextLine();
				queue.add(clientName);
				System.out.println("\nFila: ");
				for(String client : queue) {
					System.out.println(client);
					}
				System.out.println("\nCliente adicionado!");
				break;
			case 2: 
				System.out.println("\nLista de clientes na fila: ");
				for(String client : queue) {
					System.out.println(client);
				}
				break;
			case 3: 
				if(!queue.isEmpty()) {
					queue.poll();
					System.out.println("\nFila: ");
					for(String client : queue) {
						System.out.println(client);
					}
					System.out.println("\nO cliente foi chamado!");
				}else {
					System.out.println("A fila está vazia!");
				}
				break;
			}
		}
		
	}

}
