package com.javaClass;
import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	protected int id;
    private String firstName;
    private String lastName;
    private String cardNo;
    private String expDate;
    private String ccv;
    private String contact;

    
    
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String firstName, String lastName, String cardNo, String expDate, String ccv, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.ccv = ccv;
		this.contact = contact;
	}
	public Payment(int id, String firstName, String lastName, String cardNo, String expDate, String ccv,
			String contact) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.ccv = ccv;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
    
    
	
}
