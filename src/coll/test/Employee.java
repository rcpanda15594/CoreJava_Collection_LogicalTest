package coll.test;

public class Employee {

	private String name;
	private String email;
	private Double salary;
	private Integer mobile;
	
	
	public Employee(String name, String email, Double salary, Integer mobile) {
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + ", mobile=" + mobile + "]";
	}
	
	
}
