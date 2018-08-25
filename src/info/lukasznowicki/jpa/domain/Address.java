package info.lukasznowicki.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private long Id;
	@Column(name = "DateAddAddress")
	@Temporal(TemporalType.DATE) // narzucenie co z daty potrzebne
	public Date dateAddress;
	@Column(name = "ZipCode") // kolumny
	public String zipCode;
	@Column(name = "Street")
	public String street;
	@Column(name = "StreetNumber")
	public int streetNumber;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Date getDateAddress() {
		return dateAddress;
	}

	public void setDateAddress(Date dateAddress) {
		this.dateAddress = dateAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

}