
import java.util.ArrayList;

public class BTT7 {

    public static void main(String[] args) {

        ArrayList<Sach_t78> danhSach = new ArrayList<>();

        // Tao sach thu nhat
        Sach_t78 s1 = new Sach_t78();
        s1.maSach = "S01";
        s1.tieuDe = "Lap trinh Java";
        s1.tacGia = "Nguyen Van A";
        s1.namXuatBan = 2024;
        s1.soLuong = 10;

        // Tao sach thu hai
        Sach_t78 s2 = new Sach_t78();
        s2.maSach = "S02";
        s2.tieuDe = "Lap trinh C++";
        s2.tacGia = "Tran Van B";
        s2.namXuatBan = 2023;
        s2.soLuong = 15;

        // Them sach vao danh sach
        danhSach.add(s1);
        danhSach.add(s2);

        // Hien thi danh sach sach
        System.out.println("DANH SACH SACH");

        for (Sach_t78 s : danhSach) {
            s.hienThiThongTin();
        }
    }
}
