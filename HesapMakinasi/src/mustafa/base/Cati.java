/*
 * @Mustafa Senyurt
 * 19/12/2018
 * Hesap Makinasi 
 */

package mustafa.base;

public class Cati {

	
	/*
	 * Aritmetik kontrol yapılır
	 */
	public float checkOperation(String s , float number1 , float number2) {
		if(s.equals("+"))
			return toplama(number1, number2);
		else if(s.equals("-"))
			return cikarma(number1, number2);
		else if(s.equals("*"))
			return carpma(number1, number2);
		else if(s.equals("/"))
			return bolme(number1, number2);
		else if(s.equals("="))
			return number1;
		else {
			System.out.println("Hatali giris");
			return number1;
		}	
	}

	
	/*
	 * Yapilacak olan aritmetik islemler bu bolumde yazilmistir.
	 * toplama
	 * cikarma
	 * bolme
	 * carpma
	 */
	private float toplama(float number1 , float number2 ) {
		return number1+number2;
	}
	private float cikarma(float number1 , float number2) {
		return number1 - number2;
	}
	private float carpma(float number1 , float number2) {
		return number1 * number2 ; 
	}
	private float bolme(float number1 , float number2) {
		if (number2 == 0)
			return 0;
		else
			return number1 / number2 ;	
	}
	
	
	/*
	 * *************************************************************
	 * 
	 * duzenli yazdirma islemi
	 */
	public void print(float result , int count , float[] numbers , String[] islemler) {
		for(int i=0 ; i<count;i++) {
			System.out.print(numbers[i] + " " + islemler[i] + " ");
		}
		System.out.print(result + "\n");
	}
}
