package chuong3.bai6;

public class PartTimeEmployee extends Employee {
      private int hoursPerWeek;
      public PartTimeEmployee() {
    	  
      }
	public PartTimeEmployee(String name,int age,char gender,String employerName, String dateHired, int hoursPerWeek) {
		super(name,age,gender,employerName,dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public String toString() {
		return super.toString()+" Giờ Làm Việc Mỗi Tuần: "+this.hoursPerWeek;
	}
    @Override
    public void nhapThongtin() {
    	super.nhapThongtin();
    	System.out.println("nhập số giờ làm việc: ");
    	this.hoursPerWeek= sn.nextInt();
    	sn.nextLine();
    }
    @Override
    public void xuatThongtin() {
    	super.xuatThongtin();
    	System.out.println(this.toString());
    }
}
