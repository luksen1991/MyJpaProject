package info.lukasznowicki.jpa;

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
		
		Employee employee2 = new Employee();
		employee2.setName("Test2");
		employee2.setSourname("Test2");
		employee2.setSalary(3000.0);
		
		Employee employee3 = new Employee();
		employee3.setName("test3");
		employee3.setSourname("test3");
		employee3.setSalary(25000.0);

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
