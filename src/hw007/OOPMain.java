package hw007;

public class OOPMain {

	public static void main(String[] args) {

		Ziyaretci ziyaretci1 = new Ziyaretci("kenan", 38, 1.78, 72, "yeşil", 1583);
		Ziyaretci ziyaretci2 = new Ziyaretci("ali", 42, 1.80, 75, "ela", 1598);
		Ziyaretci ziyaretci3 = new Ziyaretci("ahmet", 30, 1.88, 79, "mavi", 1578);
		Ziyaretci ziyaretci4 = new Ziyaretci("faruk", 35, 1.73, 82, "siyah", 1550);

		Gorevli gorevli1 = new Gorevli("mahmut", 28, 1.90, 87, "kahverengi", 8, 16999);
		Gorevli gorevli2 = new Gorevli("Ayşe", 35, 1.60, 58, "kahverengi", 8, 13654);
		Gorevli gorevli3 = new Gorevli("Firuzan", 31, 1.58, 65, "yeşil", 8, 18955);
		Gorevli gorevli4 = new Gorevli("mustafa", 33, 1.60, 58, "siyah", 8, 14635);

		Aslan aslan1 = new Aslan("Savaş", 1998, "sarı", 156569, 100, 18, 80, 5);
		Aslan aslan2 = new Aslan("Bergen", 2020, "hardal", 164887, 85, 18, 72, 4);
		Aslan aslan3 = new Aslan("Sergen", 2015, "beyaz", 156488, 85, 18, 72, 4);
		Aslan aslan4 = new Aslan("Müslüm", 2018, "aslan", 165136, 85, 18, 72, 4);

		Goril goril1 = new Goril("Alex", 2003, "beyaz", 198798, 87, 16, 6);
		Goril goril2 = new Goril("Hagi", 2008, "Siyah", 131588, 87, 16, 6);
		Goril goril3 = new Goril("Anelka", 2011, "Kahverengi", 132326, 87, 16, 6);
		Goril goril4 = new Goril("Ribery", 2009, "Gri", 115558, 87, 16, 6);

		Penguen penguen1 = new Penguen("Zıpzıp", 2018, "siyah-beyaz", 115648, 38, "beyaz", "turuncu");
		Penguen penguen2 = new Penguen("Mızmız", 2015, "siyah-beyaz", 159898, 45, "beyaz", "turuncu");
		Penguen penguen3 = new Penguen("Gırgır", 2016, "Damlalı", 321659, 40, "beyaz", "turuncu");
		Penguen penguen4 = new Penguen("Pırpır", 2017, "siyah-beyaz", 323656, 32, "beyaz", "turuncu");
		
		
		// Görevli sınıfında 2 Farklı ArrayList var . Birinci ArrayList Görevlinin ziyaretçilerle ilgilenmesi için.
		
		// İkinci ArrayList hayvanlarla ilgilenilmesi için...
		
		
		ziyaretci1.dinlendir();
		ziyaretci2.hayvanBesle();
		ziyaretci3.kıyafetGiydir();
		ziyaretci4.dinlendir();
		ziyaretci1.otur();
		ziyaretci1.bilgileriGoster();

		gorevli1.dinlendir();
		gorevli2.hayvanBesle();
		gorevli3.hayvanEkle(penguen4);
		gorevli3.hayvanEkle(aslan1);
		gorevli3.hayvanEkle(penguen2);
		gorevli3.hayvanListele();
		
		gorevli4.ziyaretciEkle(ziyaretci4);
		gorevli4.ziyaretciEkle(ziyaretci3);
		gorevli4.ziyaretciEkle(ziyaretci2);
		gorevli4.ziyaretcileriListele();
		gorevli1.otur();
		aslan1.aclikDurumunuKontrolEt();
		aslan1.uyu();
		aslan1.uyu();
		aslan1.aclikDurumunuKontrolEt();
		aslan1.yemekYe();
	}

}
