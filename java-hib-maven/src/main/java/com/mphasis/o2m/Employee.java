package com.mphasis.o2m;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")

public class Employee{

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private long Employee_ID;
	
	@Column(name = "firstname")
	String Firstname;
	
	@Column(name = "lastname")
	String Lastname;
	
	@Column(name = "birth_date")
	Date Birth_Date;
	
	@Column(name = "cell_phone")
	String Cell_Phone;
	
	@ManyToMany
	@JoinColumn(name="department_id")
	private Department deptartment;
	
	
	
	
	
	
	public Employee() {
		super();
	}


	public Employee(long employee_ID, String firstname, String lastname, Date birth_Date, String cell_Phone) {
		super();
		Employee_ID = employee_ID;
		Firstname = firstname;
		Lastname = lastname;
		Birth_Date = birth_Date;
		Cell_Phone = cell_Phone;
	}
	
	
	public long getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(long employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public Date getBirth_Date() {
		return Birth_Date;
	}
	public void setBirth_Date(Date birth_Date) {
		Birth_Date = birth_Date;
	}
	public String getCell_Phone() {
		return Cell_Phone;
	}
	public void setCell_Phone(String string) {
		Cell_Phone = string;
	}


	public Department getDeptartment() {
		return deptartment;
	}


	public void setDeptartment(Department deptartment) {
		this.deptartment = deptartment;
	}



	
}
