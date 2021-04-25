package model;

public class KursModel {
	
	private int id;
	private String kursAdi;
	private String egitmenAdi;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKursAdi() {
		return kursAdi;
	}
	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}
	public String getEgitmenAdi() {
		return egitmenAdi;
	}
	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}
	public KursModel(String kursAdi, String egitmenAdi) {
		super();
		this.kursAdi = kursAdi;
		this.egitmenAdi = egitmenAdi;
	}
	public KursModel() {
		super();
	}
	
	
	
}
