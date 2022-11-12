package hw5alternatif;

public class Employee {

	// Fields , Properties
	private String name;

	
	private Salary salary;
	

	public Employee(String name,  Salary salary) {
		
		this.name = name;
	
		this.salary = salary;
	}

	
	public String getName() {
		System.out.println("Çalışan adı: " + this.name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	

	
}
