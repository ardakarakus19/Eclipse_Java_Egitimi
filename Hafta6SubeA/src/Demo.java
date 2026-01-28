import java.util.Scanner;



public class Demo {
	
	public static int[] diziOlustur() {
		int[] dizi = new int[10];
		
		for(int i = 0; i < dizi.length; i++) {
			dizi[i] = 2*i+1;
		}
		
		return dizi;
	}

	public static void main(String[] args) {
		
		int d[] = diziOlustur();
		
		System.out.println("Dizi içerisindeki değerler: ");
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		
		
		Scanner oku = new Scanner(System.in);
		int sayiDizisi[] = new int[5];
		
		System.out.println(sayiDizisi.length + " tam sayı giriniz");
		for(int i = 0; i < sayiDizisi.length; i++) {
			System.out.print((i+1) + ". sayıyı giriniz: ");
			sayiDizisi[i] = oku.nextInt();
		}
		
		System.out.println("Girdiğiniz sayılar:");
		for(int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(sayiDizisi[i] + " ");
		}
		System.out.println();
		
		int maks = sayiDizisi[0];
		int maksInd = 0;
		
		for(int i = 1; i < sayiDizisi.length; i++) {
			if(maks < sayiDizisi[i]) {
				maks = sayiDizisi[i];
				maksInd = i;
			}
		}
		
		System.out.println("Girmiş olduğunuz " + (maksInd+1) + ". sayı olan " +
							maks + " sayısı en büyük sayıdır");
		
		int toplam = 0;
		float ort;
		
		for(int i = 0; i < sayiDizisi.length; i++) {
			toplam += sayiDizisi[i];
		}
		
		ort = (float) toplam / sayiDizisi.length;
		
		System.out.println("Girdiğiniz sayıların ortalaması: " + ort);
		
		for(int i = 0; i < sayiDizisi.length/2; i++) {
			int temp = sayiDizisi[i];
			int sagInd = sayiDizisi.length-1-i;
			sayiDizisi[i] = sayiDizisi[sagInd];
			sayiDizisi[sagInd] = temp;
		}
		
		System.out.println("Girdiğiniz sayıların tersten yazılışı:");
		for(int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(sayiDizisi[i] + " ");
		}
		System.out.println();
		
	}

}
