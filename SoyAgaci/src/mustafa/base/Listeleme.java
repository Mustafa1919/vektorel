package mustafa.base;

import java.util.Scanner;

public class Listeleme {
	private Scanner input;
	public Listeleme() {
		input = new Scanner(System.in);
	}
	
	//private Insan init() {return this.ben = new Insan("Mustafa" , "Senyurt");}

	public void listeKisiEkle(Insan head , String isim , String soyisim) {
		Insan temp = head;
		/*
		 * Bulamayinca hata verdir.
		 */
		while(!temp.getAd().toLowerCase().equals(isim.toLowerCase()) || 
				!temp.getSoyad().toLowerCase().equals(soyisim.toLowerCase())) {
			temp = temp.sonraki;
		}
		if(temp.isEmptyAnne() || temp.isEmptyBaba()) {
			/*
			 * ilk olusturulandan sonra sonraki bilgisine listede anne 
			 * annenin ardindan da baba eklenerek liste olusturuluyor 
			 * kisinin anne ve baba bilgileri girildikten sonra kisinin 
			 * sonraki bilgisine annesi annesinin ardina da babasi eklenmektedir
			 * 
			 * 
			 *Anne ve baba bilgileri girilicek anne ve baba isim soyisimleri 
			 *bilgileri okunarak parametre olarak verilir 
			 *
			 *temp.setAnne(ad, soyad);
			 *temp.sonraki = temp.getAnne();
			 *temp.setBaba(ad, soyad);
			 *temp.getAnne().sonraki = temp.getBaba();
			*/
			System.out.print("Anne ismini giriniz : ");
			String girdi = input.nextLine();
			String[] adSoyad = girdi.split(" ");
			if(adSoyad.length < 2)
				System.out.println("Eksik Girdi");
			else {
				temp.setAnne(adBul(adSoyad), adSoyad[adSoyad.length-1]);
				listeyeEkle(head, temp.getAnne());
			}
			System.out.print("Baba ismini giriniz : ");
			girdi = input.nextLine();
			adSoyad = girdi.split(" ");
			if(adSoyad.length < 2)
				System.out.println("Eksik Girdi");
			else {
				temp.setBaba(adBul(adSoyad), adSoyad[adSoyad.length-1]);
				listeyeEkle(head, temp.getBaba());
			}
		}
		else
			System.out.println("Eklemek istediginiz kisinin anne baba "
					+ "bilgileri girili...");
	}
	
	public void listeyeEkle(Insan head , Insan eklenecek) {
		Insan temp = head;
		while(temp.inEmptySonraki()) {
			temp = temp.sonraki;
		}
		temp.sonraki = eklenecek;
	}
	
	public String adBul(String[] adSoyad) {
		String ad="";
		if(adSoyad.length == 2)
			return adSoyad[0];
		else {
			for(int i=0; i<adSoyad.length-1;i++)
				ad = ad + adSoyad[i];
			return ad;
		}
	}
	
	public void listele(Insan head) {
		/*
		 * Listeyi bastan sonra listeleme yapar
		 * Baslangic yani beni parametre olarak alir
		 */
		Insan temp = head;
		while(temp != null) {
			yazdir(temp);
			temp = temp.sonraki;
		}
	}
	
	public void yazdir(Insan insan) {
		/*
		 * Anne ve baba bilgileri kontrol edilir
		 * eger bilgiler yok ise sadece isim ve soyisim yazdirilir
		 * bilgileri var ise tum bilgiler yan yana yazdirilir.
		 */
		if(insan.isEmptyAnne() && insan.isEmptyBaba()) 
			System.out.println("Ad : " + insan.getAd() + "\tSoyad : " + 
					insan.getSoyad() + "\n\tAnne ve Baba bilgileri girilmemis.");
		else 
			System.out.println("Ad : " + insan.getAd() + "\tSoyad : " + 
					insan.getSoyad() + "\n\tBabasi : " + insan.getBaba().getAd() + 
					"\tAnnesi : " + insan.getAnne().getAd());
	}

	
}

