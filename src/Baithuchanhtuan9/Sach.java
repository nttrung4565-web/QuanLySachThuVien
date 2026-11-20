
package Baithuchanhtuan9;

public class Sach {
    public String maSach;
    public String ngayNhap;
    public double donGia;
    public int soLuong;
    public String nhaXuatBan;

    // Ham khoi tao
    public Sach(String maSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // Xuat thong tin chung
    public void Xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }
}
