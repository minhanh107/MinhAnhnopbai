package chuong3.bai12;

public abstract class CongNhan extends Person{
	  protected String loaiCN;

	    public CongNhan() {
	        
	    }

	    public CongNhan(String name, String ns, String place, String loaiCN) {
	        super(name, ns, place);
	        this.loaiCN = loaiCN;
	    }
	    
	    public abstract double thuNhap();

	    public String getLoaiCN() {
	        return loaiCN;
	    }

	    public void setLoaiCN(String loaiCN) {
	        this.loaiCN = loaiCN;
	    }
	    public String toString(){
	        return super.toString() + "Loai cong nhan la: " + this.loaiCN;
	    }
}
