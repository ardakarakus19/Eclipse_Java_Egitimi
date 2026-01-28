import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
		Kutu k1 = new Kutu(-5, 20, 30);
		
		System.out.println("Kutunun Genişliği: " + k1.getGenislik());
		System.out.println("Kutunun Hacmi: " + k1.hacimHesapla());
		
		k1.setGenislik(-5);
		System.out.println("Kutunun Genişliği: " + k1.getGenislik());
		System.out.println("Kutunun Hacmi: " + k1.hacimHesapla());
				
		Egitmen e = new Egitmen("Nihal", "Nesne Yönelimli Programlama");
		
		e.bilgileriYaz();
		
		e.setVerdigiDers("Veri Yapıları");
		e.setOgrSayisi(45);
		e.bilgileriYaz();
		
		e.setOgrSayisi(100);
		e.bilgileriYaz();
		

		Scanner oku = new Scanner(System.in);
		
		System.out.println("Eğitmenin adını giriniz");
		String adInput = oku.nextLine();
		
		System.out.println("Verdiği dersi giriniz");
		String dersInput = oku.nextLine();
		
		Egitmen e2 = new Egitmen(adInput, dersInput);
		
		System.out.println("Öğrenci sayısı giriniz");
		int sayiInput = oku.nextInt();
		
		e2.setOgrSayisi(sayiInput);
		e2.bilgileriYaz();

	}

}
