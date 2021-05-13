package interfaces;

public class SmsLooger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi: " + message);
		
	}

}
