package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

//dýþarýdan eriþilebilmesi için iki þeye ihtiyacýmýz var.
//1- parametresiz,parametreli constructor oluþturmak
//2- getter ve setter'larýný oluþturmak

//super() >>> eðer onu inherit eden bir sýnýf varsa o sýnýfýn parametresiz constructor'ýnýda çalýþtýr demek.