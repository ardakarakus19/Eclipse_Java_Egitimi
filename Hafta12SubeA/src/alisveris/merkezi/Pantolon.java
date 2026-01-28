package alisveris.merkezi;

public class Pantolon extends Kiyafet {
	
	public Pantolon() {
		this(40.0);
	}
	
	public Pantolon(double tabanFiyat) {
		setTabanFiyati(tabanFiyat);
	}

	@Override
	public double fiyatHesapla() {
		double fiyat = getTabanFiyati() + getTabanFiyati() * getKdv();
		fiyat *= 1.2;
		return fiyat;
	}

	@Override
	public void yikamaTalimati() {
		System.out.println("Pantalonları 30 derecede yıkayın");
	}

}
