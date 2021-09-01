package com.mphasis.o2m;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")

public class Department {
	
	@Id
	@GeneratedValue
	@Column(name = "DEPARTMENT_ID")
	long department_id;
	
	@Column(name = "DEPT_NAME")
	String dept_name;
	
	@OneToMany(mappedBy = "department")
	Set<Employee> Employees;
	
	
	
	
	
	
	public Department() {
		super();
	}
	public Department(long department_id, String dept_name) {
		super();
		this.department_id = department_id;
		this.dept_name = dept_name;
	}
	public long getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	

}
