package hw007;

public abstract class Hayvan implements IHayvanEylemleri {

	private String isim;
	private int dogumYili;
	private String renk;
	private int id;
	private double kilo;

	public Hayvan(String isim, int dogumYili, String renk, int id, double kilo) {
		super();
		this.isim = isim;
		this.dogumYili = dogumYili;
		this.renk = renk;
		this.id = id;
		this.kilo = kilo;

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	@Override
	public String toString() {
		return "Hayvan [isim=" + isim + ", dogumYili=" + dogumYili + ", renk=" + renk + ", id=" + id + ", kilo=" + kilo
				+ "]";
	}

	public abstract void bilgileriGoster();

}
