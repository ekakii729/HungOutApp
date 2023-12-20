import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Clips extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clips frame = new Clips();
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
	public Clips() {
		setTitle("Highlight Clips");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 00, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton(">");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(425, 256, 51, 43);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(10, 256, 51, 43);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Like");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Liked!");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(51, 510, 76, 43);
		contentPane.add(btnNewButton_2);

		final JButton btnNewButton_2_1 = new JButton("Comment");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openCommentFrame();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(178, 510, 100, 43);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("Save");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2_2.setBounds(327, 510, 76, 43);
		contentPane.add(btnNewButton_2_2);
	}

	private void openCommentFrame() {
		final JFrame commentFrame = new JFrame("Comment");
		commentFrame.setBounds(600, 100, 300, 200);

		final JTextArea commentTextArea = new JTextArea();
		commentTextArea.setBounds(10, 10, 260, 100);

		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// need to save the comment into database
				// Close the comment frame
				commentFrame.dispose();
			}
		});
		submitButton.setBounds(40, 120, 80, 30);

		JButton viewComment = new JButton("View comment");
		viewComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openViewCommentsFrame();
				commentFrame.dispose();
			}
		});
		viewComment.setBounds(150, 120, 115, 30);

		commentFrame.getContentPane().setLayout(null);
		commentFrame.getContentPane().add(commentTextArea);
		commentFrame.getContentPane().add(submitButton);
		commentFrame.getContentPane().add(viewComment);

		commentFrame.setVisible(true);
	}

	private void openViewCommentsFrame() {
	    JFrame viewCommentsFrame = new JFrame("View Comments");
	    viewCommentsFrame.setBounds(550, 170, 400, 300);

	    JPanel commentsPanel = new JPanel(null);

	    JTextArea commentsTextArea = new JTextArea();
	    commentsTextArea.setEditable(false);

	    JScrollPane scrollPane = new JScrollPane(commentsTextArea);
	    scrollPane.setBounds(10, 40, 350, 200); 

	    // Add the JScrollBar to the JScrollPane
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	    commentsPanel.add(scrollPane);

	    viewCommentsFrame.getContentPane().add(commentsPanel);
	    viewCommentsFrame.setVisible(true);
	}

}
