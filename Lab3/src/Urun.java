
public class Urun {
	
	private int stok;
	
	public Urun(int baslangicstok){
		if(baslangicstok<0) {
			System.out.println("Stok 0 dan az olamaz");
			this.stok = 0;
		}else {
			this.stok = baslangicstok;
		}
}
	
	public int getStok() {
		return stok;
	}

	public void ekle(int miktar) {
		if(miktar<0) {
			System.out.println("Eklenecek miktar 0 dan küçük olamaz");
		}else {
			stok +=miktar;
			System.out.println("Eklenecek miktar: " + miktar);
		}
	}
	
	public void cikar(int miktar) {
		if(miktar>stok) {
			System.out.println("Çıkarılacak miktar stoktan büyük olamaz");
		}else {
			stok -=miktar;
			System.out.println("Çıkarılacak miktar: " + miktar);
		}
	}

}
