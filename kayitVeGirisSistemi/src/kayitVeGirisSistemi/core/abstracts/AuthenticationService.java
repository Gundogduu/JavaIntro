package kayitVeGirisSistemi.core.abstracts;

import kayitVeGirisSistemi.entities.concretes.User;

public interface AuthenticationService {
	void login(User user);
}
