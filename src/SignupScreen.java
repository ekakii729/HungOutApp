/*
 * Creator(s): Diep Long, Abhay Manoj
 * Date of Creation: December 20th, 2023
 * Purpose: This is the sign-up screen for the program
 */

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class SignupScreen extends AuthenticationScreen {

	private final JPanel signUpPanel = getMainPanel(); // main panel of the screen
	private final JButton signUpButton = getMainButton(); // button to make a new account
	private final JButton signInButton = getOptionalButton(); // button to sign in

	public SignupScreen() {
		drawScreen("Sign up for HungOut");
		drawMainPanel();
		drawHeader("Create Account");
		drawUserNameSection();
		drawPasswordSection();
		drawPasswordConfirmation();
		drawMainButton("Sign Up");
		drawOptionalButton("Have an account?");
		setVisible(true);
	}

	/** Method Name: drawPasswordConfirmation
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Draws the password confirmation section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: Swing, AWT
	 * @Throws/Exceptions: N/A
	 */

	private void drawPasswordConfirmation() {
		JLabel passwordConfirmLabel = new JLabel("Confirm Password:"); // displays the confirm password text
		passwordConfirmLabel.setFont(getFont());
		passwordConfirmLabel.setBounds(34, 200, 163, 31);
		JPasswordField passwordConfirmFiled = new JPasswordField(); // takes in password input
		passwordConfirmFiled.setBounds(215, 200, 181, 37);
		signUpPanel.add(passwordConfirmLabel);
		signUpPanel.add(passwordConfirmFiled);
	}

	/** Method Name: mainButtonAction
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description The button action for "sign-up", makes a new account
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	@Override
	public void mainButtonAction() {
		System.out.println("hello!");
		// TO DO: actually make an account for them and add them to MYSQL database
	}

	/** Method Name: optionalButtonAction
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
	public void optionalButtonAction() {
		dispose();
		new LoginScreen();
	}

	/** Method Name: main
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Runs the sign-up screen
	 * @Parameters args - arguments to be passed in
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(SignupScreen::new);
	}
}
