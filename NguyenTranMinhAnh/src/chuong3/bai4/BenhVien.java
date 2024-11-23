package chuong3.bai4;

public class BenhVien {
	private String tenBv;
    private String diaChi;
    private String giamDoc;
    public BenhVien() {
    }
    
      public BenhVien(String tenBv, String diaChi, String giamDoc) {
		this.tenBv = tenBv;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	public String getTenBv() {
		return tenBv;
	}

	public void setTenBV(String tenBv) {
		this.tenBv = tenBv;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	public String toString() {
		return this.tenBv+" "+this.diaChi+" "+this.giamDoc;
	}
}
