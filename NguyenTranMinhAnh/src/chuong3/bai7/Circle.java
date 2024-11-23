package chuong3.bai7;

public class Circle implements GeometricObject {
       protected double radius = 1.0;
       public Circle() {
    	   
       }
       public Circle(double radius)
       {
    	   this.radius=radius;
       }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
      @Override
      public double getPerimeter() {
    	  return 2*radius*Math.PI;
      }
      @Override
      public double getArea() {
    	  return radius*radius*Math.PI;
      }
       
}
