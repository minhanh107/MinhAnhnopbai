package chuong3.bai3;
import java.util.Scanner;
public class Test {
     public static void main(String[] args) {
    	 NhanVien nv= new NhanVien();
    	 Scanner sn= new Scanner(System.in);
    	 DiaChi dc= new DiaChi();
    	 System.out.println("nhập tên: "); 
    	 nv.setName(sn.nextLine());
    	 System.out.println("nhập địa chỉ(thôn, xã, huyện, tỉnh: "); 
    	 dc.setThon(sn.nextLine());
    	 dc.setXa(sn.nextLine());
    	 dc.setHuyen(sn.nextLine());
    	 dc.setTinh(sn.nextLine());
    	 nv.setAddress(dc);
    	 System.out.println("nhập ngày sinh: "); 
    	 nv.setDob(sn.nextLine());
    	 System.out.println("nhập giới tính: ");
    	 nv.setGender(sn.nextLine().charAt(0));
    	 System.out.println(nv.toString()); 
     }
}
