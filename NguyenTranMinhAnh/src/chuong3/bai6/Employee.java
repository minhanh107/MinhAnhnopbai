package chuong3.bai6;

public class Employee extends Person {
            private String employerName;
            private String dateHired;
            public Employee() {
            	
            }
            public Employee(String name,int age,char gender,String employerName, String dateHired )
            {
            	super(name,age,gender);
            	this.employerName= employerName;
            	this.dateHired= dateHired;
            }
			public String getEmployerName() {
				return employerName;
			}
			public void setEmployerName(String employerName) {
				this.employerName = employerName;
			}
			public String getDateHired() {
				return dateHired;
			}
			public void setDateHired(String dateHired) {
				this.dateHired = dateHired;
			}
            @Override
            public String toString() {
            	return super.toString()+" "+this.employerName+" "+this.dateHired;//in thông tin
            }
            @Override
            public void nhapThongtin() {
            	super.nhapThongtin();//lấy các phương thức trong nhapThongtin() từ lớp Person
            	System.out.println("nhập tên công ty: ");
                this.employerName = sn.nextLine();
            	System.out.println("nhập ngày tuyển dụng: ");
            	this.dateHired = sn.nextLine();
            }
            
}
