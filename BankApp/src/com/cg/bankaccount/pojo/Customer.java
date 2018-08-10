package com.cg.bankaccount.pojo;



public class Customer {

	private final int customerId;
	private String customerName;
	private String contactNumber;
	private String emailId;
	private String dateOfBirth;
	private String gender;
	
	
	private static int custId;
	static {
		custId = 200;
	}
	
	{
		this.customerId = ++custId;
	}

	public Customer(String customerName, String contactNumber, String emailId, String dateOfBirth,
			String gender) {
		super();
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static int getCustId() {
		return custId;
	}

	public static void setCustId(int custId) {
		Customer.custId = custId;
	}

	public int getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}
	
	
	
}
