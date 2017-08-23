import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frame;
	private JTextField txtServerAddress;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Main Menu");
		label.setBounds(191, 24, 68, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("A&D Caravans");
		label_1.setBounds(177, 6, 95, 16);
		frame.getContentPane().add(label_1);
		
		txtServerAddress = new JTextField();
		txtServerAddress.setBounds(185, 77, 130, 26);
		frame.getContentPane().add(txtServerAddress);
		txtServerAddress.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(185, 115, 130, 26);
		frame.getContentPane().add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(185, 153, 130, 26);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblServerAddress = new JLabel("Server Address:");
		lblServerAddress.setBounds(62, 82, 111, 16);
		frame.getContentPane().add(lblServerAddress);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(62, 120, 111, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(62, 158, 111, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(198, 216, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(62, 216, 117, 29);
		frame.getContentPane().add(btnClose);
	}
}
