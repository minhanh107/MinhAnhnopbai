package chuong3.bai5;
import java.util.Scanner;
public class Truong {
       private String ten;
       private String diaChi;
       private String hieuTruong;
       Scanner sn= new Scanner(System.in);
       public Truong() {
    	   
       }
	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	public void nhapThongtintruong() {
		System.out.println("nhập tên trường: ");
		this.ten= sn.nextLine();
		System.out.println("nhập địa chỉ trường: ");
		this.diaChi= sn.nextLine();
		System.out.println("nhập hiệu trưởng của trường: ");
		this.hieuTruong= sn.nextLine();
	}
	public String toString() {
		return this.ten+" "+this.diaChi+" "+this.hieuTruong;
	}
}
