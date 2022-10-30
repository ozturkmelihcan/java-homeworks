package homeworks001;

import java.util.Scanner;

public class Homeworks002 {
	public static void main(String[] args) {
		// BMI Hesaplama

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen cinsiyetinizi seçiniz: ");
		System.out.println("1- ERKEK");
		System.out.println("2- KADIN");
		int erkek = scanner.nextInt();
		int kadin = 2;
		float boy, kilo, bmi;
		if (erkek == 1) {
			System.out.println("Erkek aday için değerleri giriniz");
			System.out.println("Lütfen boyunuzu giriniz: ");
			boy = scanner.nextFloat();
			System.out.println("Lütfen kilonuzu giriniz: ");
			kilo = scanner.nextFloat();

			bmi = kilo * 10000 / (boy * boy);

			if (bmi < 19) {
				System.out.println("Zayıfsınız... ");
			} else if (19 <= bmi && bmi <= 24) {
				System.out.println("Normalsiniz...");

			} else if (25 <= bmi && bmi <= 30) {
				System.out.println("Şişmansınız...");
			} else {
				System.out.println("Obezsiniz");

			}
		}

		else if (kadin == 2) {

			System.out.println("Kadın aday için değerleri giriniz");
			System.out.println("Lütfen boyunuzu giriniz: ");
			boy = scanner.nextFloat();
			System.out.println("Lütfen kilonuzu giriniz: ");
			kilo = scanner.nextFloat();

			bmi = kilo * 10000 / (boy * boy);

			if (bmi < 19) {
				System.out.println("Zayıfsınız... ");
			} else if (19 <= bmi && bmi <= 24) {
				System.out.println("Normalsiniz...");

			} else if (25 <= bmi && bmi <= 30) {
				System.out.println("Şişmansınız...");
			} else {
				System.out.println("Obezsiniz");

			}

		}

		scanner.close();

	}

}
