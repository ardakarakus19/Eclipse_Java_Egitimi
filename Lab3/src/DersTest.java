
public class DersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ders d1 = new Ders("Nesne Yönelimli");
		Ders d2 = new Ders("Programlama");
		Ders d3 = new Ders("Matematik");
		
		d1.MesajiGoster();
		d2.MesajiGoster();
		d3.MesajiGoster();
		
		d2.setDersAdi("Temel Programlama");
		d2.MesajiGoster();
	}

}

