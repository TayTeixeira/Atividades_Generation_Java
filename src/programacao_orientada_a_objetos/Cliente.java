package programacao_orientada_a_objetos;

public class Cliente {

	private String name;
	private String dateOfBirth;
	private String email;
	private String address;
	private String phoneNumber;
	
	
	public Cliente(String name, String dateOfBirth, String email, String address, String phoneNumber) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void view() {
		System.out.println("Nome: "+this.name);
		System.out.println("Data de nascimento: "+this.dateOfBirth);
		System.out.println("Número celular: "+this.phoneNumber);
		System.out.println("Email: "+this.email);
		System.out.println("Endereço: "+this.address+"\n");
	}
	

}
