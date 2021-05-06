package overriding;

public class BaseKrediManager {
	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}
}


//FINAL keyword'üyle base'de verilen deðerin diðer classlarda deðiþtirilmemesini saðlayabilirsiniz.
//yani bir metodun Override edilmesini FINAL ile engelleyebilirsiniz.