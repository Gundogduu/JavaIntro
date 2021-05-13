package interfacesInTheVideo;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//i� kodlar�
		customerDal.add();
	}
}

//kullan�c� unutabilir diye CustomerManager direkt newlenirken parametre olarak customerDal s�n�f� istemesini sa�lad�k.
