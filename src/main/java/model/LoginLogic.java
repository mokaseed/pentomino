package model;

public class LoginLogic {
	public boolean execute(User user) {
		if("webtext".equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
