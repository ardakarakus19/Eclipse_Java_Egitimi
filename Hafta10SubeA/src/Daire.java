
public class Daire extends Sekil {
	
	double yaricap;
	
	public Daire() {
		isim = "Daire";
		yaricap = 3;
	}
	
	@Override
	public double alanHesapla() {
		return Math.PI * yaricap * yaricap;
	}

}
