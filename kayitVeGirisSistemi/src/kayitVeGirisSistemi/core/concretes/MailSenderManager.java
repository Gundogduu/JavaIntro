package kayitVeGirisSistemi.core.concretes;

import java.util.Random;

import kayitVeGirisSistemi.core.abstracts.MailService;

public class MailSenderManager implements MailService{

	@Override
	public int send(String email) {
		int code = generateVerificationCode();
		System.out.println("Email address: " + email + "\nVerification Code: " + code);
		return code;
	}

	@Override
	public int generateVerificationCode() {
		Random random = new Random();
		int code = random.nextInt(9999);
		return code;
	}

}
