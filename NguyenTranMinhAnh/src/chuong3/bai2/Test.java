package chuong3.bai2;
import java.util.Scanner;
public class Test {
   public static void main(String[] args) {
	   Address ad= new Address();
	   Scanner sn= new Scanner(System.in);
	   System.out.println("nhập thôn: ");
	   ad.setThon(sn.nextLine());
	   System.out.println("nhập xã: ");
	   ad.setXa(sn.nextLine());
	   System.out.println("nhập huyện: ");
	   ad.setHuyen(sn.nextLine());
	   System.out.println("nhập tỉnh: ");
	   ad.setTinh(sn.nextLine());
	   System.out.println("Địa chỉ là: "+ ad.toString());
   }
}
