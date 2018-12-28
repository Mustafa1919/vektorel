package mustafa.base;

public class Insan {
	private String ad;
	private String soyad;
	private Insan baba;
	private Insan anne;
	protected Insan sonraki;
	
	public Insan(String ad , String soyad) {
		// TODO Auto-generated constructor stub
		this.ad = ad;
		this.soyad = soyad;
	}

	public String getAd() {return ad;}
	public void setAd(String ad) {this.ad = ad;}

	public String getSoyad() {return soyad;}
	public void setSoyad(String soyad) {this.soyad = soyad;}
	
	public Insan getBaba() {return baba;}
	public void setBaba(String ad , String soyad) {
		this.baba = new Insan(ad , soyad);
	}

	public Insan getAnne() {return anne;}
	public void setAnne(String ad , String soyad) {
		this.anne = new Insan(ad , soyad);
	}
	
	public Insan getSonraki() {return sonraki;}
	public void setSonraki(Insan sonraki) {this.sonraki = sonraki;}
	
	public boolean isEmptyBaba() {return this.anne == null;}
	public boolean isEmptyAnne() {return this.baba == null;}
	public boolean inEmptySonraki() {return this.sonraki != null;}
	
}