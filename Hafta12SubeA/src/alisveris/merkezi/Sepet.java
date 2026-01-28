package alisveris.merkezi;

import java.util.ArrayList;

public class Sepet {
	
	private ArrayList<Urun> urunler = new ArrayList<Urun>();
	
	public ArrayList<Urun> getUrunler() {
		return urunler;
	}
	
	public void addSutUrunu() {
		urunler.add(new SutUrunu());
	}
	
	public void addMeyve() {
		urunler.add(new Meyve());
	}
	
	public void addUstKiyafet() {
		urunler.add(new UstKiyafet());
	}
	
	public void addPantolon() {
		urunler.add(new Pantolon());
	}
	
	public void addSebze() {
		urunler.add(new Sebze());
	}
	
	public void addUrun(Urun urun) {
		urunler.add(urun);
	}
	
	public double faturaOlustur() {
		double toplam = 0;
		for(Urun urun : urunler) {
			toplam += urun.fiyatHesapla();
		}
		return toplam;
	}

}
