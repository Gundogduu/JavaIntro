package kayitVeGirisSistemi.dataAccess.concretes;



import java.util.ArrayList;
import java.util.Arrays;

import kayitVeGirisSistemi.dataAccess.abstracts.UserDao;
import kayitVeGirisSistemi.entities.concretes.User;

public class AbcUserDao implements UserDao{
	
	//fake veritabaný
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User(1, "Fatih", "Nadir", "nadir2@gmail.com", "147258")));

	@Override
	public User add(User user) {
		users.add(user);
		System.out.println("save to db: " + user.getFirstName());
		return user;
	}
	
	@Override
	public User get(int id) {
		User selected = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		return selected;
	}

	@Override
	public User getByEmail(String email) {
		User selected = users.stream().filter(u -> u.geteMail() == email).findFirst().orElse(null);
		return selected;
	}

	@Override
	public boolean userExists(String email) {
		User selected = users.stream().filter(e -> e.geteMail().equals(email)).findFirst().orElse(null);
		if(selected != null) {
			return true;
		}
		return false;
	}
}
