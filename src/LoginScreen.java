/*
 * Creator(s): Diep Long
 * Date of Creation: December 20th, 2023
 * Purpose: This is the log in screen for the program
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginScreen extends JFrame implements ActionListener {

	private JPanel logInPanel; // the panel for the log in screen

	public LoginScreen() {
		initScreen();
		initLogInSection();
		initUserNameLabel();
		initSignInSection();
		initPassWordSection();
		initForgotPassWordButton();
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
		setTitle("Sign in to HungOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 0, 500, 600);
	}

	/** Method Name: initLogInSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the login section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initLogInSection() {
		logInPanel = new JPanel(null);
		logInPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(logInPanel);
		JTextField logInTextField = new JTextField(); // the log in text field
		logInTextField.setBounds(153, 113, 164, 49);
		logInTextField.setColumns(10);
		logInPanel.add(logInTextField);
	}

	/** Method Name: initUserNameLabel
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the username label
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initUserNameLabel() {
		JLabel userNameLabel = new JLabel("Username:"); // the label for the username
		userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		userNameLabel.setBounds(42, 129, 92, 13);
		logInPanel.add(userNameLabel);
	}

	/** Method Name: initSignInSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the sign in section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initSignInSection() {
		JButton signInButton = new JButton("Sign In"); // the button to sign in
		signInButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		signInButton.addActionListener(this);
		signInButton.setBounds(153, 323, 164, 29);
		logInPanel.add(signInButton);
		JLabel signInLabel = new JLabel("Sign In"); // the label to sign in
		signInLabel.setBounds(183, 10, 105, 35);
		signInLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		logInPanel.add(signInLabel);
	}

	/** Method Name: initPassWordSection
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the password section
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initPassWordSection() {
		JLabel passWordLabel = new JLabel("Password:"); // the label for the password
		passWordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passWordLabel.setBounds(42, 255, 92, 13);
		logInPanel.add(passWordLabel);
		JPasswordField passwordField = new JPasswordField(); // the field for the password
		passwordField.setBounds(153, 238, 164, 50);
		logInPanel.add(passwordField);
	}

	/** Method Name: initForgotPassWordButton
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Initializes the forgot password button
	 * @Parameters N/A
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	private void initForgotPassWordButton() {
		JButton forgotPassWordButton = new JButton("Forgot your password?");
		forgotPassWordButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		forgotPassWordButton.setOpaque(false);
		forgotPassWordButton.setContentAreaFilled(false);
		forgotPassWordButton.setBorderPainted(false);
		forgotPassWordButton.setBounds(135, 298, 195, 21);
		forgotPassWordButton.addActionListener(this);
		logInPanel.add(forgotPassWordButton);
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

	}

	/** Method Name: main
	 * @Author Diep Long
	 * @Date December 20, 2023
	 * @Modified December 20, 2023
	 * @Description Runs the log in screen
	 * @Parameters args - arguments ot be passed in
	 * @Returns N/A, Data Type: Void
	 * @Dependencies: N/A
	 * @Throws/Exceptions: N/A
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(LoginScreen::new);
	}
}
