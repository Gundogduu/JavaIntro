package overriding;

public class BaseKrediManager {
	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}
}


//FINAL keyword'�yle base'de verilen de�erin di�er classlarda de�i�tirilmemesini sa�layabilirsiniz.
//yani bir metodun Override edilmesini FINAL ile engelleyebilirsiniz.