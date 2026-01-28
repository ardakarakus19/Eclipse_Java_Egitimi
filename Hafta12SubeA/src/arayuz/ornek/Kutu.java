package arayuz.ornek;

public class Kutu implements Comparable<Kutu> {
	
	private float genislik;
	private float yukseklik;
	private float derinlik;
	private static final float varsayilanBoyut = 5;
	
	public Kutu() {
		this(varsayilanBoyut);
	}
	
	public Kutu(float boyut) {
		this(boyut, boyut, boyut);
	}
	
	public Kutu(float genislik, float yukseklik, float derinlik) {
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinlik(derinlik);
	}
	
	public float hacimHesapla() {
		return genislik * yukseklik * derinlik;
	}

	public float getGenislik() {
		return genislik;
	}

	public void setGenislik(float genislik) {
		if(genislik > 0)
			this.genislik = genislik;
		else
			this.genislik = varsayilanBoyut;
	}

	public float getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(float yukseklik) {
		if(yukseklik > 0)
			this.yukseklik = yukseklik;
		else
			this.yukseklik = varsayilanBoyut;
	}

	public float getDerinlik() {
		return derinlik;
	}

	public void setDerinlik(float derinlik) {
		if(derinlik > 0)
			this.derinlik = derinlik;
		else
			this.derinlik = varsayilanBoyut;
	}


	@Override
	public int compareTo(Kutu o) {
		float fark = this.hacimHesapla() - o.hacimHesapla();
		if(fark > 0)
			return 1;
		else if(fark < 0)
			return -1;
		return 0;
	}

}
