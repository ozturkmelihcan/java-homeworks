package hw007;

public abstract class Insan implements IKisiEylemleri {

	private String isim;
	private int yas;
	private double boy;
	private int kilo;
	private String gozRengi;

	public Insan(String isim, int yas, double boy, int kilo, String gozRengi) {
		super();
		this.isim = isim;
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
		this.gozRengi = gozRengi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public String getGozRengi() {
		return gozRengi;
	}

	public void setGozRengi(String gozRengi) {
		this.gozRengi = gozRengi;
	}

	@Override
	public String toString() {
		return "isim=" + isim + ", yas=" + yas + ", boy=" + boy + ", kilo=" + kilo + ", gozRengi=" + gozRengi;
	}

	public abstract void bilgileriGoster();
	
	public abstract void otur();

}
