package mustafa.base;

import java.util.Scanner;

public class IslemOncelikli {
	
	Cati cati ;
	Scanner input;
	private float[] numbers;
	private String[] islemler;
	public IslemOncelikli() {
		// TODO Auto-generated constructor stub
		this.cati = new Cati();
		this.input = new Scanner(System.in);
		this.numbers = new float[20];
		this.islemler = new String[20];
		setNumber();
	}
	
	
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


	private void operation(int count) {
		// TODO Auto-generated method stub
		/*
		 * ara degiskenler tanimlayarak verilerin kaybolmamasi saglandı
		 */
		int temp = count;
		String[] tempIslemler = new String[count];
		float[] tempNumbers = new float[count];
		/*
		 * tanimlana ara degiskenlere kopyalama islemi yapildi
		 */
		tempIslemler = atamaYap(tempIslemler , this.islemler);
		tempNumbers = atamaYap(tempNumbers, this.numbers);
		
		float result;
		/*
		 * ilk once * ve / islemleri kontrol edilerek onlar gerceklestirildi 
		 */
		for(int i=0 ; i<count ; ++i) {
			if(tempIslemler[i].equals("*") || tempIslemler[i].equals("/")) {
				/*
				 * islem sonunda veri tekrar ayni konuma yazildi 
				 */
				tempNumbers[i] = this.cati.checkOperation(tempIslemler[i], 
						tempNumbers[i], tempNumbers[i+1]);
				/*
				 * islem yapildiktan sonra islemden sonraki dizi elemanlari
				 * birer sola kaydirilarak isleme kaldigi yerden devam edildi 
				 */
				kaydir(i , count , tempIslemler , tempNumbers);
				count--;
				i--;
			}
		}
		result = tempNumbers[0];
		/*
		 * kalan + ve - islemi bu for icinde gerceklestirildi
		 */
		for(int i=0; i<count ; i++) {
			result = this.cati.checkOperation(tempIslemler[i], result , 
					tempNumbers[i+1]);
		}
		this.cati.print(result, temp, this.numbers, this.islemler);
	}


	private void kaydir(int nokta,int count,String[] tempIslemler,float[] tempNumbers) {
		// TODO Auto-generated method stub
		//*****************************************************************
		//dizi boyu aşma hatası alıyor debug yap
		for (int i=nokta ; i<count ; i++) {
			if(!(i+2 >= count))
				tempNumbers[i+1] = tempNumbers[i+2];
			if(!(i+1 >= count))
				tempIslemler[i] = tempIslemler[i+1];
		}
		
	}
	
	
	private String[] atamaYap(String[] dizi1 , String[] dizi2) {
		for(int i = 0; i<dizi1.length; i++)
			dizi1[i] = dizi2[i];
		return dizi1;
	}
	
	private float[] atamaYap(float[] dizi1 , float[] dizi2) {
		for(int i = 0; i<dizi1.length; i++)
			dizi1[i] = dizi2[i];
		return dizi1;
	}

}
