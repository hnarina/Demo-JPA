package example.jpa;


import javax.persistence.*;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);
		em.getTransaction().begin();
	    Address address = new Address();
	    address.setId(123);
	    address.setLine("talwade");		
	    Department dept1 = new Department();
	    dept1.setId(234);
	    dept1.setDept("java");
	    Department dept2 = new Department();
	    dept2.setId(456);
	    dept2.setDept(".Net");
	    Employee emp = service.createEmployee(50948, "Sagar", 60000, dept1,dept2  , address);
		em.getTransaction().commit();
/*System.out.println("Persisted "+emp);
		
		emp= service.findEmployee(50948);
		System.out.println("Found "+emp);
		
		em.getTransaction().begin();
		emp =service.raiseEmployeeSalary(50948, 20000);
		em.getTransaction().commit();
		System.out.println("Updated "+emp);*/
		em.close();
		emf.close();
	}

}
