package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}

//note: isimlendirme olarak ProductRepository diye de kullanýlýyor.
//note: ArrayList'ler generic'tir. Ýstediðiniz türde elemaný istediðiniz kadar ekleyebilirsiniz. 
//"int[]" bu türdeki dizinlerde sonradan eleman ekleyemiyorduk.
//ArrayList<Product> yerine List<Product> yazdýk.Farketmiyor List, ArrayList'in base'idir.