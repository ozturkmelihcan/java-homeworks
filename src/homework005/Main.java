package homework005;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Melihcan Öztürk", 15000, 50 , 2015);
		employee1.setTax();
		employee1.setBonus();
		employee1.setSalaryRaise();
		employee1.setTotalSalary();
		employee1.bilgileriGoster();
		
	}
	
	

}