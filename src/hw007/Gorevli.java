package hw007;

import java.util.ArrayList;

public class Gorevli extends Insan {

	private int gorevliId;
	private ArrayList<Ziyaretci> ziyaretciListesi;
	private int calismaSuresi;
	private ArrayList<Hayvan> hayvanlistesi;

	public Gorevli(String isim, int yas, double boy, int kilo, String gozRengi, int calismaSuresi, int gorevliId) {
		super(isim, yas, boy, kilo, gozRengi);
		this.ziyaretciListesi = new ArrayList<Ziyaretci>();
		this.calismaSuresi = calismaSuresi;
		this.gorevliId = gorevliId;
		this.hayvanlistesi = new ArrayList<Hayvan>();
	}

	public ArrayList<Hayvan> getHayvanlistesi() {
		return hayvanlistesi;
	}

	public void setHayvanlistesi(ArrayList<Hayvan> hayvanlistesi) {
		this.hayvanlistesi = hayvanlistesi;
	}

	public int getCalismaSuresi() {
		return calismaSuresi;
	}

	public void setCalismaSuresi(int calismaSuresi) {
		this.calismaSuresi = calismaSuresi;
	}

	public int getGorevliId() {
		return gorevliId;
	}

	public void setGorevliId(int gorevliId) {
		this.gorevliId = gorevliId;
	}

	public ArrayList<Ziyaretci> getZiyaretciListesi() {
		return ziyaretciListesi;
	}

	public void setGorevliListesi(ArrayList<Ziyaretci> ziyaretciListesi) {
		this.ziyaretciListesi = ziyaretciListesi;
	}

	@Override
	public String toString() {
		return super.toString() + " gorevliId = " + gorevliId + ", ziyaretciListesi = " + ziyaretciListesi
				+ ", calismaSuresi = " + calismaSuresi;
	}

	public void ziyaretciEkle(Ziyaretci Ziyaretci) {
		ziyaretciListesi.add(Ziyaretci);
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());

	}

	public void ziyaretcileriListele() {
		for (int i = 0; i < ziyaretciListesi.size(); i++) {
			System.out.println(getIsim().toString() + " isimli görevlinin ilgilendiği ziyaretçiler: "
					+ ziyaretciListesi.get(i).toString());
		}
	}

	public void hayvanEkle(Hayvan hayvan) {
		hayvanlistesi.add(hayvan);

	}

	public void hayvanListele() {
		for (int i = 0; i < hayvanlistesi.size(); i++) {
			System.out.println(getIsim().toString() + " isimli görevlinin ilgilendiği hayvanlar : "
					+ hayvanlistesi.get(i).getIsim());
		}
	}

	@Override
	public void kıyafetGiydir() {
		System.out.println("Görevli kıyafeti giyildi...");

	}

	@Override
	public void dinlendir() {
		System.out.println("Görevli " + getIsim() + " molaya gitti...");

	}

	@Override
	public void hayvanBesle() {
		System.out.println(getIsim() + " isimli görevli hayvanları besledi...");

	}

	@Override
	public void otur() {
		System.out.println("Gorevli masada oturuyor...");
		
	}
}
