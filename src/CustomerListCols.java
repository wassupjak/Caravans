import javax.swing.table.AbstractTableModel;

public class CustomerListCols extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5546521465847154973L;
	private CustomerList FCustomerList = new CustomerList();
	private String[] columnNames = {"Customer ID", "Title", "First Name", "Last Name", "Address 1",
			"Address 2", "City", "County", "Post Code", "Country", "Home Phone", "Mobile Phone",
			"Email"};
	

	public CustomerListCols(CustomerList list) {
		this.setFCustomerList(list);
	}
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return FCustomerList.size();
	}

	@Override
		 public Object getValueAt(int rowIndex, int columnIndex) {
		        Customer customer = FCustomerList.get(rowIndex);
		        switch (columnIndex) {
		            case 0: 
		                return customer.getCustomerId();
		            case 1:
		                return customer.getTitle();
		            case 2:
		                return customer.getFirstName();
		            case 3:
		                return customer.getLastName();
		            case 4:
		                return customer.getAddress1();
		            case 5:
		                return customer.getAddress2();
		            case 6:
		                return customer.getCity(); 
		            case 7:
		                return customer.getCounty(); 
		            case 8:
		                return customer.getPostCode(); 
		            case 9:
		                return customer.getCountry(); 
		            case 10:
		                return customer.getHomePhone(); 
		            case 11:
		                return customer.getMobilePhone(); 
		            case 12:
		                return customer.getEmail(); 
				           }
		           return null;
		   }
	
	 public Class<?> getColumnClass(int columnIndex){
         switch (columnIndex){
            case 0:
              return int.class;
            case 1:
              return String.class;
            case 2:
              return String.class;
            case 3:
              return String.class;
            case 4:
              return String.class;
            case 5:
              return String.class;
            case 6:
                return String.class;
            case 7:
                return String.class;
            case 8:
                return String.class;
            case 9:
                return String.class;
            case 10:
                return String.class;
            case 11:
                return String.class;
            case 12:
                return String.class;
            }
            return null;
	 }
	 
	 @Override
	 public String getColumnName(int col) {
		 return columnNames[col];
	 }


	public CustomerList getFCustomerList() {
		return FCustomerList;
	}


	public void setFCustomerList(CustomerList fCustomerList) {
		FCustomerList = fCustomerList;
	}

}
