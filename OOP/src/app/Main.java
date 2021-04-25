package app;

import model.KursModel;
import model.ProfileModel;
import services.KursService;
import services.ProfileService;

public class Main {

	public static void main(String[] args) {
		 
		//Kiþi ekleme
		ProfileModel profile1 = new ProfileModel();
		
		profile1.setId(1);
		profile1.setMail("deneme@gmail.com");
		profile1.setName("Engin hoca");
		
		ProfileService ps=new ProfileService();
		ps.KisiEkle(profile1);
		
		//Kurs ekleme
		KursModel km=new KursModel();
		km.setId(1);
		km.setEgitmenAdi("Engin Hoca");
		km.setKursAdi("Java Dersleri");
		
		KursService ks=new KursService();
		ks.KursEkle(km);
		

	}

}
