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

/**
 * @author ADMINS
 * Description: Demo for login(sign in)
 */
public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setTitle("Sign in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 00, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("User name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 129, 92, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setBounds(183, 10, 105, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(42, 255, 92, 13);
		contentPane.add(lblNewLabel_1_1);
//	 	Allow the user to input their user name
		textField = new JTextField();
		textField.setBounds(153, 113, 164, 49);
		contentPane.add(textField);
		textField.setColumns(10);
// this is a button if the user forgot their password 		
		btnNewButton_1 = new JButton("Forgot your password ?");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(135, 298, 195, 21);
		contentPane.add(btnNewButton_1);
// Sign in button
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.setBounds(153, 323, 164, 29);
		contentPane.add(btnNewButton);
// 	Allow the user to input their password 
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 238, 164, 50);
		contentPane.add(passwordField);
	}
}
