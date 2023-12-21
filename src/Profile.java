import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JCheckBox;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setTitle("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 00, 500, 600);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Full Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(25, 130, 96, 28);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(173, 135, 121, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(25, 186, 96, 28);
		contentPane.add(lblEmail);

		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfBirth.setBounds(25, 254, 96, 28);
		contentPane.add(lblDateOfBirth);

		JLabel lblSkillLevel = new JLabel("Skill Level:");
		lblSkillLevel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSkillLevel.setBounds(25, 330, 96, 28);
		contentPane.add(lblSkillLevel);

		JLabel lblPreferedSport = new JLabel("Preferred Sports:");
		lblPreferedSport.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreferedSport.setBounds(25, 406, 121, 28);
		contentPane.add(lblPreferedSport);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 191, 121, 22);
		contentPane.add(textField_1);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));		comboBox.setMaximumRowCount(31);
		comboBox.setBounds(173, 258, 46, 21);
		contentPane.add(comboBox);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"}));		comboBox_1.setBounds(254, 258, 56, 21);
		contentPane.add(comboBox_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setBounds(339, 260, 56, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Beginner", "Intermediate", "Advanced", "Expert" }));
		comboBox_2.setBounds(173, 335, 99, 28);
		contentPane.add(comboBox_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Basketball");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(173, 411, 93, 21);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Badmintoon");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setBounds(266, 411, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Soccer");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_2.setBounds(173, 449, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Tennis");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_3.setBounds(266, 449, 93, 21);
		contentPane.add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Hockey");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_4.setBounds(369, 411, 93, 21);
		contentPane.add(chckbxNewCheckBox_4);

		JLabel lblNewLabel_1 = new JLabel("Profile");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(194, 44, 151, 44);
		contentPane.add(lblNewLabel_1);

		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Volleyball");
		chckbxNewCheckBox_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_3_1.setBounds(369, 449, 93, 21);
		contentPane.add(chckbxNewCheckBox_3_1);

		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("Football");
		chckbxNewCheckBox_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_3_2.setBounds(173, 485, 93, 21);
		contentPane.add(chckbxNewCheckBox_3_2);

		JCheckBox chckbxNewCheckBox_3_2_1 = new JCheckBox("More:");
		chckbxNewCheckBox_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox_3_2_1.setBounds(266, 485, 72, 21);
		contentPane.add(chckbxNewCheckBox_3_2_1);

		textField_3 = new JTextField();
		textField_3.setBounds(346, 486, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(155, 520, 172, 33);
		contentPane.add(btnNewButton);
	}
}
