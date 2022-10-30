package homeworks002;

import java.util.Scanner;

public class Homeworks001 {
	public static void main(String[] args) {
		// //Soru1 (20 puan)
		// kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın

		// eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin

		// eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın

		// replace("ilk index", "@")
		// charAt()
		// kelime.startsWith("a")
		// length()

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scanner.nextLine();

		if (kelime.startsWith("a")) {
			System.out.println(kelime.length() - 1);

		} else if (kelime.startsWith("b")) {
			String kelime2 = kelime.replaceFirst("b", "@");
			System.out.println(kelime2);
		} else
			System.out.println(kelime.charAt(0));
		scanner.close();

	}

}
