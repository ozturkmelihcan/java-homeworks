package hw007;

public class Ziyaretci extends Insan {

	private int ziyaretciId;

	public Ziyaretci(String isim, int yas, double boy, int kilo, String gozRengi, int ziyaretciId) {
		super(isim, yas, boy, kilo, gozRengi);
		this.ziyaretciId = ziyaretciId;
	}

	public int getZiyaretciId() {
		return ziyaretciId;
	}

	public void setZiyaretciId(int ziyaretciId) {
		this.ziyaretciId = ziyaretciId;
	}

	@Override
	public String toString() {
		return super.toString() + " ziyaretciId = " + ziyaretciId;
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(this.toString());

	}

	@Override
	public void kıyafetGiydir() {
		System.out.println("Ziyaretçi kıyafetleri giyildi...");

	}

	@Override
	public void dinlendir() {
		System.out.println("ziyaretçi " + getIsim() + " su alıp kenarda dinlendi...");

	}

	@Override
	public void hayvanBesle() {
		System.out.println(getIsim() + " hayvanları besliyor...");

	}

	@Override
	public void otur() {
		System.out.println("Ziyaretçi " + getIsim()+ " kafesin karşısında oturuyor...");
		
	}

}
