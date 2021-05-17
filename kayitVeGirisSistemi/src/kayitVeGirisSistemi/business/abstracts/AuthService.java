package kayitVeGirisSistemi.business.abstracts;

import kayitVeGirisSistemi.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user) throws InterruptedException;
	void registerWithGoogle(User user);
}
