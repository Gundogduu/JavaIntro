package kayitVeGirisSistemi;

import java.util.Scanner;

import kayitVeGirisSistemi.business.abstracts.AuthService;
import kayitVeGirisSistemi.business.abstracts.UserService;
import kayitVeGirisSistemi.business.concretes.AuthManager;
import kayitVeGirisSistemi.business.concretes.UserManager;
import kayitVeGirisSistemi.core.concretes.GoogleAuthAdapter;
import kayitVeGirisSistemi.core.concretes.MailSenderManager;
import kayitVeGirisSistemi.core.concretes.VerificationManager;
import kayitVeGirisSistemi.dataAccess.concretes.AbcUserDao;
import kayitVeGirisSistemi.entities.concretes.User;
import kayitVeGirisSistemi.google.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		
		UserService service = new UserManager(new AbcUserDao());
		User user = new User(1, "Hayri", "Gündoðdu", "karhanli34@outlook.com", "123456");
		
		AuthService authService = new AuthManager(new UserManager(new AbcUserDao()), new MailSenderManager(), new GoogleAuthAdapter(new GoogleAuthManager()));
		authService.registerWithGoogle(user);
		
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.checkVerificationCode(code);
		
	}

}
