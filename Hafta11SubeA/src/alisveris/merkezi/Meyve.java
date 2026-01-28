package alisveris.merkezi;

public class Meyve extends Yiyecek {
	
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

}
