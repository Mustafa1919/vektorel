/*
 * @Mustafa Senyurt
 * 16/12/2018
 * Hesap Makinasi 
 */
package mustafa.base;
import java.util.Scanner;

public class Makina {
	
	Cati cati ;
	Scanner input;
	private float[] numbers;
	private String[] islemler;

	public Makina() {
		// TODO Auto-generated constructor stub
		this.cati = new Cati();
		this.input = new Scanner(System.in);
		this.numbers = new float[20];
		this.islemler = new String[20];
		setNumber();
		//*************************************************
		//alt kodu aktif edince hata verdirmesinin nedenini sor 
		//************************************************
		//this.input.close();
	}
	
	
	/*
	 * Alinan islemler ve sayilar parcalanarak 
	 * gerekli aritmetik isleme sokulur
	 */
	private void operation(int count) {
		float result = this.numbers[0];
		for(int i=0 ; i<count ; i++) {
			result = this.cati.checkOperation(this.islemler[i], result , this.numbers[i+1]);
		}
		this.cati.print(result , count , numbers , islemler);
	}
	
	
	/*
	 * Hesaplanacak olan sayilarin ve aritmetik karakterlerin
	 * girdisi kullanicidan alinir
	 * = girildiginde dongu kirilir
	 */
	private void setNumber() {	
		int count = 0;
		while(true) {
			System.out.print("Sayiyi giriniz: ");
			this.numbers[count] = input.nextFloat();
			System.out.print("Aritmetik islemi giriniz: ");
			this.islemler[count] = input.next();
			if(islemler[count].equals("=")) {
				count++;
				break;
			}
			count++;
		}
		operation(count);
	}
	
}



