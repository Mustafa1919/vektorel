package mustafa.base;

import java.util.Scanner;

public class DortIslem {
	
	
	private boolean kontrol;
	private Scanner input;
	private int sayi1,sayi2,sonuc;
	private	String islem , cikis;
	
	public DortIslem() {
		// TODO Auto-generated constructor stub
		this.kontrol = true;
		this.input = new Scanner(System.in);
		while(kontrol) {
			sayiAl();
			System.out.print("Cikmak icin 'x' e devam etmek icin bir tusa basin: ");
			this.cikis = this.input.next();
			if(this.cikis.toUpperCase().equals("X"))
				this.kontrol = false;
		}	
		input.close();
	}
	public void sayiAl() {

		System.out.print("Lutfen ilk sayiyi giriniz: ");
		this.sayi1 = this.input.nextInt();
		
		System.out.print("Lutfen ikinci sayiyi giriniz: ");
		this.sayi2 = this.input.nextInt();
		
		System.out.print("Lutfen islem sembolunu giriniz(+,-,/,*): ");
		this.islem = this.input.next();

		if(this.islem.equals("+"))
			toplama();
		else if(this.islem.equals("-"))
			cikarma();
		else if(this.islem.equals("*"))
			carpma();
		else if(this.islem.equals("/"))
			bolme();
		else
			System.out.println("hatal� bir i�lem girdiniz.");
	}
	
	private void toplama() {
		this.sonuc = this.sayi1 + this.sayi2;
		toPrint();
	}
	
	private void cikarma() {
		this.sonuc = this.sayi1 - this.sayi2;
		toPrint();
	}
	
	private void carpma() {
		this.sonuc = this.sayi1 * this.sayi2;
		toPrint();
	}
	
	private void bolme() {
		if(this.sayi2 == 0)
			System.out.println("Sifira bolme hatasi");
		else {
			this.sonuc = this.sayi1 / this.sayi2;
			toPrint();
		}
	}
	
	
	private void toPrint() {
		
		System.out.println("ilk sayi = " + this.sayi1);
		System.out.println("Ikinci sayi = " + this.sayi2);
		System.out.println(this.sayi1 + " " + this.islem + " " + this.sayi2+" = " + this.sonuc);
	}

}
