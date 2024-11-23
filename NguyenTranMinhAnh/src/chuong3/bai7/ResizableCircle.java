package chuong3.bai7;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius)
	{
		super(radius);
	}
	@Override
	 public double resize(int percent)
	 {
		 radius *= percent/100.0;
		 return radius;
	 }
}
