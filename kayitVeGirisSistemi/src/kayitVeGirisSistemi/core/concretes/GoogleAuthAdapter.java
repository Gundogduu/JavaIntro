package kayitVeGirisSistemi.core.concretes;

import kayitVeGirisSistemi.core.abstracts.AuthenticationService;
import kayitVeGirisSistemi.entities.concretes.User;
import kayitVeGirisSistemi.google.GoogleAuthManager;

public class GoogleAuthAdapter implements AuthenticationService{

	private GoogleAuthManager googleAuthManager;
	
	public GoogleAuthAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user.geteMail(), user.getPassword());
		
	}


}
