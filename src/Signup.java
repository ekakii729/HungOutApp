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

/**
 * @author ADMINS
 * Description: Demo for login(sign up)
 */
public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 00, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account ");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 44));
		lblNewLabel.setBounds(110, 35, 347, 49);
		contentPane.add(lblNewLabel);
// Create their user name		
		textField = new JTextField();
		textField.setBounds(215, 167, 181, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(34, 173, 105, 31);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Confirm Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(34, 270, 163, 31);
		contentPane.add(lblNewLabel_2);
// Sign up, when user click it will move to sign in page to sign in 		
		final JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
        			login newlogin=new login();
        			newlogin.setVisible(true);
        			dispose();
        		}
        	}
        });
		btnNewButton.setBounds(159, 329, 132, 37);
		contentPane.add(btnNewButton);
		
		
// if the user already have account and click sign in will move to sign in page	        
	        lblNewLabel_3 = new JLabel("Already have an account ?");
	        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_3.setBounds(10, 453, 213, 21);
	        contentPane.add(lblNewLabel_3);
	        btnNewButton_2 = new JButton("Sign in");
	        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	        btnNewButton_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if(e.getSource()==btnNewButton_2) {
	        			login newlogin=new login();
	        			newlogin.setVisible(true);
	        			dispose();
	        		}
	        	}
	        });
	        btnNewButton_2.setOpaque(false);
	        btnNewButton_2.setContentAreaFilled(false);
	        btnNewButton_2.setBorderPainted(false);
	        btnNewButton_2.setBounds(233, 453, 115, 21);
	        contentPane.add(btnNewButton_2);
	        
	        lblNewLabel_5 = new JLabel("Password:");
	        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lblNewLabel_5.setBounds(34, 223, 90, 31);
	        contentPane.add(lblNewLabel_5);
// create user password	        
	        passwordField = new JPasswordField();
	        passwordField.setBounds(215, 223, 181, 37);
	        contentPane.add(passwordField);
// confirm their password again	        
	        passwordField_1 = new JPasswordField();
	        passwordField_1.setBounds(215, 270, 181, 37);
	        contentPane.add(passwordField_1);
	}
}
