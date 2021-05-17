package kayitVeGirisSistemi.business.concretes;

import kayitVeGirisSistemi.business.abstracts.AuthService;
import kayitVeGirisSistemi.business.abstracts.UserService;
import kayitVeGirisSistemi.core.abstracts.AuthenticationService;
import kayitVeGirisSistemi.core.abstracts.MailService;
import kayitVeGirisSistemi.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private MailService mailService;
	private AuthenticationService authenticationService;
	
	public AuthManager(UserService userService, MailService mailService) {
		super();
		this.userService = userService;
		this.mailService = mailService;
	}
	
	public AuthManager(UserService userService, MailService mailService, AuthenticationService authenticationService) {
		super();
		this.userService = userService;
		this.mailService = mailService;
		this.authenticationService = authenticationService;
	}

	@Override
	public void login(User user) {
		User loginUser = userService.add(user);
		if(loginUser != null) {
			System.out.println("Logged in successfully - " + user.getFirstName());
		}
		
	}

	@Override
	public void register(User user) throws InterruptedException {
		User registerUser = userService.add(user);
		if(registerUser != null) {
			int code = mailService.send(user.geteMail());
		}
		
	}

	@Override
	public void registerWithGoogle(User user) {
		User registerUser = userService.add(user);
		if(registerUser != null) {
			int code = mailService.send(user.geteMail());
			authenticationService.login(user);
		}
		
	}

}
