package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//abstract ile bu þekilde referans tutturabiliyoruz.
		GameCalculator calculator = new KidsGameCalculator();

	}

}
