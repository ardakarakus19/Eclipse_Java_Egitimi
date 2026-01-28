package odev;

import java.util.ArrayList;

public class Ogrenci {

	private double numara;
	private String ad;
	private String soyad;
	private String dönem;
	private double gpa;
	private float maxkredi;
	private ArrayList<Ders> transkript;
	private ArrayList<Ders> haftalikProgram;
	
	public Ogrenci(double numara,String ad,String soyad,String dönem,double gpa,float maxkredi)
	{
		this.numara=numara;
		this.ad=ad;
		this.soyad=soyad;
		this.dönem=dönem;
		this.gpa=gpa;
		this.maxkredi=maxkredi;
		
		haftalikProgram = new ArrayList<>();
		transkript=new ArrayList<>();
	}
	public float maxkredihesapla()
	{
		if(gpa>=3.50)
		{
			return maxkredi+6;
		}
		else if(gpa<=3.49 && gpa>3.0)
		{
			return maxkredi+3;
		}
		else {
			return maxkredi;
		}
	}
	public boolean dersEkle(Ders YeniDers)
	{
		
		for(Ders d:haftalikProgram)
		{
			if(d.getKod()==YeniDers.getKod())
			{
				System.out.println("Bu ders zaten eklenmiş, başka ders ekleyiniz");
				return false;
			}
		}

		
		for(Ders d:haftalikProgram)
		{
			if(d.getGün().equals(YeniDers.getGün()) && d.getSaat()==YeniDers.getSaat())
            {
	            System.out.println("Ders saati çakışıyor");
	            return false;
            }
		}
		
		
		int suankiToplamKredi = 0;
        for(Ders d:haftalikProgram) {
            suankiToplamKredi += d.getKredi();
        }
        
       
        float krediLimiti = maxkredihesapla();

		
		if(suankiToplamKredi + YeniDers.getKredi() > krediLimiti) 
		{
			System.out.println("Kredi limiti aşıldı! Ekleyemezsiniz. (Limit: " + krediLimiti + ")");
	        return false;
		}

        
		haftalikProgram.add(YeniDers);
		System.out.println("Yeni ders başarıyla eklendi");
		return true;
	}
	public boolean derssil(int kod)
	{
		for(Ders d:haftalikProgram)
		{
			if(d.getKod()==kod)
			{
				haftalikProgram.remove(kod);
				System.out.println("Ders silindi.");
	            return true;
			}
		}
		System.out.println("Bu kodda bir ders bulunamadı.");
	    return false;
	}
	
	public double getNumara() {
		return numara;
	}
	
	public String getAd() {
		return ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public String getDönem() {
		return dönem;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public float getMaxkredi() {
		return maxkredi;
	}
	
	public ArrayList<Ders> getTranskript() {
		return transkript;
	}
	
	public ArrayList<Ders> getHaftalikProgram() {
		return haftalikProgram;
	}
	
	public void transkriptYazdir() {
	    System.out.println("===== Transkript =====");
	    
	    if (transkript.isEmpty()) {
	        System.out.println("Transkript boş.");
	        return;
	    }
	    
	    for (Ders d : transkript) {
	        System.out.println(d.dersyazdir());
	    }
	    
	    System.out.println("=====================");
	}
	
	
	
	
	
	
	
	
}
