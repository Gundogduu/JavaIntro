package interfacesInTheVideo;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}

//implements'in extends'ten fark� birden fazla eklenebilir olmas�.
//bir class hem 1 extends, hem birden fazla implements i�erebilir.