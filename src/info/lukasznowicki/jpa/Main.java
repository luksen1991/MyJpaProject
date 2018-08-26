package info.lukasznowicki.jpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import info.lukasznowicki.jpa.domain.Address;
import info.lukasznowicki.jpa.domain.Cat;
import info.lukasznowicki.jpa.domain.Employee;
import info.lukasznowicki.jpa.domain.Owner;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();
//		addEmployees();
//		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.salary>10000 order by e.salary",
//				Employee.class);
//		List<Employee> result = query.getResultList();
//		for (Employee employee : result) {
//			System.out.println("name: " + employee.getName());
//			System.out.println("sourname: " + employee.getSourname());
//			System.out.println("salary: " + employee.getSalary());
//
//		}

//		Query query=entityManager.createQuery("select concat(e.name, ' ', e.sourname), e.salary*0.2 from Employee e");
//		Iterator<?> iterator = query.getResultList().iterator(); 
//		while(iterator.hasNext()) {
//			Object[] item = (Object[]) iterator.next();
//			String name = (String) item[0];
//			double salary = (double) item[1];
//			System.out.println("name: "+name+"salary: "+salary);
//			
//		}

//		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.salary > :minsalary order by e.salary",Employee.class);
//		query.setParameter("minsalary", 150000.0);
//		for (Employee employee : query.getResultList()) {
//			System.out.println("name: " + employee.getName());
//			System.out.println("sourname: " + employee.getSourname());
//			System.out.println("salary: " + employee.getSalary());
//		}

//		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.salary > ?1 and e.salary< ?2 order by e.salary",Employee.class);
//		query.setParameter(1, 150000.0);
//		query.setParameter(2, 170000.0);
//		for (Employee employee : query.getResultList()) {
//			System.out.println("name: " + employee.getName());
//			System.out.println("sourname: " + employee.getSourname());
//			System.out.println("salary: " + employee.getSalary());
//		}

//		TypedQuery<Employee> query = entityManager.createQuery("select e from Workers e where e.sourname in :sournames order by e.salary",Employee.class);
//		List<String> listSournames = new ArrayList<>();
//		listSournames.add("Nowicki");
//		listSournames.add("Nowicki8");
//		listSournames.add("Nowicki121");
//
//		System.out.println("QUERY RESULT: ");
//		query.setParameter("sournames", listSournames);
//		for (Employee employee : query.getResultList()) {
//			System.out.println("name: " + employee.getName());
//			System.out.println("sourname: " + employee.getSourname());
//			System.out.println("salary: " + employee.getSalary());
//		}

//		Query query = entityManager.createQuery(
//				"select avg(e.salary), min(e.salary), max(e.salary), sum(e.salary), count(e) from Workers e");
//		Object[] result = (java.lang.Object[]) query.getSingleResult();
//		System.out.println("Average: "+result[0]);
//		System.out.println("Minimum: "+result[1]);
//		System.out.println("Maximum: "+result[2]);
//		System.out.println("Sum: "+result[3]);
//		System.out.println("Count: "+result[4]);

//		Query query = entityManager.createQuery(
//				"select substring(e.sourname,1,3), trim(e.sourname), lower(e.sourname), upper(e.sourname), length(e.sourname) from Workers e where e.sourname='Nowicki8'");
//		Object[] result = (Object[]) query.getSingleResult();
//		System.out.println("Substring: " + result[0]);
//		System.out.println("Trim: " + result[1]);
//		System.out.println("Lower: " + result[2]);
//		System.out.println("Upper: " + result[3]);
//		System.out.println("Length: " + result[4]);

		Owner owner1= new Owner();
		Cat cat1 = new Cat();
		owner1.setFirstname("Lukasz");
		owner1.setLastName("Nowicki");
		owner1.setCat(cat1);
		cat1.setName("Filemon");
		
		entityManager.getTransaction().begin();
		entityManager.persist(owner1);
		entityManager.persist(cat1);
		entityManager.getTransaction().commit();
		entityManager.refresh(cat1);
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
