package hw6;

import java.util.Scanner;



public class Main {

	static Televizyon televizyon = new Televizyon();
	
	static boolean check = true;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void menuGoster() {
		
		
		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Artır\n"
				+ "4--Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Arttır\n"+"7-- Kanal Azalt\n"+
				"8-- Kanal Bilgisi Goster\n" + "9-- Televizyonu Kapat\n"
				+ "10-- Menüyü Goster\n");
		while (check) {
			System.out.println("Seçiminizi  yapınız Menuye donmek ıcın 10 'u tuslayınız...");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				televizyon.tvKur();

				break;
			case 2:
				televizyon.tvAc();
				break;
			case 3:
				televizyon.sesArttir();       // EKLENECEK KODLAR VAR
				break;
			case 4:
				televizyon.sesAzalt();;			// EKLENECEK KODLAR VAR
				break;
			case 5:
				televizyon.kanalDegistir();
				break;
			case 6:
				televizyon.kanalArttır();
				break;
			case 7:
				televizyon.kanalAzalt();
				break;
			case 8:
				televizyon.kanalBilgisiGoster();
				break;
			case 9:
				televizyon.kapat();
				break;
			case 10:
				menuGoster();
				break;
			case 0:
				System.out.println("Çıkış yapılıyor....");
				System.out.println("PEKİ ZEKİ MÜRENDE BİZİ GÖRECEK Mİ??");
				check = false;
				break;

			default:
				System.out.println("hatalı tuslama yaptınız..");
				break;
			}
		}
	}

	

	public static void main(String[] args) {


	
		menuGoster();
		
		
	}

}