package chuong3.bai1;
import java.util.Scanner;
public class test {
	  public static void main(String[] args) {
		   Person p= new Person();
		   Scanner sn= new Scanner(System.in);
		   System.out.println("nhap ten: ");
		   p.setName(sn.nextLine());
		   System.out.println("nhap tuoi: ");
		   p.setDob(sn.nextLine());
		   System.out.println("nhap noi sinh: ");
		   p.setPob(sn.nextLine());
		   System.out.println("nhap gioi tinh: ");
		   p.setGender(sn.nextLine().charAt(0));
		   System.out.println("nhap email: ");
		   p.setEmail(sn.nextLine());
		   System.out.println("nhap phone: ");
		   p.setPhone(sn.nextLine());
		   System.out.println("thong tin nguoi dung: "+p.toString());
		   

		   


		   


		   



		   p.toString();
	   }
	}

