
public class Ders {
	private String dersAdi;
	
	public Ders(String dersAdi) {
		if (dersAdi == null || dersAdi.isBlank()) {
       	 System.out.println("Ders adı boş olmamalı");
       	 this.dersAdi = "(atanmadı)";
       }
       this.dersAdi = dersAdi;
   }

	String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		if(dersAdi==null || dersAdi.isBlank()) {
			System.out.println("Geçersiz Ders Adı");
		}
		this.dersAdi = dersAdi;
	}
	public void MesajiGoster() {
		System.out.println("Ders Adı: " + dersAdi);
		}
}