package demo.test.classes;
import demo.test.forms.*;

public class LoginClass extends LoginForm{
	
	public void Login() {
				
		logger.step(1);
		LoginForm lgf = new LoginForm();
		lgf.Login("courseProject", "q1w2e3r4t5y6");
		logger.step(2);
		lgf.LoginQuit();
		}
	}