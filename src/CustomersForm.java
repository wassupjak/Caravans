import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.sun.istack.internal.FragmentContentHandler;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomersForm {

	private JFrame frmCustomersForm;
	private JTable tblCustomers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomersForm window = new CustomersForm();
					window.frmCustomersForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomersForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomersForm = new JFrame();
		frmCustomersForm.setBounds(100, 100, 900, 300);
		frmCustomersForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		tblCustomers = new JTable(SetUpTable());
//		scrollPane.add(tblCustomers);
		scrollPane.setViewportView(tblCustomers);
		tblCustomers.setFillsViewportHeight(true);
		
		JLabel label = new JLabel("Main Menu");
		
		JLabel label_1 = new JLabel("A&D Caravans");
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCustomersForm.dispose();
				CustomerEditForm.main(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmCustomersForm.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(407)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(label_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(407))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
					.addGap(40))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(754, Short.MAX_VALUE)
					.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(8)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNew)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		frmCustomersForm.getContentPane().setLayout(groupLayout);
	}
	private CustomerListCols SetUpTable() {
		Main.FCustomers.clear();
		Main.FCustomers.PopulateAllCustomers();		
		CustomerListCols VCusListCols = new CustomerListCols(Main.FCustomers);
		return VCusListCols;
	}
	
	private Customer getCustomer() {
		Customer VCustomer = null;
		int rownum = tblCustomers.getSelectedRow();
		int CustId = (int) tblCustomers.getValueAt(0, rownum);
		VCustomer = Main.FCustomers.getCustomerById(CustId);
		return VCustomer;
	}
}
