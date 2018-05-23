package example.jpa;


import javax.persistence.*;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
	    EmployeeService service = ctx.getBean("service", EmployeeService.class);
	    Address address = new Address(1, "talawade");
	    Department dept = new Department(1,"java");
	    Employee e = new Employee(123,"Sagar",100000,address,dept);
	    service.createEmployee(e)  ;
	    Employee e1 = new Employee(124,"Meenal",90000,address,dept);
	    service.createEmployee(e1)  ;
	    Employee e2 = new Employee(125,"Ram Teja",80000,address,dept);
	    service.createEmployee(e2)  ;
	    Employee e3 = new Employee(126,"Haneef",70000,address,dept);
	    service.createEmployee(e3)  ;
	    Employee e4 = new Employee(127,"Hari",60000,address,dept);
	    service.createEmployee(e4)  ;	    
	    System.out.println(service.findEmployee(126));
	    
	    
		ctx.close();
	}

}