package demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import demo.beans.*;


public interface WalletRepo extends JpaRepository<Customer, Integer>{
	@Query(value="SELECT c FROM Customer c JOIN FETCH c.wallet WHERE c.id =?1")
	public Customer findById(int id);
	
	}
