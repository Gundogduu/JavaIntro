package nLayeredDemo.jLogger;


public class JLoggerManager {
	public void log(String message) {
		System.out.println("J Logger ile logland�. " + message);
	}
}

//MICRO SERVICE enjekte etme �rne�i...
//note: microservis mimarileri'de aynen bu mant�kla sisteme enjekte edilir.
//note: JLogger'daki j javay� temsil eder ve javada bir isimlendirme standard� JLogger,JAspect,JReository gibi ileride g�rece�iz "Maven" ile birlikte..
