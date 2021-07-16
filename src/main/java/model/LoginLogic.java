package model;

public class LoginLogic {
	public boolean execute(User user) {
		if("1234".equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
