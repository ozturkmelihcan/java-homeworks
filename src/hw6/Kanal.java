package hw6;



public abstract  class Kanal extends Televizyon {

	private String kanalAdi;
	private int kanalNo;
	
	
	
	
	public Kanal(String kanalAdi, int kanalNo) {
		super();
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
	}
	public String getKanalAdi() {
		return kanalAdi;
	}
	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}
	public int getKanalNo() {
		return kanalNo;
	}
	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}
	
	
	public void kanalBilgisiGoster() {
		
	}
	}
