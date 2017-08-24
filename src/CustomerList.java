import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerList extends ArrayList<Customer> implements ICustomerList {

		private Customer[] customers;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5072303476751067413L;

	public CustomerList() {
		
	}
	
	Customer getCustomer(int aIndex) {
		return customers[aIndex];
	}
	
	Customer getCustomerById(int aId) {
		boolean found = false;
		int i = 0;
		Customer VFoundCust = null;
		while(!found && i<size()) {
			if (customers[i].getCustomerId() == aId) {
			  found = true;	
			  VFoundCust = customers[i];
			}
			i++;
		}
		return VFoundCust;
	}
	
	public boolean add(Customer aCustomer) {
		return super.add(aCustomer);
	}
	
	public void clear() {
		super.clear();
	}
	
	public void PopulateAllCustomers() {
		ResultSet VResultSet = MySQLAccess.executeSelectStatement("Select * from adcaravans.customer;");
		try {
			while (VResultSet.next()) {
			Customer VCustomer = new Customer();
			VCustomer.setCustomerId(VResultSet.getInt("Customer_ID"));
			VCustomer.setTitle(VResultSet.getString("Title"));
			VCustomer.setFirstName(VResultSet.getString("FirstName"));
			VCustomer.setLastName(VResultSet.getString("LastName"));
			VCustomer.setAddress1(VResultSet.getString("Address1"));
			VCustomer.setAddress2(VResultSet.getString("Address2"));
			VCustomer.setCity(VResultSet.getString("City"));
			VCustomer.setCounty(VResultSet.getString("County"));
			VCustomer.setPostCode(VResultSet.getString("PostCode"));
			VCustomer.setCountry(VResultSet.getString("Country"));
			VCustomer.setHomePhone(VResultSet.getString("HomePhone"));
			VCustomer.setMobilePhone(VResultSet.getString("MobilePhone"));
			VCustomer.setEmail(VResultSet.getString("Email"));
			this.add(VCustomer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
