package mustafa.base;

public class Hastalik {
	
	private boolean kalitsalDurum;
	private String ad;
	private int hastalikSuresi;
	private boolean tedaviVarmi;
	private Hastalik hastalik;
	public Hastalik() {}
	
	public Hastalik(boolean kalitsalDurum , String ad) {
		// TODO Auto-generated constructor stub
		this.kalitsalDurum = kalitsalDurum ;
		this.ad = ad;
		siniflandir();
	}
	
	private void siniflandir() {
		if(kalitsalDurum)
			hastalik = new KalitsalHastalik();
		else
			hastalik = new KalitsalOlmayanHastalik();
	}
	
	public void gorulmeOranı() {
		/*
		 * Hastaligin turkiyede gorulme oranini hesaplanan metod
		 * 81 milyon insanin yuzde kacinda goruldugunun hesaplanmasi
		 * Hastaligin en yogun goruldugu iller 
		 * Turkiyede bu hastalik ne kadar goruldu ve Turkiye nufusuna orani
		 * 
		 * Bu bilgiler kullaniciya gosterilecek ve tablolarla desteklenecek
		 */
	}
	
	public void tedaviSuresi() {
		/*
		 * Bu hastaligin ortalama tedavi suresinin hesaplanmasi 
		 * Yaklasik kac haftada hastalik iyilesmeye basliyor
		 * 
		 * hastalikSuresi = Toplam Hastalik Suresi / Hastalik Gorulme Sayisi
		 */
	}
	
	public void belirtileri() {
		/*
		 * Hastalik olmadan once ne gibi belirtileri var 
		 * Gelen hastalarin sikayetleri neler gibi bilgiler girilmesi 
		 * Bunun nedeni tahmin yaparken bu bilgiler kullanilarak 
		 * 		hastalik tahmini yapabilmek
		 */
	}
	
	public void ilacTedavisi() {
		/*
		 * Hastalikta kullanilan ilaclar 
		 * Bu metod icinde bu kullanilan ilaclara hastanin verdigi tepkide 
		 * olculerek verilen ilaclarin tedavide etkisi incelenebilir
		 * Belirtiler de incelenerek burda derecelendirilen ilac bilgileri ile 
		 * ilac tavsiyesi gerceklestirelebilir
		 */
	}
	
	public void uygulanacakTedavi() {
		/*
		 * Hastalik boyunca uygulanacak tedavi yontemi 
		 * Child siniflarda bu metod override edilerek ozellestirilebilir
		 * Tedavi surecinin derecelendirmesi yapilabilir.
		 */
	}

}
