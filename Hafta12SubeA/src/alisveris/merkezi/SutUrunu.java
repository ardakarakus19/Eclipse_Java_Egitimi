package alisveris.merkezi;

public class SutUrunu extends Yiyecek {
	
	public SutUrunu() {
		this(8.0);
	}
	
	public SutUrunu(double tabanFiyat) {
		setTabanFiyati(tabanFiyat);
	}

	@Override
	public double fiyatHesapla() {
		double fiyat = getTabanFiyati() + getTabanFiyati() * getKdv();
		fiyat *= 1.3;
		return fiyat;
	}

}
