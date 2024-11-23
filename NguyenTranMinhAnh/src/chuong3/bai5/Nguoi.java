package chuong3.bai5;
import java.util.Scanner;
public class Nguoi {
   private String ten;
   private int tuoi;
   private char gioiTinh;
   Scanner sn= new Scanner(System.in);
   public Nguoi() {
	   }
   public Nguoi(String ten, int tuoi, char gioiTinh) {
	   this.ten=ten;
	   this.tuoi=tuoi;
	   this.gioiTinh=gioiTinh;
   }
   public void setTen(String ten) {
	   this.ten=ten;
   }
   public String getTen() {
	   return ten;
   }
   public void setTuoi(int tuoi) {
	   this.tuoi=tuoi;
   }
   public int getTuoi() {
	   return tuoi;
   }
   public void setGioiTinh(char gioiTinh) {
	   this.gioiTinh=gioiTinh;
   }
   public char getGioiTinh() {
	   return gioiTinh;
   }
   public void nhapThongtin() {
	   System.out.println("nhập tên: " );
	   this.ten = sn.nextLine();
	   System.out.println("nhập tuổi: ");
	   this.tuoi= sn.nextInt();
	   sn.nextLine();
	   System.out.println("nhập giới tính: ");
	   this.gioiTinh= sn.nextLine().charAt(0);
   }
   public String toString() {
	   return this.ten+" "+this.tuoi+" "+this.gioiTinh;
   }
}
