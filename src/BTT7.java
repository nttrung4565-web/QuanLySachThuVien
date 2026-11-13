
import java.util.ArrayList;

public class BTT7 {

    public static void main(String[] args) {

        ArrayList<Sach_t78> danhSach = new ArrayList<>();

        // Khoi tao khong doi
        Sach_t78 s1 = new Sach_t78();
        s1.setMaSach("S01");
        s1.setTieuDe("Lap trinh Java");
        s1.setTacGia("Nguyen Van A");
        s1.setNamXuatBan(2024);
        s1.setSoLuong(10);

        // Khoi tao co doi
        Sach_t78 s2 = new Sach_t78("S02", "Lap trinh C++",
                                  "Tran Van B", 2023, 15);

        // Them sach vao ArrayList
        danhSach.add(s1);
        danhSach.add(s2);

        // Hien thi danh sach
        System.out.println("DANH SACH SACH");

        for (Sach_t78 s : danhSach) {
            s.hienThiThongTin();
        }
    }
}
