package alisveris.merkezi;

public class Sebze extends Yiyecek implements Vegan, Yikanabilir {
	
	public Sebze() {
		this(10.0);
	}
	
	public Sebze(double tabanFiyati) {
		setTabanFiyati(tabanFiyati);
	}

	@Override
	public void yikamaTalimati() {
		System.out.println("Sebzeleri ılık suyla yıkayın");
	}

	@Override
	public void icerigiGoruntule() {
		System.out.println("Sadece sebzelerden oluşmuştur");
	}

	@Override
	public double fiyatHesapla() {
		double fiyat = getTabanFiyati() * (1 + getKdv());
		return 1.25 * fiyat;
	}

}
