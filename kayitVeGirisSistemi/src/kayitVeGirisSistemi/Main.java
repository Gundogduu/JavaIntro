package kayitVeGirisSistemi;

import kayitVeGirisSistemi.business.abstracts.UserService;
import kayitVeGirisSistemi.business.concretes.UserManager;
import kayitVeGirisSistemi.dataAccess.concretes.AbcUserDao;
import kayitVeGirisSistemi.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService service = new UserManager(new AbcUserDao());
		service.add(new User(1, "", "Gündoðdu", "karhanli34@outlook.com", "123456"));

	}

}
