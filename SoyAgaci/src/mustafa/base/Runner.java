package mustafa.base;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insan ilkInsan = new Insan("Mustafa" , "Senyurt");
		Listeleme listeIslemleri = new Listeleme();
		/*
		 * Kisi ekleme dongu seklinde olarak istenildigi kadar ekleme yapilabilcek
		 */
		listeIslemleri.listeKisiEkle(ilkInsan , "Mustafa", "Senyurt");
		listeIslemleri.listele(ilkInsan);
		listeIslemleri.listeKisiEkle(ilkInsan , "Navruz", "Senyurt");
		listeIslemleri.listele(ilkInsan);
		listeIslemleri.listeKisiEkle(ilkInsan , "Haydar", "Senyurt");
		listeIslemleri.listele(ilkInsan);

	}

}
