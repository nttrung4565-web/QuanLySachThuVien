
package Baithuchanhtuan9;

public class SachGiaoKhoa extends Sach {
    public String tinhTrang;

    // Ham khoi tao
    public SachGiaoKhoa(String tinhTrang, String maSach,
                        int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.tinhTrang = tinhTrang;
    }

    // Tinh thanh tien
    public double Thanhtien() {
        if (tinhTrang.equalsIgnoreCase("Moi")) {
            return soLuong * donGia;
        } else if (tinhTrang.equalsIgnoreCase("Cu")) {
            return soLuong * donGia * 0.5;
        } else {
            return 0;
        }
    }

    // Ghi de phuong thuc Xuat
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + Thanhtien());
        System.out.println("-----------------------");
    }
}
