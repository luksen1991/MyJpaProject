package info.lukasznowicki.jpa;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import info.lukasznowicki.jpa.domain.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = new Employee();
		employee.setName("Lukasz");
		employee.setSourname("Nowicki");
		employee.setSalary(5000.0);
		employee.setSalary2(new BigDecimal("12345.5"));
		employee.setDate(new Date());
		employee.setDateAddress(new Date());
		employee.setStreet("Batorego");
		employee.setZipCode("59930");
		employee.setStreetNumber(18);
		
		Employee employee2 = new Employee();
		employee2.setName("Test2");
		employee2.setSourname("Test2");
		employee2.setSalary(3000.0);
		employee2.setSalary2(new BigDecimal("12345.57"));
		employee2.setDate(new Date());
		employee2.setDateAddress(new Date());
		employee2.setStreet("Konopnicka");
		employee2.setZipCode("59930");
		employee2.setStreetNumber(19);
		
		Employee employee3 = new Employee();
		employee3.setName("test3");
		employee3.setSourname("test3");
		employee3.setSalary(25000.0);
		employee3.setSalary2(new BigDecimal("12345.6"));
		employee3.setDate(new Date());
		employee3.setDateAddress(new Date());
		employee3.setStreet("Przejazdowa");
		employee3.setZipCode("59930");
		employee3.setStreetNumber(20);

		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
