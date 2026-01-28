
public class UrunTest {
	public static void main(String[] args) {
	Urun u1 = new Urun(15);
	System.out.println("Başlangıç stok: " + u1.getStok());
	
	u1.ekle(5);
	u1.cikar(20);
	
	System.out.println("Eldeki son stok miktarı " + u1.getStok());
}
}