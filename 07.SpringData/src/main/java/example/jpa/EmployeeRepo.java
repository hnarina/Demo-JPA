package example.jpa;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	@Query(value="SELECT e FROM Employee e JOIN FETCH e.dept1 WHERE e.id =?1")
	public Employee findById(int id);

}