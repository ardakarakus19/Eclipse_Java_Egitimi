import java.util.ArrayList;
import java.util.Scanner;

public class MainSinifi {
	
	public static int fib(int n) {
		if(n < 0) {
			System.err.println("Parametre sıfırdan küçük olamaz");
			return -1;
		}
		if(n == 0 || n == 1)
			return n;
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static double usAl(double taban, int us) {
		if(us < 0) {
			us *= -1;
			return 1 / usAl(taban, us);
		}
		if(us == 0)
			return 1;
		else if(us%2 == 0) {
			us /= 2;
			double yarim = usAl(taban, us);
			return yarim * yarim;
		}
		else {
			us--;
			return taban * usAl(taban, us);
		}
	}

	public static void main(String[] args) {
		
		int sayi = 10;
		System.out.println("Fibonacci serisinin " + sayi + ". sayısı: " + fib(sayi));
		
		double t = 2;
		int us = -3;
		System.out.println(t + " sayısının " + us + ". kuvveti: " + usAl(t, us));
		
		/*
		int tamsayiArr[] = new int[5];
		Scanner oku = new Scanner(System.in);
		
		System.out.println("5 tamsayı girin:");
		for(int i  = 0; i < tamsayiArr.length; i++) {
			System.out.print((i+1) + ". tamsayıyı giriniz: ");
			int sayi = oku.nextInt();
			tamsayiArr[i] = sayi;
		}
		
		int tekTop = 0, ciftTop = 0;
		for(int i = 0; i < tamsayiArr.length; i++) {
			if(tamsayiArr[i]%2 == 0) {
				ciftTop += tamsayiArr[i];
			}
			else {
				tekTop += tamsayiArr[i];
			}
		}
		
		System.out.println("Girdiğiniz sayıların tek olanlarının toplamı: " + tekTop);
		System.out.println("Girdiğiniz sayıların çift olanlarının toplamı: " + ciftTop);
		
		if(tekTop > ciftTop) {
			System.out.println("Girdiğiniz tek sayıların toplamı çift sayıların toplamından büyüktür");
		}
		else if(ciftTop > tekTop) {
			System.out.println("Girdiğiniz çift sayıların toplamı tek sayıların toplamından büyüktür");
		}
		else {
			System.out.println("Girdiğiniz tek sayıların toplamı çift sayıların toplamına eşittir");
		}
		
		int ogrSayisi = 0;
		ArrayList<String> ogrListesi = new ArrayList<String>();
		
		while(ogrSayisi <= 0) {
			System.out.println("BIL201 dersini alan öğrenci sayısını giriniz.");
			System.out.println("Girdiğiniz sayı sıfırdan büyük olmalıdır");
			ogrSayisi = oku.nextInt();
		}
		
		oku.nextLine();
		for(int i = 1; i <= ogrSayisi; i++) {
			System.out.print(i + ". öğrencinin ismi: ");
			String isim = oku.nextLine();
			ogrListesi.add(isim);
		}
		
		System.out.println("Girdiğiniz öğrencilerin ismi:");
		for(String isim : ogrListesi) {
			System.out.println(isim);
		}
		
		ogrListesi.sort(null);
		
		System.out.println("İsimlerin harf sırasına göre listesi");
		for(String isim : ogrListesi) {
			System.out.println(isim);
		}
		*/

	}

}
