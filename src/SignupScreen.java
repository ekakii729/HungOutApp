/*
 * Creator(s): Diep Long, Abhay Manoj
 * Date of Creation: December 20th, 2023
 * Purpose: This is the sign-up screen for the program
 */

import java.awt.EventQueue;
import javax.swing.*;

public class SignupScreen extends AuthenticationScreen {

	private final JPanel signUpPanel = getMainPanel(); // main panel of the screen
	private final JButton signUpButton = getMainButton(); // button to make a new account
	private final JButton signInButton = getOptionalButton(); // button to sign in
	private final JPasswordField passwordField = getPasswordField(); // field where password is entered
	private final JTextField emailInputField = new JTextField(); // takes in email input
	private final JTextField usernameField = getUsernameField(); // field where username is entered

	public SignupScreen() {
		drawScreen("Sign up for HungOut");
		drawMainPanel();
		drawHeader("Create Account");
		drawUserNameSection();
		drawPasswordSection();
		drawEmailInput();
		drawMainButton("Sign Up");
		drawOptionalButton("Have an account?");
		setVisible(true);
	}

	/** Method Name: drawEmailInput
	 * @Author Diep Long, Abhay Manoj
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Draws the email input section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: Swing, AWT
	 * @Throws/Exceptions: N/A
	 */

	private void drawEmailInput() {
		JLabel emailInputLabel = new JLabel("Enter email:"); // displays the confirm password text
		emailInputLabel.setFont(getFont());
		emailInputLabel.setBounds(34, 200, 163, 31);
		emailInputField.setBounds(215, 200, 181, 37);
		signUpPanel.add(emailInputLabel);
		signUpPanel.add(emailInputField);
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
		String username = usernameField.getText(); // inputted username
		String password = new String(passwordField.getPassword()); // inputted password
		String email = emailInputField.getText(); // inputted email
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
