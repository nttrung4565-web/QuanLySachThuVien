import java.util.Scanner;
public class QuanLySachThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NHẬP DỮ LIỆU BAN ĐẦU
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
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


        // BÀI 1: Kiểm tra tính hợp lệ của dữ liệu
        // - Giá > 0
        // - Số lượng >= 0
        // - Năm xuất bản hợp lệ (<= năm hiện tại và > 0)
        System.out.println("\n=== BÀI 1: KIỂM TRA TÍNH HỢP LỆ ===");
        int namHienTai = 2026;
        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("[-] Đơn giá không hợp lệ (phải > 0).");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("[-] Số lượng không hợp lệ (phải >= 0).");
            hopLe = false;
        }
        if (namXuatBan <= 0 || namXuatBan > namHienTai) {
            System.out.println("[-] Năm xuất bản không hợp lệ (phải > 0 và <= " + namHienTai + ").");
            hopLe = false;
        }

        if (hopLe) {
            System.out.println("[+] Tất cả thông tin sách đều HỢP LỆ.");
        } else {
            System.out.println("[!] Thông tin sách KHÔNG HỢP LỆ.");
        }


        // BÀI 2: Phân loại giá
        // < 50.000 -> Sách giá thấp
        // 50.000 - 100.000 -> Sách giá trung bình
        // 100.000 - 200.000 -> Sách giá cao
        // > 200.000 -> Sách giá đặc biệt
        System.out.println("\n=== BÀI 2: PHÂN LOẠI GIÁ ===");
        String phanLoaiGia = "";
        if (donGia < 50000) {
            phanLoaiGia = "Sách giá thấp";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sách giá trung bình";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sách giá cao";
        } else {
            phanLoaiGia = "Sách giá đặc biệt";
        }
        System.out.println("Mức giá: " + phanLoaiGia);


        // BÀI 3: Phân loại tồn kho
        // 0 -> Hết sách
        // 1 - 5 -> Sắp hết
        // 6 - 20 -> Còn ít
        // > 20 -> Còn nhiều
        System.out.println("\n=== BÀI 3: PHÂN LOẠI TỒN KHO ===");
        String tinhTrangTonKho = "";
        if (soLuong == 0) {
            tinhTrangTonKho = "Hết sách";
        } else if (soLuong >= 1 && soLuong <= 5) {
            tinhTrangTonKho = "Sắp hết";
        } else if (soLuong >= 6 && soLuong <= 20) {
            tinhTrangTonKho = "Còn ít";
        } else {
            tinhTrangTonKho = "Còn nhiều";
        }
        System.out.println("Tình trạng kho: " + tinhTrangTonKho);


        // BÀI 4: Dùng switch-case chọn loại sách
        // 1. Sách giáo khoa
        // 2. Sách tham khảo
        // 3. Sách chuyên ngành
        // 4. Sách khác
        System.out.println("\n=== BÀI 4: CHỌN LOẠI SÁCH ===");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Vui lòng chọn loại sách (1-4): ");
        int luaChon = sc.nextInt();

        String loaiSach = "";
        switch (luaChon) {
            case 1:
                loaiSach = "Sách giáo khoa";
                break;
            case 2:
                loaiSach = "Sách tham khảo";
                break;
            case 3:
                loaiSach = "Sách chuyên ngành";
                break;
            case 4:
                loaiSach = "Sách khác";
                break;
            default:
                loaiSach = "Lựa chọn không hợp lệ";
                break;
        }
        System.out.println("Thể loại sách: " + loaiSach);


        // TỔNG KẾT THÔNG TIN VÀ ĐÁNH GIÁ SÁCH
        System.out.println("\n================================================");
        System.out.println("              BÁO CÁO ĐÁNH GIÁ SÁCH             ");
        System.out.println("================================================");
        System.out.println("Tên sách: " + tenSach + " (" + maSach + ")");
        System.out.println("Thể loại: " + loaiSach);
        System.out.println("Phân khúc giá: " + phanLoaiGia + " (" + donGia + " VNĐ)");
        System.out.println("Trạng thái kho: " + tinhTrangTonKho + " (" + soLuong + " cuốn)");
        System.out.println("Đánh giá hợp lệ: " + (hopLe ? "Đạt chuẩn" : "Cần kiểm tra lại"));
        System.out.println("================================================");

        sc.close();
    }
}