package chuong3.bai8;

public class Triangle extends Shape {
       private int base;
       private int height;
       public Triangle() {
    	   
       }
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    @Override
    public double getArea() {
    	return (base*height)/2;
    }
    @Override
    public String toString() {
    	return " dien tich hinh tam giac la: "+this.getArea();
    }

}
