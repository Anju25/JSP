package Business_logic;

public class Validation {

	public boolean validInput(String email, String password) 
	{
		if(email.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("admin"))
			return true;
		return false;
	}

}
