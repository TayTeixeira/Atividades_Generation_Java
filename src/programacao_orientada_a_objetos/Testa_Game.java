package programacao_orientada_a_objetos;

public class Testa_Game {

	public static void main(String[] args) {

		Produto_Loja_Game game1 = new Produto_Loja_Game("Sea of Thieves", 89.99, "12 anos", "03/06/2020", "Rare Ltda");

		Produto_Loja_Game game2 = new Produto_Loja_Game("DayZ", 119.99, "18 anos", "13/12/2018", "Bohemia Interactive");

		game1.view();

		game2.view();

	}
}
