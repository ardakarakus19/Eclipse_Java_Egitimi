package odev;

public class calıstır {

	public static void main(String[] args) {
		
		Danisman danisman=new Danisman("sevcan","bulut");
		
		Ogrenci ogrenci=new Ogrenci(240411026,"Arda", "Karakuş", "2", 3.44, 20);
		Ogrenci ogrenci2=new Ogrenci(240411027,"Anıl", "Karakuş", "2", 3.15, 20);
		Ogrenci ogrenci3=new Ogrenci(240411028,"Ada", "Karakuş", "2", 3.11, 20);
		Ogrenci ogrenci4=new Ogrenci(240411029,"Aslı", "Karakuş", "2", 3.2, 20);
		
		danisman.ogrenciekle(ogrenci);
		danisman.ogrenciekle(ogrenci2);
		danisman.ogrenciekle(ogrenci3);
		danisman.ogrenciekle(ogrenci4);
		
		Ders ders1 = new Ders(101, "Nesne Yönelimli Programlama", 4, "Pazartesi", 10);
        Ders ders2 = new Ders(102, "Veri Yapıları", 5, "Salı", 12);
        Ders ders3 = new Ders(103, "Algoritmalar", 5, "Pazartesi", 10);
        
        System.out.println("\n--- Ders Ekleme ---");
        danisman.dersEkle(ogrenci, ders1);
        danisman.dersEkle(ogrenci, ders2);
        danisman.dersEkle(ogrenci, ders3);
        
        System.out.println("\n--- Arda'nın Haftalık Programı ---");
        {
            System.out.println(ders1.dersyazdir());
            System.out.println(ders2.dersyazdir());
            System.out.println(ders3.dersyazdir());
        }

       
        ogrenci.getTranskript().add(ders1);
        ogrenci.getTranskript().add(ders2);

        
        System.out.println("\n--- Arda'nın Transkripti ---");
        ogrenci.transkriptYazdir();

        
        System.out.println("\n--- Öğrenci Bilgi ---");
        danisman.ogrencibilgigöster(ogrenci);
        
	}

}
