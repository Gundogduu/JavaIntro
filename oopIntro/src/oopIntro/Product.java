package oopIntro;

public class Product {
	
	//constructor
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	//overloading:aþýrý yükleme
	//constructor'daki parametrelerin Product class'ýndaki attribute'lerle bir baðlantýsý yoktu.Ama "this" ile eþleþtirdik.
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
