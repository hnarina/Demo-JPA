package example.jpa;

import javax.persistence.*;
@Embeddable
public class Department {
	
	private String dept;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	}
	
	
