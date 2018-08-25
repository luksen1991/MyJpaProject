package info.lukasznowicki.jpa;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.lukasznowicki.jpa.domain.Address;
import info.lukasznowicki.jpa.domain.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = new Employee();
		Address address1 = new Address();
		employee.setName("Lukasz");
		employee.setSourname("Nowicki");
		employee.setSalary(5000.0);
		employee.setSalary2(new BigDecimal("12345.5"));
		employee.setDate(new Date());
		employee.setData(address1);
		address1.setDateAddress(new Date());
		address1.setStreet("Batorego");
		address1.setStreetNumber(18);
		address1.setZipCode("59930");

		Employee employee2 = new Employee();
		Address address2 = new Address();
		employee2.setName("Test2");
		employee2.setSourname("Test2");
		employee2.setSalary(3000.0);
		employee2.setSalary2(new BigDecimal("12345.57"));
		employee2.setDate(new Date());
		employee2.setData(address2);
		address2.setDateAddress(new Date());
		address2.setStreet("Batorego");
		address2.setStreetNumber(21);
		address2.setZipCode("59930");

		Employee employee3 = new Employee();
		Address address3 = new Address();
		employee3.setName("test3");
		employee3.setSourname("test3");
		employee3.setSalary(25000.0);
		employee3.setSalary2(new BigDecimal("12345.6"));
		employee3.setDate(new Date());
		employee3.setData(address3);
		address3.setDateAddress(new Date());
		address3.setStreet("Batorego");
		address3.setStreetNumber(20);
		address3.setZipCode("59930");

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(address1);
		entityManager.persist(employee2);
		entityManager.persist(address2);
		entityManager.persist(employee3);
		entityManager.persist(address3);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
