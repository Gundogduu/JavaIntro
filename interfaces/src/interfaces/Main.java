package interfaces;

public class Main {
	
	public static void main(String[] args) {
		Logger[] loggers = {new SmsLooger(), new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"Engin","Demiro�");
		customerManager.add(engin);
	}
}

//Dependency Injection da birden fazla �oklu parametre girebilmek i�in enjekte edece�imiz base class'� listeye �evirmeliyiz ve main'de yani kullanaca��m�z yerde, liste �eklinde �a��rmal�y�z!
//Bir metotta bir logger, ba�ka metotta ba�ka logger kullanmam�z gerekirse injection'� constructor seviyesinde de�il, metot seviyesinde yani metot parametresinde girmemiz gerekiyor.Ama ilerde bu i�lemi Annotation(C#'da[Aspect]) ile yapaca��z.