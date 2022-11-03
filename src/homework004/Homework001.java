package homework004;

public class Homework001 {

	public static void main(String[] args) {
		// 1- verilen sehirler arrayinde ";" dan öncesini ayırıyoruz(split())
		// ayırdğımız bu veriyi yeni bir arraye atıyoruz.
		// ve yeni arrayı ekrana bastırıyoruz,

		// 2- daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi ekrana tekrar bastırıyoruz
		// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra

		// split()
		// indexOf()
		// substring()

		/*
		 * String sehirler =
		 * "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;" +
		 * "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		 */

		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] yeniSehirler = sehirler.split(";");
		for (int i = 0; i < yeniSehirler.length; i++) {
			System.out.println(yeniSehirler[i] + " ");

		}
		System.out.println("-------------------- 2. KISIM ----------------------------------");

		String[] yenilerIki = new String[yeniSehirler.length];
		String[] yenilerUc = new String[yeniSehirler.length];

		for (int i = 0; i < yeniSehirler.length; i++) {

			yenilerIki[i] = yeniSehirler[i].substring(yeniSehirler[i].indexOf("-") + 1, yeniSehirler[i].length());
			yenilerUc[i] = yeniSehirler[i].trim().substring(0, yeniSehirler[i].indexOf("-"));

			System.out.println(yenilerIki[i] + " şehrinin plakası : " + yenilerUc[i]);
		}

	}

}
