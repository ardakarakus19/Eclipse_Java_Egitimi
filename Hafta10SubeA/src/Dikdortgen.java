
public class Dikdortgen extends Sekil {
	
	double genislik;
	double yukseklik;
	
	public Dikdortgen() {
		isim = "Dikdörtgen";
		genislik = 5;
		yukseklik = 3;
	}
	
	@Override
	public double alanHesapla() {
		return genislik * yukseklik;
	}
	
	@Override
	public String getIsim() {
		if(genislik == yukseklik) {
			return "Kare";
		}
		return super.getIsim();
	}
	
	@Override
	public String toString() {
		return "Dikdörtgenin yuksekliği: " + yukseklik + " genisliği: " + genislik;
	}

}
