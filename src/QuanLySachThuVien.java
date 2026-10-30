
import java.util.Scanner;
public class QuanLySachThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BÀI 1: Nhập thông tin sách từ bàn phím
        System.out.println("=== BÀI 1: NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Hiển thị lại thông tin sách đã nhập (Bài 1)
        System.out.println("\n--- THÔNG TIN SÁCH ĐÃ NHẬP ---");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);


        // BÀI 2: Tính thành tiền = đơn giá * số lượng
        double thanhTien = donGia * soLuong;
        System.out.println("\n=== BÀI 2: TÍNH THÀNH TIỀN ===");
        System.out.println("Thành tiền: " + thanhTien + " VNĐ");


        // BÀI 3: Tính phí vận chuyển = 5% giá trị sách
        double phiVanChuyen = 0.05 * thanhTien;
        System.out.println("\n=== BÀI 3: PHÍ VẬN CHUYỂN ===");
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen + " VNĐ");


        // BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển

        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("\n=== BÀI 4: TỔNG TIỀN NHẬP KHO ===");
        System.out.println("Tổng tiền nhập: " + tongTienNhap + " VNĐ");


        // Bảng tổng hợp phiếu nhập kho
        System.out.println("\n================================================");
        System.out.println("           KẾT QUẢ TỔNG HỢP NHẬP KHO            ");
        System.out.println("================================================");
        System.out.println("Sách: " + tenSach + " (" + maSach + ")");
        System.out.println("Số lượng: " + soLuong + " x Đơn giá: " + donGia);
        System.out.println("Thành tiền: " + thanhTien + " VNĐ");
        System.out.println("Phí vận chuyển: " + phiVanChuyen + " VNĐ");
        System.out.println("------------------------------------------------");
        System.out.println("TỔNG CỘNG: " + tongTienNhap + " VNĐ");
        System.out.println("================================================");

        sc.close();
    }
}