package arayuz.ornek;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		Kutu k1 = new Kutu();
		Kutu k2 = new Kutu(3);
		Kutu k3 = new Kutu(1, 3, 9);
		
		System.out.println("k1 hacim: " + k1.hacimHesapla());
		System.out.println("k2 hacim: " + k2.hacimHesapla());
		System.out.println("k3 hacim: " + k3.hacimHesapla());
		
		System.out.println("k1.compareTo(k2): " + k1.compareTo(k2));
		System.out.println("k3.compareTo(k1): " + k3.compareTo(k1));
		System.out.println("k2.compareTo(k3): " + k2.compareTo(k3));
		
		ArrayList<Kutu> kutuListesi = new ArrayList<Kutu>();
		
		kutuListesi.add(k1);
		kutuListesi.add(k2);
		kutuListesi.add(k3);
		kutuListesi.add(new Kutu(3, 5, 7));
		kutuListesi.add(new Kutu(-3, 5, 7));
		kutuListesi.add(new Kutu(1));
		
		System.out.println("Kutuların Hacimleri: ");
		for(Kutu k : kutuListesi) {
			System.out.println("Hacim: " + k.hacimHesapla());
		}
		
		kutuListesi.sort(null);
		System.out.println("Sıralanmış Kutuların Hacimleri: ");
		for(Kutu k : kutuListesi) {
			System.out.println("Hacim: " + k.hacimHesapla());
		}

	}

}
