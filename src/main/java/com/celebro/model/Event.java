package com.celebro.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;

/**
 * The persistent class for the CB_Event database table.
 * 
 */
@Entity
@Table(name = "CB_Event")
@NamedQuery(name = "Event.findAll", query = "SELECT c FROM Event c")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id", columnDefinition = "BIGINT", unique = true, nullable = false)
	private BigInteger id;

	private BigInteger createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(length = 500)
	private String destinationDesc;

	@Column(length = 500)
	private String destinationLandmark;

	@Column(length = 500)
	private String destinationName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date eventDateTime;

	@Column(nullable = false, length = 500)
	private String eventDesc;

	@Column(nullable = false, length = 500)
	private String eventName;

	@Column(nullable = false, length = 500)
	private String eventType;

	@Column(name = "Public")
	private int public_;

	private BigInteger updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;

	// bi-directional many-to-one association to CB_User
	@ManyToOne
	@JoinColumn(name = "OrganizedBy", nullable = false)
	private CBUser cbUser;

	// bi-directional many-to-one association to CB_Address
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Address", nullable = false)
	private Address address;

	public Event() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
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

	public String getDestinationDesc() {
		return this.destinationDesc;
	}

	public void setDestinationDesc(String destinationDesc) {
		this.destinationDesc = destinationDesc;
	}

	public String getDestinationLandmark() {
		return this.destinationLandmark;
	}

	public void setDestinationLandmark(String destinationLandmark) {
		this.destinationLandmark = destinationLandmark;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getEventDateTime() {
		return this.eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public String getEventDesc() {
		return this.eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getPublic_() {
		return this.public_;
	}

	public void setPublic_(int public_) {
		this.public_ = public_;
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

	public CBUser getCbUser() {
		return this.cbUser;
	}

	public void setCbUser(CBUser cbUser) {
		this.cbUser = cbUser;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}