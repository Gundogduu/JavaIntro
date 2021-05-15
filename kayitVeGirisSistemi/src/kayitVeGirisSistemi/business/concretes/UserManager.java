package kayitVeGirisSistemi.business.concretes;

import java.util.List;

import kayitVeGirisSistemi.business.abstracts.UserService;
import kayitVeGirisSistemi.dataAccess.abstracts.UserDao;
import kayitVeGirisSistemi.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(!user.getFirstName().isEmpty() &&
		   !user.getLastName().isEmpty() &&
		   !user.geteMail().isEmpty() &&
		   !user.getPassword().isEmpty()){
			this.userDao.add(user);
		}
		System.err.println("Tüm bilgileri eksiksiz girdiðinizden emin olun!");
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
