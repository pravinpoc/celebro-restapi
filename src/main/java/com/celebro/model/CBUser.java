package com.celebro.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the CB_User database table.
 * 
 */
@Entity
@Table(name="CB_User")
@NamedQuery(name="CBUser.findAll", query="SELECT c FROM CBUser c")
public class CBUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)*/
	@Id
	@GeneratedValue(generator = "CB_User_Sequence_Generator")
	  @GenericGenerator(
	    name = "CB_User_Sequence_Generator",
	    strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	    parameters = {
	      @Parameter(name = "sequence_name", value = "CB_User_Sequence"),
	      @Parameter(name = "initial_value", value = "4"),
	      @Parameter(name = "increment_size", value = "1")
	      }
	  )
	@Column(name="Id",columnDefinition="BIGINT",unique=true, nullable=false)
	private BigInteger id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedDate")
	private Date createdDate;

	@Column(name="EmailAddress",length=500)
	private String emailAddress;

	@Column(name="Firstname",length=500)
	private String firstname;

	@Column(name="Lastname",length=500)
	private String lastName;

	@Column(name="MobileNo",length=20)
	private String mobileNo;

	@Column(name="Otp")
	private int otp;

	@Column(name="OtpVerified")
	private int otpVerified;

	@Column(name="Password",nullable=false, length=500)
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdatedDate")
	private Date updatedDate;

	@Column(name="Username",nullable=false, length=500)
	private String username;

	

	public CBUser() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getOtp() {
		return this.otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public int getOtpVerified() {
		return this.otpVerified;
	}

	public void setOtpVerified(int otpVerified) {
		this.otpVerified = otpVerified;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

}