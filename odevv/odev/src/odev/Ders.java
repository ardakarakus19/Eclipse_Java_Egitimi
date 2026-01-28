package odev;

public class Ders {

	private int kod;
	private String dersadi;
	private int kredi;
	private String gün;
	private float saat;
	
	public Ders(int kod,String dersadi,int kredi,String gün,float saat)
	{
		this.kod=kod;
		this.dersadi=dersadi;
		this.kredi=kredi;
		this.gün=gün;
		this.saat=saat;
		
	}

	public int getKod() {
		return kod;
	}

	public String getDersadi() {
		return dersadi;
	}

	public int getKredi() {
		return kredi;
	}

	public String getGün() {
		return gün;
	}

	public float getSaat() {
		return saat;
	}
	
	public String dersyazdir()
	{
		return kod+"-"+dersadi+"-("+kredi+"kredi)-"+gün  +saat;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
