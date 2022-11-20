package hw007;

import java.util.Scanner;

public class Aslan extends Hayvan {

	private int disSayisi;
	private int hiz;
	private int dayaniklilik = 20;
	private int aclikDurumu = 20;
	private int yorgunluk = 15;
	static Scanner scanner = new Scanner(System.in);

	public Aslan(String isim, int dogumYili, String renk, int id, double kilo, int disSayisi, int hiz,
			int dayaniklilik) {
		super(isim, dogumYili, renk, id, kilo);
		this.disSayisi = disSayisi;
		this.hiz = hiz;
		this.dayaniklilik = dayaniklilik;
	}

	public Aslan(String isim, int dogumYili, String renk, int id, double kilo) {
		super(isim, dogumYili, renk, id, kilo);

	}

	public int getDisSayisi() {
		return disSayisi;
	}

	public void setDisSayisi(int disSayisi) {
		this.disSayisi = disSayisi;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return super.toString() + " Aslan [disSayisi=" + disSayisi + ", hiz=" + hiz + "]";
	}

	@Override
	public void yemekYe() {
		System.out.println("Yediği et miktarı ne kadar?");
		int yedigiMiktar = scanner.nextInt();
		if (yedigiMiktar < 10) {
			aclikDurumu--;
			dayaniklilik++;
			setKilo(getKilo() + (yedigiMiktar * 0.4));
			System.out.println(getIsim() + " isimli aslan beslendi. \nGüncel kilosu: " + getKilo()
					+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
		} else if (yedigiMiktar < 20) {
			aclikDurumu -= 2;
			dayaniklilik += 2;
			setKilo(getKilo() + (yedigiMiktar * 0.8));
			System.out.println(getIsim() + " isimli aslan beslendi. \nGüncel kilosu: " + getKilo()
					+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
		} else {
			aclikDurumu -= 3;
			dayaniklilik += 3;
			setKilo(getKilo() + (yedigiMiktar * 1.2));
			System.out.println(getIsim() + " isimli aslan beslendi. \nGüncel kilosu: " + getKilo()
					+ "\nGüncel açlık durumu: " + aclikDurumu + "\nGüncel dayanıklılığı: " + dayaniklilik);
		}
	}

	@Override
	public void uyu() {
		if (aclikDurumu <= 50) {
			dayaniklilik++;
			aclikDurumu--;
			System.out.println("Aslan " + getIsim() + " uyuyor..");
			System.out.println("Güncel dayanıklılığı: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli aslanımız öldü...");
		}

	}

	public void hayvaniKostur() {
		if (aclikDurumu <= 50) {
			System.out.println("ne kadar koşacak?");
			int kosuMiktari = scanner.nextInt();
			if (kosuMiktari < 10) {
				dayaniklilik++;
				aclikDurumu += 3;
				yorgunluk++;
				System.out.println("Güncel dayanıklılık: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu
						+ "\nGüncel yorgunluk: " + yorgunluk);
			} else if (kosuMiktari < 20) {
				dayaniklilik += 2;
				aclikDurumu += 5;
				yorgunluk += 2;
				System.out.println("Güncel dayanıklılık: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu
						+ "\nGüncel yorgunluk: " + yorgunluk);
			} else if (kosuMiktari <= 30) {
				dayaniklilik += 3;
				aclikDurumu += 7;
				yorgunluk += 3;
				System.out.println("Güncel dayanıklılık: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu
						+ "\nGüncel yorgunluk: " + yorgunluk);
			} else {
				dayaniklilik += 3;
				aclikDurumu += 9;
				yorgunluk += 4;
				System.out.println("Güncel dayanıklılık: " + dayaniklilik + "\nGüncel açlık durumu: " + aclikDurumu
						+ "\nGüncel yorgunluk: " + yorgunluk);
			}
		} else {
			System.out.println(getIsim() + " isimli aslan öldü.");
		}
	}

	@Override
	public void aclikDurumunuKontrolEt() {
		if (aclikDurumu < 10) {
			System.out.println(getIsim() + " isimli aslan tehlikeli yaklaşmayın..");
			dayaniklilik -= 4;
		} else if (aclikDurumu < 20) {
			System.out.println(getIsim() + " isimli aslan besleyin");
			dayaniklilik -= 2;
		} else if (aclikDurumu >= 50) {
			System.out.println(getIsim() + " isimli aslan öldü.");
		} else {
			System.out.println(getIsim() + " isimli aslanın karnı tok...");
		}
	}

	@Override
	public void acikiyor() {
		if (aclikDurumu <= 50) {
			System.out.println(getIsim() + " isimli aslan koşuyor...");
			dayaniklilik = 2;
			aclikDurumu += 2;
			System.out.println("Güncel dayaniklilik: " + dayaniklilik + " Güncel açlık durumu: " + aclikDurumu);
		} else {
			System.out.println(getIsim() + " isimli aslan öldü.");
		}

	}

}
