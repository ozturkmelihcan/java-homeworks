package hw5alternatif;

public class Main {

	public static void main(String[] args) {
		Salary salary1 = new Salary(48, 2013, 15000);
		Employee employee1 = new Employee("Melihcan", salary1);
		employee1.getName();
		salary1.maasArtisiHesapla();
		salary1.bonusHesapla();
		salary1.vergiHesapla();
		salary1.toplamMaaş();
		salary1.bilgileriGoster();
		
		
		
	}
	
	

}