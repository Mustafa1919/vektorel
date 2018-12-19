package mustafa.base;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	private static void menu() {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		
		int secim ; 
		for(;;) {
			System.out.println("Islem onceliksiz hesaplama icin 1'e...");
			System.out.println("Islem oncelikli hesaplama icin 2'ye...");
			System.out.println("Cikis icin 3'e basınız...");
			secim = input1.nextInt();
			if(secim == 1)
				new Makina();
			else if(secim == 2)
				new IslemOncelikli();
			else if (secim == 3) {
				input1.close();
				System.exit(0);
			}
			else
				System.out.println("Hatali bir secim yaptiniz...");
		}
		
		
	}

}
