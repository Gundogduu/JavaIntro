package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m�steri ekleme kodlar�
		System.out.println("M��teri eklendi");
		//DatabaseLogger logger = new DatabaseLogger(); >>> yerine "Base" s�n�f�n� parametreye yazarak kullan�c�n�n �al��mak istedi�i logger'a g�re loglama yap�lmas�n� sa�lad�k.
		logger.log();
	}
}
