package odev;

import java.util.ArrayList;

public class Danisman {

	private String ad;
	private String soyad;
	private ArrayList<Ogrenci> ogrenciler;
	
	public Danisman(String ad,String soyad)
	{
		this.ad=ad;
		this.soyad=soyad;
		ogrenciler=new ArrayList<>();
	}
	public void ogrenciekle(Ogrenci o)
	{
		 if(ogrenciler.size() >= 40) {
		        System.out.println("Bu danışman maksimum öğrenci sayısına ulaştı!");
	}
		 ogrenciler.add(o);
		 System.out.println(o.getAd()+" "+o.getSoyad()+ " başarıyla eklendi");
		 }
	public void ogrencisil(Ogrenci o)
	{
		ogrenciler.remove(o);
		System.out.println(o.getAd()+" "+o.getSoyad()+ " başarıyla silindi");
	}
	public void ogrencibilgigöster(Ogrenci o)
	{
		System.out.println("Öğrenci Adı: " + o.getAd());
        System.out.println("Öğrenci Soyadı: " + o.getSoyad());
        System.out.println("Öğrenci Numarası: " + o.getNumara());
        System.out.println("Dönem: " + o.getDönem());
        System.out.println("GPA: " + o.getGpa());
        System.out.println("Max Kredi: " + o.maxkredihesapla());
	}
	public void transkgör(Ogrenci o)
	{
		o.transkriptYazdir();
	}
	public void haftalikProgramGor(Ogrenci o) {
        o.getHaftalikProgram();
    }

    
    public boolean dersEkle(Ogrenci o, Ders d) {
        return o.dersEkle(d);
    }

    
    public boolean dersSil(Ogrenci o, int dersKod) {
        return o.derssil(dersKod);
    }
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}



	
	
	
	
	
	
	
}
