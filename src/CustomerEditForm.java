import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerEditForm {

	private JFrame frmCustEdit;
	private JTextField txtTitle;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtCity;
	private JTextField txtCounty;
	private JTextField txtPostCode;
	private JTextField txtCountry;
	private JTextField txtHomePhone;
	private JTextField txtMobilePhone;
	private JTextField txtEmail;
	private JTextField txtCustomerID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerEditForm window = new CustomerEditForm();
					window.frmCustEdit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerEditForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustEdit = new JFrame();
		frmCustEdit.setBounds(100, 100, 454, 543);
		frmCustEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewCustomer = new JLabel("New Customer");
		lblNewCustomer.setBounds(182, 29, 73, 16);
		
		JLabel label_1 = new JLabel("A&D Caravans");
		label_1.setBounds(173, 11, 92, 16);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(160, 101, 218, 20);
		txtTitle.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(51, 104, 99, 14);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(160, 129, 218, 20);
		txtFirstName.setColumns(10);
		frmCustEdit.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(51, 132, 99, 14);
		frmCustEdit.getContentPane().add(lblFirstName);
		frmCustEdit.getContentPane().add(txtFirstName);
		frmCustEdit.getContentPane().add(lblTitle);
		frmCustEdit.getContentPane().add(txtTitle);
		frmCustEdit.getContentPane().add(lblNewCustomer);
		frmCustEdit.getContentPane().add(label_1);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(51, 160, 99, 14);
		frmCustEdit.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(160, 157, 218, 20);
		frmCustEdit.getContentPane().add(txtLastName);
		
		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setBounds(51, 188, 99, 14);
		frmCustEdit.getContentPane().add(lblAddress1);
		
		txtAddress1 = new JTextField();
		txtAddress1.setColumns(10);
		txtAddress1.setBounds(160, 185, 218, 20);
		frmCustEdit.getContentPane().add(txtAddress1);
		
		JLabel lblAddress2 = new JLabel("Address 2:");
		lblAddress2.setBounds(51, 216, 99, 14);
		frmCustEdit.getContentPane().add(lblAddress2);
		
		txtAddress2 = new JTextField();
		txtAddress2.setColumns(10);
		txtAddress2.setBounds(160, 213, 218, 20);
		frmCustEdit.getContentPane().add(txtAddress2);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(51, 244, 99, 14);
		frmCustEdit.getContentPane().add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(160, 241, 218, 20);
		frmCustEdit.getContentPane().add(txtCity);
		
		JLabel lblCounty = new JLabel("County:");
		lblCounty.setBounds(51, 272, 99, 14);
		frmCustEdit.getContentPane().add(lblCounty);
		
		txtCounty = new JTextField();
		txtCounty.setColumns(10);
		txtCounty.setBounds(160, 269, 218, 20);
		frmCustEdit.getContentPane().add(txtCounty);
		
		JLabel lblPostCode = new JLabel("Post Code:");
		lblPostCode.setBounds(51, 300, 99, 14);
		frmCustEdit.getContentPane().add(lblPostCode);
		
		txtPostCode = new JTextField();
		txtPostCode.setColumns(10);
		txtPostCode.setBounds(160, 297, 218, 20);
		frmCustEdit.getContentPane().add(txtPostCode);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(51, 328, 99, 14);
		frmCustEdit.getContentPane().add(lblCountry);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(160, 325, 218, 20);
		frmCustEdit.getContentPane().add(txtCountry);
		
		txtHomePhone = new JTextField();
		txtHomePhone.setColumns(10);
		txtHomePhone.setBounds(160, 353, 218, 20);
		frmCustEdit.getContentPane().add(txtHomePhone);
		
		JLabel lblHomePhone = new JLabel("Home Phone:");
		lblHomePhone.setBounds(51, 356, 99, 14);
		frmCustEdit.getContentPane().add(lblHomePhone);
		
		txtMobilePhone = new JTextField();
		txtMobilePhone.setColumns(10);
		txtMobilePhone.setBounds(160, 384, 218, 20);
		frmCustEdit.getContentPane().add(txtMobilePhone);
		
		JLabel lblMobilePhone = new JLabel("Mobile Phone:");
		lblMobilePhone.setBounds(51, 387, 99, 14);
		frmCustEdit.getContentPane().add(lblMobilePhone);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(160, 415, 218, 20);
		frmCustEdit.getContentPane().add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(51, 418, 99, 14);
		frmCustEdit.getContentPane().add(lblEmail);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SaveFormData();
			}
		});
		btnSave.setBounds(298, 471, 89, 23);
		frmCustEdit.getContentPane().add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomersForm.main(null);
			frmCustEdit.dispose();
			}
		});
		btnClose.setBounds(197, 471, 89, 23);
		frmCustEdit.getContentPane().add(btnClose);
		
		txtCustomerID = new JTextField();
		txtCustomerID.setText("{New}");
		txtCustomerID.setEditable(false);
		txtCustomerID.setColumns(10);
		txtCustomerID.setBounds(160, 73, 218, 20);
		frmCustEdit.getContentPane().add(txtCustomerID);
		
		JLabel lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setBounds(51, 76, 99, 14);
		frmCustEdit.getContentPane().add(lblCustomerId);
	}
	
	public void SaveFormData() {
		Customer VCustomer = new Customer();
		VCustomer.setTitle(txtTitle.getText());
		VCustomer.setFirstName(txtFirstName.getText());
		VCustomer.setLastName(txtLastName.getText());
		VCustomer.setAddress1(txtAddress1.getText());
		VCustomer.setAddress2(txtAddress2.getText());
		VCustomer.setCity(txtCity.getText());
		VCustomer.setCounty(txtCounty.getText());
		VCustomer.setPostCode(txtPostCode.getText());
		VCustomer.setCountry(txtCountry.getText());
		VCustomer.setHomePhone(txtHomePhone.getText());
		VCustomer.setMobilePhone(txtMobilePhone.getText());
		VCustomer.setEmail(txtEmail.getText());
		VCustomer.save();
//		if (NewId > -1) {
//			txtCustomerID.setText(NewId + "");
//		}else {
//			JOptionPane.showMessageDialog(null, "You can't do that", "ERROR", JOptionPane.INFORMATION_MESSAGE);
//		}
					ClearForm();

		
		
	}

	private void ClearForm() {
		// TODO Auto-generated method stub
		txtTitle.setText("");
		txtFirstName.setText("");
		txtLastName.setText("");
		txtAddress1.setText("");
		txtAddress2.setText("");
		txtCity.setText("");
		txtCounty.setText("");
		txtPostCode.setText("");
		txtCountry.setText("");
		txtHomePhone.setText("");
		txtMobilePhone.setText("");
		txtEmail.setText("");		
	}
}
