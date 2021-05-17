package kayitVeGirisSistemi.business.abstracts;

import kayitVeGirisSistemi.entities.concretes.User;

public interface UserService {
	User add(User user);
	User get(int id);
	User getByEmail(String email);
	boolean userExists(String email);
}
