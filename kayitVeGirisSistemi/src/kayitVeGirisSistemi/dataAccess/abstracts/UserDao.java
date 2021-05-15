package kayitVeGirisSistemi.dataAccess.abstracts;

import java.util.List;

import kayitVeGirisSistemi.entities.concretes.User;

public interface UserDao {
	void add(User user);
	User get(int id);
	List<User> getAll();
	
}
