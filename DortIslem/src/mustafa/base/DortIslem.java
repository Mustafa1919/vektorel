package mustafa.base;

import java.util.Scanner;

public class DortIslem {
	
	private Scanner input;
	private int sayi1,sayi2,sonuc;
	private	String islem;
	
	public DortIslem() {
		// TODO Auto-generated constructor stub
		this.input = new Scanner(System.in);
		sayiAl();
		input.close();
	}
	
	public void sayiAl() {

		System.out.print("Lütfen ilk sayıyı giriniz: ");
		this.sayi1 = this.input.nextInt();
		
		System.out.print("Lütfen ikinci sayıyı giriniz: ");
		this.sayi2 = this.input.nextInt();
		
		System.out.print("Lütfen işlem sembolünü giriniz(+,-,/,*): ");
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
			System.out.println("hatalı bir işlem girdiniz.");
	}
	
	public void toplama() {
		this.sonuc = this.sayi1 + this.sayi2;
		toPrint();
	}
	
	public void cikarma() {
		this.sonuc = this.sayi1 - this.sayi2;
		toPrint();
	}
	
	public void carpma() {
		this.sonuc = this.sayi1 * this.sayi2;
		toPrint();
	}
	
	public void bolme() {
		this.sonuc = this.sayi1 / this.sayi2;
		toPrint();
	}
	
	
	private void toPrint() {
		System.out.println("İlk sayı = " + this.sayi1);
		System.out.println("İkinci sayı = " + this.sayi2);
		System.out.println(this.sayi1 + " " + this.islem + " " + this.sayi2+" = " + this.sonuc);
	}

}
