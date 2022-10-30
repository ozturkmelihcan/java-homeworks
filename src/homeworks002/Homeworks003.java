package homeworks002;

import java.util.Scanner;

public class Homeworks003 {
	public static void main(String[] args) {
		// Tahmin oyunu
		// rastGele bir sayı oluşturcaz
		// rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		// tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım
		// sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
		// Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .

		// while ile çözüm

		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;

		int sayi1 = (int) (Math.random() * 100);
		int sayac = 1;

		while (kontrol) {
			System.out.println("Lütfen bir sayı giriniz: ");
			int tahmin = scanner.nextInt();
			if (tahmin == sayi1) {
				System.out.println("Tahmininiz doğru tebrikler...");
				kontrol = false;
				System.out.println(sayac + ". tahminde buldunuz.");
			} else if (tahmin > sayi1) {
				System.out.println("Tahmininizi azaltınız...");
				sayac++;
			} else {
				System.out.println("Tahmininizi yükseltiniz...");
				sayac++;

			}

		}
		scanner.close();

	}

}
