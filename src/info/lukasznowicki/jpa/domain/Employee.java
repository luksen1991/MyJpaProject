package info.lukasznowicki.jpa.domain;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Employees")
@SecondaryTable(name = "Address")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "Name", nullable = false, length = 10)
	private String name;
	@Column(name = "Sourname", columnDefinition = "VARCHAR(10) NOT NULL")
	private String sourname;
	@Column(name = "Salary")
	private double salary;
	@Column(name = "Salary2", precision = 10, scale = 2)
	private BigDecimal salary2;
	@Column(name = "Date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;

	@Temporal(TemporalType.DATE)
	@Column(name = "DateAddAddress", table = "Address")
	private Date dateAddress;
	@Column(name = "ZipCode", table = "Address")
	private String zipCode;
	@Column(name = "Street", table = "Address")
	private String street;
	@Column(name = "StreetNumber", table = "Address")
	private int streetNumber;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getSalary2() {
		return salary2;
	}

	public void setSalary2(BigDecimal salary2) {
		this.salary2 = salary2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourname() {
		return sourname;
	}

	public void setSourname(String sourname) {
		this.sourname = sourname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
