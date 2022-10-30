package homeworks001;

import java.util.Scanner;

public class Homeworks003 {
	public static void main(String[] args) {
		// Ödev ==> Hangi işlemi yapmak istersiniz?

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hangi işlemi yapmak istiyorsunuz?");

		System.out.println("1- Toplama");
		System.out.println("2- Çıkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");

		int islem = scanner.nextInt();
		float sonuc;

		if (islem == 1) {
			System.out.println("1. sayıyı giriniz: ");
			float sayi1 = scanner.nextFloat();
			System.out.println("2. sayıyı giriniz:");
			float sayi2 = scanner.nextFloat();
			sonuc = sayi1 + sayi2;
			System.out.println("İki sayının toplamı: " + sonuc);

		} else if (islem == 2) {
			System.out.println("1. sayıyı giriniz:");
			float sayi1 = scanner.nextFloat();
			System.out.println("2. sayıyı giriniz:");
			float sayi2 = scanner.nextFloat();
			sonuc = sayi1 - sayi2;
			System.out.println("İki sayının farkı: " + sonuc);
		} else if (islem == 3) {
			System.out.println("1. sayıyı giriniz:");
			float sayi1 = scanner.nextFloat();
			System.out.println("2. sayıyı giriniz:");
			float sayi2 = scanner.nextFloat();
			sonuc = sayi1 * sayi2;
			System.out.println("İki sayının çarpımı: " + sonuc);
		} else {
			System.out.println("1. sayıyı giriniz:");
			float sayi1 = scanner.nextFloat();
			System.out.println("2. sayıyı giriniz:");
			float sayi2 = scanner.nextFloat();
			sonuc = sayi1 / sayi2;
			System.out.println("İki sayının bölümü: " + sonuc);
		}

		scanner.close();

	}

}
