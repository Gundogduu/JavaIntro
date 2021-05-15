package kayitVeGirisSistemi.business.abstracts;

import java.util.List;

import kayitVeGirisSistemi.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
}
