
package Baithuchanhtuan9;

public class SachThamKhao extends Sach {
    public double thue;

    // Ham khoi tao
    public SachThamKhao(double thue, String maSach,
                        int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.thue = thue;
    }

    // Tinh thanh tien
    public double Thanhtien() {
        return soLuong * donGia + thue;
    }

    // Ghi de phuong thuc Xuat
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + Thanhtien());
        System.out.println("----------------------");
    }
}
