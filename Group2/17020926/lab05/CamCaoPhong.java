package lab05;

public class CamCaoPhong extends QuaCam {
	public void thongTin(int gia, String ngayNhap, String nguonGoc, int soLuong, String mauSac) {
		this.setMauSac(mauSac);
		this.setGia(gia);
		this.setNgayNhap(ngayNhap);
		this.setNguonGoc(nguonGoc);
		this.setSoLuong(soLuong);
		System.out.println("Thong tin ve cam Cao Phong: ");
		System.out.println("Mau Sac : " + getMauSac());
		System.out.println("Gia ban/kg: " + getGia());
		System.out.println("Nguon goc: " + getNguonGoc());
		System.out.println("Ngay nhap: " + getNgayNhap());
		System.out.println("So luong: " + getSoLuong() + "kg");
	}
}
