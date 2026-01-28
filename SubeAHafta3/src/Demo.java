import java.util.Scanner;
/*
 * standart yorum
 */
/**
 * JavaDoc
 */
public class Demo {
	
	public static void main(String[] args) {
		char c = 'A';
		int x;
		x = c;
		
		System.out.println("c: " + c +  " - x: " + x);
		
		c++;
		System.out.println("c: " + c);
		
		c += 32;
		System.out.println("c: " + c);
		
		int y = 3;
		float sonuc;
		
		sonuc = (float) x / y;
		System.out.println("sonuc: " + sonuc);
		
		y = (int) (sonuc * x);
		System.out.println("1. işlem sonucu y: " + y);
		
		y = (int) sonuc * x;
		System.out.println("2. işlem sonucu y: " + y);
		
		Scanner konsoldanOku = new Scanner(System.in);
		/*
		System.out.println("Lütfen bir tamsayı giriniz:");
		x =konsoldanOku.nextInt();
		System.out.println("Girdiğiniz sayı: " + x);
		if(x%2 == 0) {
			System.out.println("Girdiğiniz sayı çift sayıdır.");
		}
		else {
			System.out.println("Girdiğiniz sayı tek sayıdır");
		}
		*/
		/*
		String gun;
		boolean dogruMu = true;
		
		do {
			System.out.println("Haftanın günlerini hepsi küçük harfle girin:");
			gun = konsoldanOku.next();
			System.out.println("Girdiğiniz gün: " + gun);
			
			switch(gun) {
			case "pazartesi":
			case "salı":
			case "çarşamba":
			case "perşembe":
			case "cuma":
				System.out.println(gun + " günü hafta içidir");
				break;
			case "cumartesi", "pazar":
				System.out.println(gun + " günü hafta sonudur");
				break;
			default:
				dogruMu = false;
				System.err.println("Yanlış veri girdiniz");
			}
		} while(dogruMu);
		System.out.println("Program sonlandırılmıştır");
		*/
		
		float toplam = 0;
		System.out.println("5 tane ondalık sayı giriniz");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". sayıyı girin: ");
			float gecici = konsoldanOku.nextFloat();
			toplam += gecici;
		}
		System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
		System.out.println("Girdiğiniz sayıların ortalaması: " + toplam/5);
		
	}

}
