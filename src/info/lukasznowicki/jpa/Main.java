package info.lukasznowicki.jpa;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import info.lukasznowicki.jpa.domain.Address;
import info.lukasznowicki.jpa.domain.Employee;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();
		addEmployees();
		TypedQuery<Employee>query=entityManager.createQuery("select e from Employee e where e.sourname='nowicki3' ", Employee.class);
		List<Employee> result=query.getResultList();
		for (Employee employee : result) {
			System.out.println("name: "+employee.getName());
			System.out.println("sourname: "+employee.getSourname());
			System.out.println("salary: "+employee.getSalary());
			
		}
		entityManager.close();
		entityManagerFactory.close();

	}

	public static void addEmployees() {

		addEmployee("Lukasz", "Nowicki", 100000, new Date());
		addEmployee("Lukasz", "Nowicki1", 110000, new Date());
		addEmployee("Lukasz", "Nowicki2", 120000, new Date());
		addEmployee("Lukasz", "Nowicki3", 130000, new Date());
		addEmployee("Lukasz", "Nowicki4", 140000, new Date());
		addEmployee("Lukasz", "Nowicki5", 150000, new Date());
		addEmployee("Lukasz", "Nowicki6", 160000, new Date());
		addEmployee("Lukasz", "Nowicki7", 170000, new Date());
		addEmployee("Lukasz", "Nowicki8", 180000, new Date());
		addEmployee("Lukasz", "Nowicki9", 190000, new Date());
	}

	public static void addEmployee(String name, String sourname, double salary, Date date) {
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSourname(sourname);
		employee.setSalary(salary);
		employee.setDate(date);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();

	}
}
