package kayitVeGirisSistemi.dataAccess.abstracts;

import kayitVeGirisSistemi.entities.concretes.User;

public interface UserDao {
	User add(User user);
	User get(int id);
	User getByEmail(String email);
	boolean userExists(String email);
	
}
