package chuong3.bai7;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
	Scanner sn= new Scanner(System.in);
	System.out.println("nhập bán kính: ");
	double bk= sn.nextDouble();
	  Circle cl= new Circle(bk);
	  ResizableCircle rc= new ResizableCircle(bk);
      System.out.println("chu vi của hình tròn là: ");
      System.out.println(cl.getPerimeter());
      System.out.println("diện tích của hình tròn là: ");
      System.out.println(cl.getArea());
      System.out.println("nhập số % muốn giảm: ");
      int percent = sn.nextInt();
      double newradius= rc.resize(percent);
      System.out.println("bán kính của hình tròn sau khi giảm "+percent+"% la: "+newradius);
      System.out.println("chu vi của hình tròn sau giảm "+percent+"% là: "+rc.getPerimeter());
      System.out.println("dien tich của hình tròn sau giảm "+percent+"% là: "+rc.getArea());
   
	}
      
      
}
