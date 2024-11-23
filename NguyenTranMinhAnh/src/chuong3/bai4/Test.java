package chuong3.bai4;
import java.util.Scanner;
public class Test {
       public static void main(String[] args)
       {
    	   BenhNhan bn= new BenhNhan();
    	   BenhVien bv= new BenhVien();
    	   Scanner sn= new Scanner(System.in);
    	   System.out.println(" nhập tên bệnh nhân: ");
    	   bn.setTen(sn.nextLine());
    	   System.out.println(" nhập tuổi bệnh nhân: ");
    	   bn.setTuoi(sn.nextInt());
    	   sn.nextLine();
    	   System.out.println(" nhập giới tính bệnh nhân: ");
    	   bn.setGioiTinh(sn.nextLine().charAt(0));
    	   System.out.println(" nhập tiền sử: "); 
    	   bn.setTienSu(sn.nextLine());
    	   System.out.println(" nhập chẩn đoán: ");
    	   bn.setChanDoan(sn.nextLine());
    	   System.out.println(" nhập thông tin bệnh viện: ");
    	   System.out.println(" nhập tên: ");
           bv.setTenBV(sn.nextLine());
    	   System.out.println(" nhập địa chỉ: ");
           bv.setDiaChi(sn.nextLine());
    	   System.out.println(" nhập tên giám đốc: ");
    	   bv.setGiamDoc(sn.nextLine());
    	   bn.setBenhVien(bv); 
    	   System.out.println(bn);
       }
}
