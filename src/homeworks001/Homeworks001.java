package homeworks001;

import java.util.Scanner;

public class Homeworks001 {
	public static void main(String[] args) {
		// Kilo değerini girdiğimizde bütün gezegenlerdeki değeri hesaplayıp yazdıran
		// Ağırlık = kütle * yerçekimi
		// 1- ay 2- Saturn 3- mars 4- Venüs
		// ayın yerçekim indeksi 1,62 saturn g =10,44 , mars g = 3,72 , venüs g = 8,87

		// G = m * g

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz= ");

		float agirlik = scanner.nextFloat();
		float dunyaCekimi = 9.8f;
		float ayCekimi = 1.62f;
		float marsCekimi = 3.72f;
		float venusCekimi = 8.87f;
		float saturnCekimi = 14.44f;

		float ay1 = agirlik / (dunyaCekimi / ayCekimi);
		System.out.println("Aydaki ağırlığınız= " + ay1);
		float mars1 = agirlik / (dunyaCekimi / marsCekimi);
		System.out.println("Marstaki ağırlığınız= " + mars1);
		float venus1 = agirlik / (dunyaCekimi / venusCekimi);
		System.out.println("Venüsteki ağırlığınız= " + venus1);
		float saturn1 = agirlik / (dunyaCekimi / saturnCekimi);
		System.out.println("Satürndeki ağırlığınız= " + saturn1);

		System.out.println("************************ 2. KISIM    **************************");

		System.out.println("Kilonuzu giriniz: ");

		agirlik = scanner.nextFloat();

		System.out.println("Gezegen giriniz= ");
		System.out.println("1- Ay");
		System.out.println("2= Mars");
		System.out.println("3- Venüs");
		System.out.println("4- Satürn");
		int gezegen;
		gezegen = scanner.nextInt();
		if (gezegen == 1) {
			System.out.println("Ay'daki ağırlığınız: " + ay1);
		} else if (gezegen == 2) {
			System.out.println("Mars'taki ağırlığınız: " + mars1);
		} else if (gezegen == 3) {
			System.out.println("Venüs'teki ağırlığınız: " + venus1);
		} else {
			System.out.println("Satürn'deki ağırlığınız: " + saturn1);

		}

		scanner.close();

		{

		}

	}

}
