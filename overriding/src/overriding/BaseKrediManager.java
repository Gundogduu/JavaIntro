package overriding;

public class BaseKrediManager {
	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}
}


//FINAL keyword'üyle base'de verilen değerin diğer classlarda değiştirilmemesini sağlayabilirsiniz.
//yani bir metodun Override edilmesini FINAL ile engelleyebilirsiniz.