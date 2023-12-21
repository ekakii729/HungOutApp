/*
 * Creator(s): Diep Long, Abhay Manoj
 * Date of Creation: December 20th, 2023
 * Purpose: This is the sign-up screen for the program
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class SignupScreen extends JFrame implements ActionListener {

	private JPanel signUpPanel; // main panel of the screen
	private JButton signUpButton; // button for signing up for an account
	private JButton signInButton; // button for signing in to an account

	public SignupScreen() {
		initScreen();
		initSignUpPanel();
		initCreateAccountLabel();
		initUserNameSection();
		initEnterPassWordSection();
		initConfirmPassWordSection();
		initSignUpButton();
		initHasAccountButton();
		setVisible(true);
	}

	/** Method Name: initScreen
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the screen
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initScreen() {
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 0, 450, 350);
		setResizable(false);
	}

	/** Method Name: initSignUpPanel
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the panel for the screen
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initSignUpPanel() {
		signUpPanel = new JPanel(null);
		signUpPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(signUpPanel);
	}

	/** Method Name: initCreateAccountLabel
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the create account label
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initCreateAccountLabel() {
		JLabel createAccountLabel = new JLabel("Create Account "); // displays the create account text
		createAccountLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 44));
		createAccountLabel.setBounds(80, 35, 347, 49);
		signUpPanel.add(createAccountLabel);
	}

	/** Method Name: initUserNameSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the username section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initUserNameSection() {
		JLabel userNameLabel = new JLabel("User name:"); // displays the username text
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userNameLabel.setBounds(34, 103, 105, 31);
		signUpPanel.add(userNameLabel);
		JTextField userNameTextField = new JTextField(); // takes in username input
		userNameTextField.setBounds(215, 103, 181, 37);
		userNameTextField.setColumns(10);
		signUpPanel.add(userNameTextField);
	}

	/** Method Name: initEnterPassWordSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the password section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initEnterPassWordSection() {
		JLabel passWordLabel = new JLabel("Password:"); // displays the password text
		passWordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passWordLabel.setBounds(34, 153, 90, 31);
		signUpPanel.add(passWordLabel);
		JPasswordField passwordField = new JPasswordField(); // takes in password input
		passwordField.setBounds(215, 153, 181, 37);
		signUpPanel.add(passwordField);
	}

	/** Method Name: initConfirmPassWordSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the confirm password section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initConfirmPassWordSection() {
		JLabel confirmPassWordLabel = new JLabel("Confirm Password:"); // displays the confirm password text
		confirmPassWordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		confirmPassWordLabel.setBounds(34, 200, 163, 31);
		signUpPanel.add(confirmPassWordLabel);
		JPasswordField confirmPassWordField = new JPasswordField(); // takes in password input
		confirmPassWordField.setBounds(215, 200, 181, 37);
		signUpPanel.add(confirmPassWordField);
	}

	/** Method Name: initSignUpButton
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the sign-up button
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initSignUpButton() {
		signUpButton = new JButton("Sign Up");
		signUpButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		signUpButton.addActionListener(this);
		signUpButton.setBounds(34, 249, 132, 37);
		signUpPanel.add(signUpButton);
	}

	/** Method Name: initHasAccountButton
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the has account button
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initHasAccountButton() {
		signInButton = new JButton("Have an account?");
		signInButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		signInButton.addActionListener(this);
		signInButton.setBounds(175, 249, 220, 37);
		signUpPanel.add(signInButton);
	}

	/** Method Name: actionPerformed
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Does an action depending on the button that was pressed
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signInButton) {
			dispose();
			LoginScreen logInScreen = new LoginScreen();
		}
	}

	/** Method Name: main
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Runs the sign-up screen
	 * @Parameters args - arguments ot be passed in
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(SignupScreen::new);
	}
}
