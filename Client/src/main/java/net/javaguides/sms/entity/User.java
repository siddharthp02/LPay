package net.javaguides.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="first_name",nullable=false)
	public String firstName;

	//	if we do not state column line, then it will automatically take the column name as variable name
	@Column(name="last_name")
	private String lastName;

	@Column(name="phone")
	private String phone;

	@Column(name="email")
	private String email;

	@Column(name="bank_name")
	private String bankName;

	@Column(name = "account_id")
	private String accountId;

	@Column(name="password")
	private String password;

	@Column(name = "upi_id")
	private String upiId;

	private static User cur_user;
	private static User temporary_user;

	private User() {

	}
	public static User getCurUserInstance(){
		return cur_user;
	}
	public static void authoriseUser(){
		cur_user = new User();
	}

	public static void resetCurUserInstance(){
		cur_user = null;
	}
	public static User getTemporaryUserInstance(){
		if(temporary_user == null){
			temporary_user = new User();
		}
		return temporary_user;
	}
	public static void resetTemporaryUserInstance(){
		temporary_user = null;
	}

//	public User(String firstName, String lastName, String phone, String email, String bankName, String accountId, String password, String upiId) {
////		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.phone = phone;
//		this.email = email;
//		this.bankName = bankName;
//		this.accountId = accountId;
//		this.password = password;
//		this.upiId = upiId;
//	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
