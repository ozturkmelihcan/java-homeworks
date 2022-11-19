package hw6;



public class MuzikKanali extends Kanal {
	
	private String muzikTuru;
	
	
	public MuzikKanali(String kanalAdi, int kanalNo,String muzikTuru) {
		super(kanalAdi, kanalNo);
		this.muzikTuru = muzikTuru;
	}


	public String getMuzikTuru() {
		return muzikTuru;
	}

	public void setMuzikTuru(String muzikTuru) {
		this.muzikTuru = muzikTuru;
	}
	
	
	
}