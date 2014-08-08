package test.classes;
import test.forms.*;

public class LoginClass extends MainPageForm{
	
	public void Login() {
				
		logger.step(1);
		MainPageForm login = new MainPageForm();
		login.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(2);
		login.LoginQuit();
		}
	}