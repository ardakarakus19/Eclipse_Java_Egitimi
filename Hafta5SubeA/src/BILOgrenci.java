
public class BILOgrenci {
	
	String isim;
	int ogrNo;
	BILOgrenci labArkadasi;
	
	public BILOgrenci(String isim, int ogrNo) {
		this.isim = isim;
		this.ogrNo = ogrNo;
	}
	
	void labArkadasiAta(BILOgrenci labArkadasi) {
		this.labArkadasi = labArkadasi;
	}
	
	void bilgileriYaz() {
		System.out.println("Öğrenci No: " + ogrNo + " - Öğrenci isim: " + isim);
		if(labArkadasi != null)
			System.out.println("Lab arkadaşının adı: " + labArkadasi.isim + "\n");
		else
			System.out.println("Bu öğrencinin henüz bir lab arkadaşı yok!");
	}

	public static void main(String[] args) {
		
		BILOgrenci ogr1, ogr2, ogr3;
		
		ogr1 = new BILOgrenci("Ahmet", 1234);
		ogr2 = new BILOgrenci("Mehmet", 1235);
		
		ogr1.labArkadasiAta(ogr2);
		ogr2.labArkadasiAta(ogr1);
		
		ogr3 = new BILOgrenci("Elif", 1236);
		
		ogr1.bilgileriYaz();
		ogr2.bilgileriYaz();
		ogr3.bilgileriYaz();

	}

}
