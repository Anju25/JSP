package Business_logic;

public class Registration_Validation {

	public boolean checkuserdetails(String email, String password, String confirmpassword) {
		if(check(email) && password.equals(confirmpassword))
			return true;
		return false;
	}

	private boolean check(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean value=email.matches(regex);
		return value;
	}

}
