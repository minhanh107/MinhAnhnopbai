package chuong3.bai5;

public class SinhVien extends Nguoi {
       private String lop;
       private String nganh;
       private Truong truong;
       public SinhVien() {
    	   super();
       }
       public SinhVien(String ten, int tuoi, char gioiTinh,String lop, String nganh, Truong truong) {
    	   super(ten,tuoi,gioiTinh);
    	   this.lop=lop;
    	   this.nganh= nganh;
    	   this.truong= truong;
       }
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public void nhapThongtin() {
		// TODO Auto-generated method stub
		System.out.println("nhập thông tin sinh viên: ");
		super.nhapThongtin();
		System.out.println("nhập lớp: ");
		this.lop= sn.nextLine();
		System.out.println("nhập ngành: ");
		this.nganh= sn.nextLine();
		this.truong = new Truong();
		System.out.println("nhập trường: ");
        this.truong.nhapThongtintruong();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.lop+" "+this.nganh+" "+this.truong;
	}
	
       
       
}
