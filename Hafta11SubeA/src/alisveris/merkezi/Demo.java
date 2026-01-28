package alisveris.merkezi;

public class Demo {

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		
		sepet.addMeyve();
		sepet.addPantolon();
		sepet.addSutUrunu();
		sepet.addUstKiyafet();
		
		sepet.addUrun(new Meyve(10));
		
		sepet.faturaOlustur();

	}

}
