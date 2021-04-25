package model;

public class ProfileModel {

	private int id;
	private String Name;
	private String Mail;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	public ProfileModel(String name, String mail) {
		super();
		Name = name;
		Mail = mail;
	}
	public ProfileModel() {
		super();
	}
	
	
}
