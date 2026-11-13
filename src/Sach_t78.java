
import java.time.Year;

public class Sach_t78 {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Get va Set
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int namHienTai = Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le!");
        }
    }

    // Khoi tao khong doi
    public Sach_t78() {

    }

    // Khoi tao co doi
    public Sach_t78(String maSach, String tieuDe, String tacGia,
                    int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Phuong thuc hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("----------------------");
    }
}
