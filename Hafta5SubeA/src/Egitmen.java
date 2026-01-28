
public class Egitmen {
	
	private String ad;
	private String verdigiDers;
	private int ogrSayisi;
	private static final int MIN_OGR_SAY = 5;
	
	public Egitmen(String ad, String verdigiDers) {
		this.ad = ad;
		this.verdigiDers = verdigiDers;
		this.ogrSayisi = MIN_OGR_SAY;
	}
	
	public void bilgileriYaz() {
		System.out.println("------------------");
		System.out.println("Eğitmenin adı: " + ad);
		System.out.println("Eğitmenin verdiği ders: " + verdigiDers);
		System.out.println("Öğrenci sayısı: " + ogrSayisi);
	}

	public String getVerdigiDers() {
		return verdigiDers;
	}

	public void setVerdigiDers(String verdigiDers) {
		this.verdigiDers = verdigiDers;
	}

	public int getOgrSayisi() {
		return ogrSayisi;
	}

	public void setOgrSayisi(int ogrSayisi) {
		if(ogrSayisi >= MIN_OGR_SAY && ogrSayisi <= 50)
			this.ogrSayisi = ogrSayisi;
		else
			this.ogrSayisi = MIN_OGR_SAY;
	}

	public String getAd() {
		return ad;
	}
	
	

}
