package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public SuccessDataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}








//note: Spring'in çalışma yapısı; 
//   private ProductDao productDao; --- burada productDao injection'ı yapıyoruz.
// ProductDao bir interface ve JpaRepository interface'ini extend ediyor. Yani burada bir class yok! Generic olarak çalışıyor. Spring, "JpaRepository<Product, Integer>" de verdiğimiz değerlere göre arka tarafta generic bir repository class'ı oluşturuyor 
// ve o instance'ı ProductManager'daki injection'da verecek. Fakat intance'ı constructor'a vereceğine dair bir bilgi yok, yani o instance'ın ne olduğuna dair bir bilgi yok! işte bunu @Autowired annotation'uyla hallediyoruz.
//note: @Autowired --- Spring ile geliyor. Bağımlılk yapsa da java dünyasında %100'e yakını bunu kullanıyor. Farklı konfigrasyon yapmak isterseniz araştırabilirsiniz.
// C# kampında AutofacBusinessModule'da bu interface gelirse bunu ver, şu interface gelirse şunu ver işlemini bizim yerimize "Spring" burada @Autowired ile yapıyor.
// fakat c#'daki solid açısından daha doğruydu. Bu daha kolay, projeyi tarayıp constructor parametresindeki interface'e karşılık gelen sınıf varsa onu bulup yerleştiriyor. Injection'ı bu şekilde yapıyor.
//note: 	@Autowired
//          private ProductDao productDao; --- böylede direkt kullanılabilir fakat başka injection yapıldığında ona da @Autowired eklemek gerekiyor. O yüzden constructor ile topluca yaptık.
//note: beans --- proje class'ı demek.
//note: @Service --- bu class projede servis görevi görecek diye Spring'e bilgi veriyoruz.
//note: @Autowired olayını anlamadıysanız bir önceki dersteki(5.gün) injection'ı yakalayın.Yine anlamazsanız ilerde zaten tekrar göreceğiz.




