package interfaces;

public class Main {
	
	public static void main(String[] args) {
		Logger[] loggers = {new SmsLooger(), new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"Engin","Demiroð");
		customerManager.add(engin);
	}
}

//Dependency Injection da birden fazla çoklu parametre girebilmek için enjekte edeceðimiz base class'ý listeye çevirmeliyiz ve main'de yani kullanacaðýmýz yerde, liste þeklinde çaðýrmalýyýz!
//Bir metotta bir logger, baþka metotta baþka logger kullanmamýz gerekirse injection'ý constructor seviyesinde deðil, metot seviyesinde yani metot parametresinde girmemiz gerekiyor.Ama ilerde bu iþlemi Annotation(C#'da[Aspect]) ile yapacaðýz.