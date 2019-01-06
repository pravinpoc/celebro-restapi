package com.celebro.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the CB_Address database table.
 * 
 */
@Entity
@Table(name="CB_Address")
@NamedQuery(name="Address.findAll", query="SELECT c FROM Address c")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id",columnDefinition="BIGINT",unique=true, nullable=false)
	private BigInteger id;

	@Column(length=500)
	private String adressLine1;

	@Column(length=500)
	private String adressLine2;

	@Column(length=500)
	private String city;

	@Column(length=500)
	private String country;

	private BigInteger createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private double latitude;

	private double longitude;

	@Column(length=500)
	private String state;

	private BigInteger updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;

	//bi-directional many-to-one association to CB_Event
	@OneToMany(mappedBy="address",cascade = CascadeType.ALL)
	private List<Event> events;

	public Address() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getAdressLine1() {
		return this.adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return this.adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> cbEvents) {
		this.events = cbEvents;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setAddress(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setAddress(null);

		return event;
	}

}