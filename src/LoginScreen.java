/*
 * Creator(s): Diep Long, Abhay Manoj
 * Date of Creation: December 20th, 2023
 * Purpose: This is the log in screen for the program
 */

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginScreen extends AuthenticationScreen {

	private final JPanel logInPanel = getMainPanel(); // the panel for the log in screen
	private final JButton signInButton = getMainButton(); // button to sign in
	private final JButton forgotPasswordButton = getOptionalButton(); // button to reset password

	public LoginScreen() {
		drawScreen("Sign in to HungOut");
		drawMainPanel();
		drawHeader("Sign In");
		drawUserNameSection();
		drawPasswordSection();
		drawMainButton("Sign In");
		drawOptionalButton("Forgot Password?");
		setVisible(true);
	}

	/** Method Name: mainButtonAction
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description The button action for "sign-in", logs in
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	@Override
	public void mainButtonAction() {
		System.out.println("hello!");
		// TO DO: actually log in
	}

	/** Method Name: optionalButtonAction
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description The button action for "forgot password", helps user recover account
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	@Override
	public void optionalButtonAction() {
		System.out.println("Hello");
		// TO DO: Find a way to reset password
	}

	/** Method Name: main
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Runs the log in screen
	 * @Parameters args - arguments to be passed in
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(LoginScreen::new);
	}
}
