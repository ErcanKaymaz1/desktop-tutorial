package services;

import model.KursModel;

public class KursService {
	
	public void KursEkle(KursModel kurs) {
		
		System.err.println(kurs.getKursAdi()+" eklendi....");
	}
}
