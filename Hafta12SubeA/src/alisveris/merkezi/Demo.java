package alisveris.merkezi;

public class Demo {

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		
		sepet.addMeyve();
		sepet.addPantolon();
		sepet.addSutUrunu();
		sepet.addUstKiyafet();
		sepet.addSebze();
		
		sepet.addUrun(new Meyve(10));
		
		System.out.println("Sepetteki Ürünler: ");
		for(Urun urun : sepet.getUrunler()) {
			System.out.println("-------------------------------");
			System.out.println(urun.getClass().getSimpleName() + ": " + urun.fiyatHesapla());
			if(urun instanceof Yikanabilir) {
				Yikanabilir y = (Yikanabilir) urun;
				y.yikamaTalimati();
			}
			if(urun instanceof Vegan) {
				Vegan v = (Vegan) urun;
				v.icerigiGoruntule();
			}
		}
		
		System.out.println("\nÜrünlerin toplam fiyatı: " + sepet.faturaOlustur());
		

	}

}
