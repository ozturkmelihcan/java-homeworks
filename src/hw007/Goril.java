package hw007;

import java.util.Scanner;

public class Goril extends Hayvan {

	static Scanner scanner = new Scanner(System.in);
	private int disSayisi;
	private int dayaniklilik = 30;
	private int aclikDurumu = 30;

	public Goril(String isim, int dogumYili, String renk, int id, double kilo, int disSayisi,
			int hircinlasmaKatsayisi) {
		super(isim, dogumYili, renk, id, kilo);
		this.disSayisi = disSayisi;

	}

	public int getDisSayisi() {
		return disSayisi;
	}

	public void setDisSayisi(int disSayisi) {
		this.disSayisi = disSayisi;
	}

	@Override
	public String toString() {
		return super.toString() + " Goril [disSayisi=" + disSayisi + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());

	}

	@Override
	public void yemekYe() {
		if (aclikDurumu > 0) {
			System.out.println("Yediği muz miktarı ne kadar?");
			int yedigiMiktar = scanner.nextInt();
			if (yedigiMiktar < 8) {
				aclikDurumu--;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.2));
				System.out.println(getIsim() + " isimli goril beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			} else if (yedigiMiktar < 17) {
				aclikDurumu -= 2;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.4));
				System.out.println(getIsim() + " isimli goril beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			} else {
				aclikDurumu -= 3;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.6));
				System.out.println(getIsim() + " isimli goril beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			}
		} else if (aclikDurumu >= 50) {
			System.out.println(getIsim() + " isimli gorilimiz öldü....");

		} else {
			System.out.println("hayvanımızın karnı tok yemek yemeyi reddediyor...");
		}
	}

	@Override
	public void uyu() {
		if (aclikDurumu <= 50) {
			dayaniklilik++;
			aclikDurumu--;
			System.out.println("Goril " + getIsim() + " uyuyor..");
			System.out.println("Güncel dayanıklılığı: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli gorilimiz öldü...");
		}

	}

	@Override
	public void aclikDurumunuKontrolEt() {
		if (aclikDurumu < 10) {
			System.out.println(getIsim() + " isimli goril tehlikeli yaklaşmayın..");
			dayaniklilik -= 4;
		} else if (aclikDurumu < 20) {
			System.out.println(getIsim() + " isimli gorili besleyin");
			dayaniklilik -= 2;
		} else if (aclikDurumu >= 50) {
			System.out.println(getIsim() + " isimli goril öldü.");
		} else {
			System.out.println(getIsim() + " isimli gorilin karnı tok...");
		}

	}

	@Override
	public void acikiyor() {
		if (aclikDurumu <= 50) {
			System.out.println(getIsim() + " isimli goril koşuyor...");
			dayaniklilik += 2;
			aclikDurumu += 2;
			System.out.println("Güncel dayaniklilik: " + dayaniklilik + " Güncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli gorilimiz öldü.");
		}

	}

}
