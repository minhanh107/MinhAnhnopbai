package chuong3.bai1;

public class Person {
	private String name;
	private String dob;//ngay sinh
	private String pob;//noi sinh
	private char gender;
	private String email;
	private String phone;
	public Person() {
	}
	public Person(String name,String dob,String pob,char gender, String email, String phone) {
		this.name=name;
		this.dob= dob;
		this.pob= pob;
		this.gender= gender;
		this.email= email;
		this.phone= phone;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setDob(String dob) {
		this.dob= dob;
	}
	public void setPob(String pob) {
		this.pob=pob;
	}
	public void setGender(char gender) {
		this.gender= gender;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getName() {
		return this.name;
	}
	public String getDob() {
		return this.dob;
	}
	public String getPob() {
		return this.pob;
	}
	public char getGender() {
		return this.gender;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
	public String toString() {
		return "ten cua nguoi la: "+this.name+", ngay sinh: "+ this.dob+", noi sinh: "+this.pob+", gioi tinh: "+this.gender+", email: "+this.email+
				", so dien thoai: "+this.phone;
	}
}
