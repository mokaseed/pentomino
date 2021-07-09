package model;

public class LoginLogic {
	public boolean execute(String password) {
		if("webtext".equals(password)) {
			return true;
		}
		return false;
	}

}
