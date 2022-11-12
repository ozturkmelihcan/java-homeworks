package homework005;

public class Employee {

	// Fields , Properties
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double raiseSalary;
	public final int year = 2022;
	private double totalSalary;

	
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary() {

		this.totalSalary = (this.salary + this.bonus + this.raiseSalary) - this.tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double getTax() {
		return tax;
	}

	public void setTax() {
		if (this.salary > 2000) {
			this.tax = this.salary * 0.05;     // vergi işlemi halledildi.
		} else {

		}

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus() {

		if (this.workHours > 40) {
			this.bonus = (this.workHours - 40) * 30;
		} else {
			this.bonus = 0;
		}

	}

	public double getSalaryRaise() {
		return raiseSalary;
	}

	public void setSalaryRaise() {
		if (year <= hireYear) {
			
			this.raiseSalary = 0;
			}
			else if (year - hireYear < 10) {
				this.raiseSalary = (this.salary * 0.05);
			} else if ((year - hireYear) >= 10 && (year - hireYear) < 20) {
				this.raiseSalary = (this.salary * 0.1);
			} else {
				this.raiseSalary = (this.salary * 0.15);
			}
		}
		
	public void bilgileriGoster() {
		System.out.println("Çalışanın adı: " + getName() + "\nAldığı maaş: " + getSalary()
		+ "\nÇalışma Saati: " + getWorkHours() + "\nİşe başlama tarihi: " + getHireYear()
		+ "\nÖdediği vergi : " + getTax() + "\nAldığı bonus: " + getBonus()
		+ "\nMaaş artışı: " + getSalaryRaise() + "\nAldığı toplam maaş: "
		+ getTotalSalary());

	}

	

}
