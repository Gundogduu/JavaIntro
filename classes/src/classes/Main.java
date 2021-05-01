package classes;

public class Main {
	
	//classlar referans tiptir
	//customerManager = customerManager2; denildiğinde customerManager'ın bellekte tuttuğu eski yer "Garbage Collector" tarafından silinir.
	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		
		//reference type
		int[] sayilar1 = new int[] {1,2,3};   //int[] sayilar1 = {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
