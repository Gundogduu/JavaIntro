package interfacesInTheVideo;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
//		manager.customerDal = new OracleCustomerDal();
		manager.add();
	}

}

//kullan�c� unutabilir diye CustomerManager direkt newlenirken parametre olarak customerDal s�n�f� istemesini sa�lad�k.
//		manager.customerDal = new OracleCustomerDal();