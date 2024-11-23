package chuong3.bai8;
import java.util.Scanner;
public class Test {
	public static void main( String[] args) {
     Shape hcn= new Rectangle();
     Shape htg=new Triangle();
     Scanner sn= new Scanner(System.in);
     //hinh chu nhat
     System.out.println("nhập chiều dài hcn: ");
     int cd=sn.nextInt();
     ((Rectangle) hcn).setLength(cd);
     System.out.println("nhập chiều rộng hcn: ");
     int cr=sn.nextInt();
     ((Rectangle) hcn).setWidth(cr);
     System.out.println(hcn.toString());
     //hinh tam giac
     System.out.println("nhập chiều cao hình tam giác : ");
     int height=sn.nextInt();
     ((Triangle) htg).setHeight(height);
     System.out.println("nhập cạnh đáy hình tam giác : ");
     int base= sn.nextInt();
     ((Triangle) htg).setBase(base);
     System.out.println(htg.toString());

     
     

     
     

     
     


     
	}
}
