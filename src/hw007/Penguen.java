package hw007;

import java.util.Scanner;

public class Penguen extends Hayvan {

	private String gagaRengi;
	private String kanatRengi;
	private int dayaniklilik = 20;
	private int aclikDurumu = 15;
	static Scanner scanner = new Scanner(System.in);

	public Penguen(String isim, int dogumYili, String renk, int id, double kilo, String kanatRengi, String gagaRengi) {
		super(isim, dogumYili, renk, id, kilo);
		this.gagaRengi = gagaRengi;
		this.kanatRengi = kanatRengi;
		this.dayaniklilik = dayaniklilik;
		this.aclikDurumu = aclikDurumu;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public String getGaga() {
		return gagaRengi;
	}

	public void setGaga(String gagaRengi) {
		this.gagaRengi = gagaRengi;
	}

	public String getKanat() {
		return kanatRengi;
	}

	public void setKanat(String kanatRengi) {
		this.kanatRengi = kanatRengi;
	}

	@Override
	public String toString() {
		return super.toString() + " Penguen [gaga rengi=" + gagaRengi + ", kanat rengi=" + kanatRengi + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());

	}

	@Override
	public void yemekYe() {
		if (aclikDurumu > 0) {
			System.out.println("Yediği balık miktarı ne kadar? ");
			int yedigiMiktar = scanner.nextInt();
			if (yedigiMiktar < 8) {
				aclikDurumu--;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.1));
				System.out.println(getIsim() + " isimli penguen beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			} else if (yedigiMiktar < 17) {
				aclikDurumu -= 2;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.3));
				System.out.println(getIsim() + " isimli penguen beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			} else {
				aclikDurumu -= 3;
				dayaniklilik++;
				setKilo(getKilo() + (yedigiMiktar * 0.5));
				System.out.println(getIsim() + " isimli penguen beslendi. \nGüncel kilosu: " + getKilo()
						+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
			}
		} else if (aclikDurumu >= 50) {
			System.out.println(getIsim() + " isimli penguen öldü....");

		} else {
			System.out.println("hayvanımızın karnı tok yemek yemeyi reddediyor...");
		}
	}

	public void pengueniYuzdur() {
		System.out.println("penguen yüzüyor..");
		aclikDurumu--;
		System.out.println("Güncel dayanıklılığı: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu);
	}

	@Override
	public void uyu() {
		if (aclikDurumu <= 40) {
			dayaniklilik++;
			aclikDurumu--;
			System.out.println("Penguen " + getIsim() + " uyuyor..");
			System.out.println("Güncel dayanıklılığı: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli penguenimiz öldü...");
		}

	}

	@Override
	public void aclikDurumunuKontrolEt() {
		if (aclikDurumu < 10) {
			System.out.println(getIsim() + " isimli penguen tehlikeli yaklaşmayın..");
			dayaniklilik -= 4;
		} else if (aclikDurumu < 20) {
			System.out.println(getIsim() + " isimli penguen besleyin");
			dayaniklilik -= 2;
		} else if (aclikDurumu >= 50) {
			System.out.println(getIsim() + " isimli penguen öldü.");
		} else {
			System.out.println(getIsim() + " isimli penguenin karnı tok...");
		}

	}

	@Override
	public void acikiyor() {
		if (aclikDurumu <= 50) {
			System.out.println(getIsim() + " isimli penguen koşuyor...");
			dayaniklilik = 2;
			aclikDurumu += 2;
			System.out.println("Güncel dayaniklilik: " + dayaniklilik + " Güncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli penguenimiz öldü.");
		}

	}

}
