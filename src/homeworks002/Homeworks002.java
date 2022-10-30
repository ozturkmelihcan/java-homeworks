package homeworks002;

import java.util.Scanner;

public class Homeworks002 {
	public static void main(String[] args) {
		// // Swtich case ile
		// input --> mehmet
		// input--> hangisi işlemi yapmak istiyosunuz

		// System.out.println("1- Kelimeleri Büyük Harf Yap");
		// System.out.println("2- kelimenin harflerini Küçük yap");
		// System.out.println("3- kelimenin harflerinin arasına ? koy");
		// //mehmet m?h?m?e?t
		// System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
		// // mehmet
		// System.out.println("5- kelimenin içindeki bütün a harflerini ? ile
		// değiştirin");
		// //replace replaceAll("a", ?")
		// System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
		// // mehmet
		// //meh...
		// //substring()

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		System.out.println("Hangi işlemi yapmak istiyorsunuz ? ");
		System.out.println("1- Kelimeleri Büyük harf yap");
		System.out.println("2- kelimenin harflerini küçük yap");
		System.out.println("3- kelimenin harflerinin arasına ? koy");
		System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
		System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
		System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
		System.out.println("Lütfen seçiminizi 1-6 arasında yapınız...");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			System.out.println(kelime.toUpperCase());
			break;
		case 2:
			System.out.println(kelime.toLowerCase());
			break;
		case 3:
			for (int a = 0; a <= kelime.length() - 1; a++) {
				if (a < kelime.length() - 1) {
					System.out.print(kelime.charAt(a) + "?");
				} else
					System.out.println(kelime.charAt(a));
			}
			break;
		case 4:
			kelime = kelime.trim();
			System.out.println(kelime);
			break;
		case 5:
			String kelime2 = kelime.replaceAll("a", "?");
			System.out.println(kelime2);
			break;

		case 6:
			System.out.println(kelime.substring(0, 3) + kelime.replaceAll(kelime, "..."));

			break;
		default:
			System.out.println("Seçiminiz belirlenen aralığın dışında, lüften kontrol ediniz...");
			break;
		}
		scanner.close();
	}

}
