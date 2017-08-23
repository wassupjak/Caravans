import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainMenu {

	private JFrame frmMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setBounds(100, 100, 450, 300);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		JLabel lblAnD = new JLabel("A&D Caravans");
		lblAnD.setBounds(177, 6, 95, 16);
		frmMainMenu.getContentPane().add(lblAnD);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setBounds(191, 24, 68, 16);
		frmMainMenu.getContentPane().add(lblMainMenu);
		
		JButton btnCustomers = new JButton("Customers...");
		btnCustomers.setBounds(143, 66, 162, 29);
		frmMainMenu.getContentPane().add(btnCustomers);
		
		JButton btnCaravans = new JButton("Caravans");
		btnCaravans.setBounds(143, 107, 162, 29);
		frmMainMenu.getContentPane().add(btnCaravans);
		
		JButton btnEvents = new JButton("Events");
		btnEvents.setBounds(143, 148, 162, 29);
		frmMainMenu.getContentPane().add(btnEvents);
	}
}
