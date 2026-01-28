package alisveris.merkezi;

public class Meyve extends Yiyecek implements Vegan, Yikanabilir {
	
	public Meyve() {
		this(6.0);
	}
	
	public Meyve(double tabanFiyati) {
		setTabanFiyati(tabanFiyati);
	}

	@Override
	public double fiyatHesapla() {
		double fiyat = getTabanFiyati() + getTabanFiyati() * getKdv();
		fiyat *= 1.2;
		return fiyat;
	}

	@Override
	public void icerigiGoruntule() {
		System.out.println("Sadece meyvelerden oluşur.");
	}

	@Override
	public void yikamaTalimati() {
		System.out.println("Meyveleri soğuk suyla yıkayın.");
	}

}
