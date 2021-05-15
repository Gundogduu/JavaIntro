package kayitVeGirisSistemi.dataAccess.concretes;

import java.util.List;

import kayitVeGirisSistemi.dataAccess.abstracts.UserDao;
import kayitVeGirisSistemi.entities.concretes.User;

public class AbcUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("save to db: " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
