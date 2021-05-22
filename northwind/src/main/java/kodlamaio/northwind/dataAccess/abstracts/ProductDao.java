package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}






























//note: Interface, Interface'i extend eder.
//note: JpaRepository<> --- verdiğin veri tipi için, yani @Entity annotation'uyla süslenmiş nesne için(Product), "Primary key" alanınıda verdiğimizde gerekli sorguları ona göre hazırlıyor.
//note: public interface ProductDao extends JpaRepository<Product, Integer> ---  JpaRepository ile birlikte şu an ürünle tüm "CRUD" operasyonlarımız hazır.
//note: Daha önceki C# kampında yaptığımız "EntityFrameworkBaseRepository" ye burada "JpaRepository" karşılık geliyor. Bizim yerimize hazırladı.