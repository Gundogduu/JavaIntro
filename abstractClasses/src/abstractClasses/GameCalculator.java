package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public void gameOver() {
		System.out.println("Oyun bitti");
	}
}

//Abstract class'lar�n normal classlardan fark�; 
// new'lenemez olmas� ve "default" i�ini doldurmadan sadece imzas�n� bar�nd�rarak, implement edecek class'da i�inin doldurulmas�n� zorunlu k�laca��m�z metotlar� bar�nd�rabilmemizdir.