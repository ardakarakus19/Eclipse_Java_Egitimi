package alisveris.merkezi;

public abstract class Urun {
	
	private double kdv;
	private double tabanFiyati;
	
	public double getKdv() {
		return kdv;
	}
	public void setKdv(double kdv) {
		this.kdv = kdv;
	}
	public double getTabanFiyati() {
		return tabanFiyati;
	}
	public void setTabanFiyati(double tabanFiyati) {
		this.tabanFiyati = tabanFiyati;
	}
	
	public abstract double fiyatHesapla();

}
