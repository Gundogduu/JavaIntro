package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public void gameOver() {
		System.out.println("Oyun bitti");
	}
}

//Abstract class'larýn normal classlardan farký; 
// new'lenemez olmasý ve "default" içini doldurmadan sadece imzasýný barýndýrarak, implement edecek class'da içinin doldurulmasýný zorunlu kýlacaðýmýz metotlarý barýndýrabilmemizdir.