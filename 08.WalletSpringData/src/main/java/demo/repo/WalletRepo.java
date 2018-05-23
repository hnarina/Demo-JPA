package demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import demo.beans.*;


public interface WalletRepo extends JpaRepository<Customer, Integer>{
	public Customer findById(int id);
	
	}
