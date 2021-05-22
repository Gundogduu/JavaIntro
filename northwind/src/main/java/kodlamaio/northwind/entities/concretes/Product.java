package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
}

//note: lombok constructor'ı eklemiyor biz ekledik.
//Java'da Annotation - C#'da Attribute
//note: @Entity --- veritabanı nesnesi olduğunu söylüyoruz.
//note: veritabanıyla bire bir aynı isimlendirmeyi vermeliyiz!
//note: @Table(name="products") --- vetitabanında hangi tabloya denk geldiğini söylüyoruz.
//note: @Column(name="product_id") --- veritabanında hangi kolona denk geldiğini söylüyoruz.
//note: @Id --- tablodaki id alanının ne olduğunu söylemeniz gerekiyor. Biz JPA'ya bunun implementasyonu olan Hibernate'e aslında bu tablonun "id" sinin ne olduğunu veriyoruz. Sorgular bu id'ye göre yapılır.  
//note: @GeneratedValue --- id'nin bir bir arttığını söylüyoruz. Id nin nasıl üretildiğini söylememiz gerekiyor.
// başka teknikleride google'dan araştırabilirsiniz.
//note: Farklı bir veritabanı sistemi kullanırsak Entity'ler için aynı "isimlendirme geleneği(name convention)" yaparak tüm sistemlerde sorun yaşamamış oluruz.
//note: @Id, @GeneratedValue,@Column() için sıra önemli değil. Ama Annotation'lar bazı yerlerde önem arz edebilir.
// solid'e uymuyor dediğim konu buydu zaten! Sen bir tabloda, bir class'ta birden fazla iş yapmaya çalışırsan, o an patlamazsın ama ilerde değişim geldiğinde patlarsın.
// ama Java dünyası topluluğu böyle, bizde böyle çalıştık hep projelerde.
//note: İlerleyen zamanlarda buraları refactor edeceğiz...







