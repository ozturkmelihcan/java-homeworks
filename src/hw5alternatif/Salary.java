package hw5alternatif;

public class Salary {

	private int workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double raiseSalary;
	private double totalSalary;
	private final int year = 2022;
	private double currentSalary;

	public Salary(int workHours, int hireYear, double currentSalary) {
		if (this.year > this.hireYear) {
			this.hireYear = hireYear;
		} else {
			System.err.println("Yılı yanlış girdiniz. Atama güncel yıl olarak ayarlanmıştır.");
			this.hireYear = this.year;
		}
		this.workHours = workHours;

		this.currentSalary = currentSalary;

	}

	public void bonusHesapla() {
		if (this.workHours > 40) {
			this.bonus = (this.workHours - 40) * 30;
		}
	}

	public void maasArtisiHesapla() {

		int kacYildirCalisiyor = this.year - this.hireYear;
		if (kacYildirCalisiyor < 10) {
			this.raiseSalary = this.currentSalary * 0.05;

		} else if (kacYildirCalisiyor < 20) {
			this.raiseSalary = this.currentSalary * 0.1;
		} else {
			this.raiseSalary = this.currentSalary * 0.15;
		}
	}

	public void vergiHesapla() {
		if (this.currentSalary > 2000) {
			this.tax = this.currentSalary * 0.05;
		}
	}

	public void toplamMaaş() {
		this.totalSalary = this.currentSalary + this.bonus + this.raiseSalary - this.tax;
	}

	public void bilgileriGoster() {
		System.out.println(this.currentSalary + "\nÇalışma Saati: " + this.workHours + "\nİşe başlama tarihi: "
				+ this.hireYear + "\nÖdediği vergi : " + this.tax + "\nAldığı bonus: " + this.bonus + "\nMaaş artışı: "
				+ this.raiseSalary + "\nAldığı toplam maaş: " + this.totalSalary);

	}

}
