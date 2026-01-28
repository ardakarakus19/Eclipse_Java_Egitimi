package dinamik.baglama;

public class Demo {

	public static void main(String[] args) {

		Hayvan[] hArr = new Hayvan[5];
		
		hArr[0] = new Kopek();
		hArr[1] = new Kedi();
		hArr[2] = new Kedi();
		hArr[3] = new Kopek();
		hArr[4] = new Hayvan();
		
		for(int i = 0; i < hArr.length; i++) {
			System.out.print(hArr[i].toString() + ": ");
			hArr[i].sesCikar();
		}
		

	}

}
