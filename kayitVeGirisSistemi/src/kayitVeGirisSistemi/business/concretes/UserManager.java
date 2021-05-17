package kayitVeGirisSistemi.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kayitVeGirisSistemi.business.abstracts.UserService;
import kayitVeGirisSistemi.dataAccess.abstracts.UserDao;
import kayitVeGirisSistemi.entities.concretes.User;

public class UserManager implements UserService{
	private static final String emailRegex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User add(User user) {
		validation(emailRegex, user.geteMail());
		if(!checkFirstNameIsValid(user.getFirstName())) {
			System.out.println("You name must be min. 2 char!");
		}
		if(!checkLastNameIsValid(user.getLastName())) {
			System.out.println("You last name must be min. 2 char!");
		}
		if(!checkPasswordIsValid(user.getPassword())) {
			System.out.println("Your password must be min. 6 char!");
		}
		return user;
	}

	@Override
	public User get(int id) {
		return this.userDao.get(id);
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	@Override
	public boolean userExists(String email) {
		return this.userExists(email);
	}
	
	public boolean validation(String regex,String toBeVerified) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(toBeVerified);
		boolean matchFound = matcher.find();
		if(matchFound) {
		    System.out.println("Valid e-mail adress,thanks!");
			return true;
		}else {
			System.out.println("InValid e-mail adress,try again!");
			return false;
		}
    }
	
	public boolean checkPasswordIsValid(String password) {
		if(password.length()<=5) {
			return false;
		}else if(password == null) {
			return false;
		}
		return true;
	}
	
	public boolean checkFirstNameIsValid(String firstName) {
		if(firstName.length()<=2) {
			return false;
		}
		return true;
	}
	
	public boolean checkLastNameIsValid(String lastName) {
		if(lastName.length()<2) {
			return false;
		}
		return true;
	}
}


