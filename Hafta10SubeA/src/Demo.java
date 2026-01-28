
public class Demo {

	public static void main(String[] args) {
		
		Sekil s = new Sekil();
		s.isim = "Belirsiz";
		System.out.println(s.getIsim() + " isimli şeklin alanı: " + s.alanHesapla());
		
		Dikdortgen d = new Dikdortgen();
		System.out.println(d.getIsim() + " isimli şeklin alanı: " + d.alanHesapla());
		System.out.println(d);
		
		Daire daire = new Daire();
		System.out.println(daire.getIsim() + " isimli şeklin alanı: " + daire.alanHesapla());
		
		Hayvan hayvanList[] = new Hayvan[4];
		
		hayvanList[0] = new Kedi();
		hayvanList[1] = new Kedi();
		hayvanList[2] = new Kopek();
		hayvanList[3] = new Kopek();
		
		for(int i = 0; i < hayvanList.length; i++) {
			hayvanList[i].sesCikar();
			if(hayvanList[i] instanceof Kopek) {
				Kopek k = (Kopek) hayvanList[i];
				k.havla();
			}
		}

	}

}
