package hw6;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {
	static Scanner scanner = new Scanner(System.in);

	private String marka;
	private double boyut;
	private ArrayList<Kanal> kanallar;
	private boolean tvAcikMi;
	private int ses = 10;
	private boolean tvKurulumu;
	private int aktifKanal;
	private ArrayList<String> turler;

	public Televizyon() {
		kanallar = new ArrayList<Kanal>();
		this.tvAcikMi = false;
		this.tvKurulumu = false;
		this.aktifKanal = 1;
		turler = new ArrayList<String>();
	}

	public void tvKur() {

		if (tvKurulumu == false) {
			System.out.println("Markayı giriniz");
			String marka = scanner.nextLine();
			System.out.println("Boyutunu giriniz");
			double boyut = scanner.nextDouble();
			scanner.nextLine();
			this.marka = marka;
			this.boyut = boyut;
			System.out.println("Televizyon kuruldu");
			kanallariOlustur();
			tvKurulumu = true;
		} else {
			System.out.println("Hocam zorlamayın bozacaksınız, televizyon zaten kurulu");
		}

	}

	public void kanallariOlustur() {

		MuzikKanali kanal1 = new MuzikKanali("BuseMuzik", 1, "Pop");
		HaberKanali kanal2 = new HaberKanali("MelihHaber", 2, " Siyaset");
		MuzikKanali kanal3 = new MuzikKanali("MertMuzik", 3, "Blues");
		HaberKanali kanal4 = new HaberKanali("AliHaber", 4, " Borsa");
		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
		
		turler.add(kanal1.getMuzikTuru());
		turler.add(kanal2.getHaberTuru());
		turler.add(kanal3.getMuzikTuru());
		turler.add(kanal4.getHaberTuru());

//		System.out.println(kanal.getKanalAdi() + kanal.getKanalNo() );

	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public double getBoyut() {
		return boyut;
	}

	public void setBoyut(double boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public int getAktifKanal() {
		return aktifKanal;
	}

	public void setAktifKanal(int aktifKanal) {
		this.aktifKanal = aktifKanal;
	}

	public void tvAc() {
		if (tvAcikMi == false && tvKurulumu == true) {
			tvAcikMi = true;
			System.out.println("TELEVİZYON açıldı");
		} else if (tvKurulumu == true && tvAcikMi == true) {
			System.out.println("Televizyon zaten açık");
		} else {
			System.out.println("TELEVİZYONU KURMADAN AÇAMAZSINIZ...");
		}

	}

	public void sesArttir() {

		if (tvKurulumu) {
			if (tvAcikMi) {
				if (this.ses < 20 && this.ses >= 0) {
					this.ses++;
					System.out.println("Ses arttı güncel ses : " + this.ses);
				} else {
					System.out.println("SES MAXIMUMDA OLDUĞUNDAN SES AÇMA İŞLEMİ GERÇEKLEŞTİRİLEMİYOR");
				}
			} else {
				System.out.println("SES Mİ ACMAK İSTİYORSUNUZ ? ÖNCE TELEVİZYONU AÇMALISINIZ :D ");
			}
		} else {
			System.out.println("SES Mİ AÇMAK İSTİYORSUNUZ ? ÖNCE TELEVİZYONU KURMALISINIZ :D ");
		}
	}

	public void sesAzalt() {
		if (tvKurulumu) {
			if (tvAcikMi) {
				if (this.ses <= 20 && this.ses > 0) {
					this.ses--;
					System.out.println("Ses azldı güncel ses : " + this.ses);
				} else {
					System.out.println("SES MİNİMUMDA OLDUĞUNDAN KISMA İŞLEMİ GERÇEKLEŞTİRİLEMİYOR");
				}
			} else {
				System.out.println("SES Mİ KISMAK İSTİYORSUNUZ ? ÖNCE TELEVİZYONU AÇMALISINIZ :D ");
			}
		} else {
			System.out.println("SES Mİ KISMAK İSTİYORSUNUZ ? ÖNCE TELEVİZYONU KURMALISINIZ :D ");
		}
	}

	public void kapat() {
		if (tvAcikMi == true && tvKurulumu) {
			tvAcikMi = false;
			System.out.println("Tv kapatıldı");
		} else if (tvKurulumu == false) {
			System.out.println("TV Yİ KAPATABILMEK ICIN ONCE KURUNUZ...");
		} else {
			System.out.println("TV ZATEN KAPALI OLDUGU İÇİN SİYAH EKRANLA KARSILASILDI...");
		}

	}

	public void kanalBilgisiGoster() {
		System.out.println("KANAL BİLGİLERİ");
		if (tvAcikMi == true && tvKurulumu == true) {
			for (int i = 0; i < kanallar.size(); i++) {
				if (aktifKanal == kanallar.get(i).getKanalNo()) {
					System.out.println("Kanal adı: " + kanallar.get(i).getKanalAdi() + " Kanal numarası: "
							+ kanallar.get(i).getKanalNo() + " Kanal türü: " + turler.get(i));
				}
			}

		} else if (tvKurulumu == true && tvAcikMi == false) {
			System.out.println("TELEVİZYON AÇIK DEĞİL");

		} else {
			System.out.println("TELEVİZYON KURULU DEĞİL");
		}

	}

	public void kanalDegistir() {
		if (tvKurulumu == true && tvAcikMi == true) {
			System.out.println("ıstedıgınız kanalı tuslayınız..");
			int kanalsecimi = scanner.nextInt();
			for (Kanal k : kanallar) {
				if (kanalsecimi <= kanallar.size()) {
					if (k.getKanalNo() == kanalsecimi && k.getKanalNo() != aktifKanal) {
						System.out.println("kanal adı: " + k.getKanalAdi() + " kanal numarası: " + k.getKanalNo());
						aktifKanal = k.getKanalNo();
						break;
					} else if (k.getKanalNo() == kanalsecimi && k.getKanalNo() == aktifKanal) {
						System.out.println("aynı kanalı tusladınız: " + aktifKanal);
						break;
					}

				} else {
					System.out.println("Kanallar " + kanallar.size() + " adettir... lütfen  bu kanallardan seçiniz...");
					break;
				}
			}
		} else if (tvKurulumu == true && tvAcikMi == false) {
			System.out.println("Tv açık değil");
		} else if (tvKurulumu == false) {
			System.out.println("televizyon kurulu değil");
		}

	}

	public void kanalArttır() {

		int maxKanal = kanallar.size();

		if (tvAcikMi == false && tvKurulumu == false) {

			System.out.println("Tv yi kurmalısınız ");
		} else if (tvAcikMi == false) {
			System.out.println("Tv'yi acmalısınız");
		} else {
			if (aktifKanal < maxKanal) {
				aktifKanal++;
				System.out.println("Bulunduğunuz kanal numarası: " + aktifKanal + " kanal adı: "
						+ kanallar.get(aktifKanal - 1).getKanalAdi());

			} else

			{
				System.out.println("Bulunduğunuz kanal numarası: " + aktifKanal + " kanal adı: "
						+ kanallar.get(aktifKanal - 1).getKanalAdi()
						+ " ///  HOCAM daha fazla kanal bulunmamaktadır.");
			}
		}

	}

	public void kanalAzalt() {
		int minKanal = 1;

		if (tvAcikMi == false && tvKurulumu == false) {
			System.out.println("Tv kur dostum");
		} else if (tvAcikMi == false) {
			System.out.println("Tv'yi aç ");
		} else {
			if (aktifKanal > minKanal) {
				aktifKanal--;

				System.out.println("Kanal no: " + aktifKanal + " kanal bilgisi için 8'e bas brocuğum...");
			} else {
				System.out.println("min kanaldasınız... bulunduğunuz kanal numarası: " + aktifKanal + " kanal adı: "
						+ kanallar.get(aktifKanal - 1).getKanalAdi());
			}
		}
	}

//	for(int i = 0; i< kanallar.size();i++) {
//		if(aktifKanal == kanallar.get(i).getKanalNo()) {
//			System.out.println("Kanal No: " + kanallar.get(i).getKanalNo()
//					+ " Kanal Bilgisi: " + kanallar.get(i).getKanalAdi()
//					+ " Türü: " + turler.get(i));
//		}
}
