package programacao_orientada_a_objetos;

public class Produto_Loja_Game {
	
	private String name;
	private double price;
	private String ageRating;
	private String releaseDate;
	private String developer;
	
	
	public Produto_Loja_Game(String name, double price, String ageRating, String releaseDate, String developer) {
		this.name = name;
		this.price = price;
		this.ageRating = ageRating;
		this.releaseDate = releaseDate;
		this.developer = developer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAgeRating() {
		return ageRating;
	}


	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getDeveloper() {
		return developer;
	}


	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	public void view() {
		System.out.println("Nome do jogo: "+this.name);
		System.out.println("Preço: R$"+this.price);
		System.out.println("Classifcação de idade: "+this.ageRating);
		System.out.println("Data de lançamento: "+this.releaseDate);
		System.out.println("Empresa desenvolvedora: "+this.developer+"\n");
	}
	
}
