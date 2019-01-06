package com.celebro.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the CB_EventInvitee database table.
 * 
 */
@Entity
@Table(name="CB_EventInvitee")
@NamedQuery(name="EventInvitee.findAll", query="SELECT c FROM EventInvitee c")
public class EventInvitee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id", columnDefinition = "BIGINT", unique = true, nullable = false)
	private String id;

	private BigInteger createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(length=500)
	private String emailAddress;

	@Column(length=500)
	private String firstname;

	@Column(length=500)
	private String lastname;

	@Column(length=20)
	private String mobileNo;

	private int otp;

	private int otpVerified;

	private BigInteger updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;

	private BigInteger userId;

	//bi-directional many-to-one association to CB_Event
	@ManyToOne
	@JoinColumn(name="Event", nullable=false)
	private Event event;

	public EventInvitee() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
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

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public BigInteger getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigInteger updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}