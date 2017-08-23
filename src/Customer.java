// default package
// Generated 23-Aug-2017 18:26:34 by Hibernate Tools 5.2.5.Final

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable, ICustomer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8571337674130819055L;
	private Integer customerId;
	private String title;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String county;
	private String postCode;
	private String country;
	private String homePhone;
	private String mobilePhone;
	private String email;

	public Customer() {
	}

	public Customer(String firstName, String lastName, String address1, String city, String postCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.city = city;
		this.postCode = postCode;
	}

	public Customer(String title, String firstName, String lastName, String address1, String address2, String city,
			String county, String postCode, String country, String homePhone, String mobilePhone, String email) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.county = county;
		this.postCode = postCode;
		this.country = country;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.email = email;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
