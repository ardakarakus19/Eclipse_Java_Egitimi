package alisveris.merkezi;

public class UstKiyafet extends Kiyafet {
	
	public UstKiyafet() {
		this(20.0);
	}
	
	public UstKiyafet(double tabanFiyat) {
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
		System.out.println("Üst Kıyafetleri 40 derecede yıkayın");
	}

}
