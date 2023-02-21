package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2_stack_pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice;
		String bookName;
		
		Stack<String> stack = new Stack<String>();
		
		Scanner read = new Scanner(System.in);
		
while(true) {
			
			System.out.println("----------------------------------------------------------");
			System.out.println("\t\t MENU ");
			System.out.println("\n 1- Adicionar livro na pilha ");
			System.out.println("\n 2- Listar todos os livros ");
			System.out.println("\n 3- Retirar livro da pilha ");
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
				System.out.println("\nQual o nome do livro? ");
				bookName = read.nextLine();
				stack.add(bookName);
				System.out.println("\nPilha: ");
				for(String client : stack) {
					System.out.println(client);
					}
				System.out.println("\nLivro adicionado!");
				break;
			case 2: 
				System.out.println("\nLista de livros na pilha: ");
				for(String client : stack) {
					System.out.println(client);
				}
				break;
			case 3: 
				if(!stack.isEmpty()) {
					stack.pop();
					System.out.println("\nPilha: ");
					for(String client : stack) {
						System.out.println(client);
					}
					System.out.println("\nUm livro foi retirado da pilha!");
				}else {
					System.out.println("A pilha está vazia!");
				}
				break;
			}
		}
	}
}

