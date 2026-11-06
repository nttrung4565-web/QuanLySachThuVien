import java.util.ArrayList;
import java.util.Scanner;

// Khai báo struct đơn giản ở đầu file
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;

    // Constructor rỗng
    public Sach() {}

    // Constructor có tham số
    public Sach(String maSach, String tenSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void hienThi() {
        System.out.println("Mã sách: " + maSach + " | Tên sách: " + tenSach + " | Số lượng: " + soLuong + " | Đơn giá: " + donGia);
    }
}

public class Tuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSach = new ArrayList<>();
        int chon = 0;

        // Menu 8 chức năng dùng do-while theo yêu cầu Bài 4
        do {
            System.out.println("\n========== MENU QUẢN LÝ SÁCH ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Vui lòng chọn chức năng (1-8): ");
            chon = sc.nextInt();
            sc.nextLine(); // Dọn phím Enter tránh trôi lệnh

            switch (chon) {
                case 1:
                    // 1. Thêm sách
                    System.out.println("\n--- THÊM SÁCH MỚI ---");
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();

                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhập số lượng: ");
                    int sl = sc.nextInt();

                    System.out.print("Nhập đơn giá: ");
                    double gia = sc.nextDouble();
                    sc.nextLine(); // Dọn phím Enter sau khi nhập số

                    // Dùng phương thức add() của ArrayList
                    danhSach.add(new Sach(ma, ten, sl, gia));
                    System.out.println("=> Thêm sách thành công!");
                    break;

                case 2:
                    // 2. Hiển thị sách
                    System.out.println("\n--- DANH SÁCH SÁCH ---");
                    if (danhSach.size() == 0) {
                        System.out.println("Danh sách hiện đang trống!");
                    } else {
                        // Duyệt bằng index i và phương thức get()[cite: 10]
                        for (int i = 0; i < danhSach.size(); i++) {
                            danhSach.get(i).hienThi();
                        }
                    }
                    break;

                case 3:
                    // 3. Tìm sách
                    System.out.print("\nNhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).maSach.equalsIgnoreCase(maTim)) {
                            System.out.println("=> Đã tìm thấy:");
                            danhSach.get(i).hienThi();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4:
                    // 4. Xóa sách
                    System.out.print("\nNhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;

                    // Dùng phương thức remove(i) để xóa phần tử[cite: 10]
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (danhSach.get(i).maSach.equalsIgnoreCase(maXoa)) {
                            danhSach.remove(i);
                            System.out.println("=> Đã xóa sách thành công!");
                            daXoa = true;
                            break;
                        }
                    }

                    if (!daXoa) {
                        System.out.println("=> Không tìm thấy sách để xóa.");
                    }
                    break;

                case 5:
                    // 5. Sửa sách
                    System.out.print("\nNhập mã sách cần sửa: ");
                    String maSua = sc.nextLine();
                    boolean daSua = false;

                    for (int i = 0; i < danhSach.size(); i++) {
                        Sach s = danhSach.get(i);
                        if (s.maSach.equalsIgnoreCase(maSua)) {
                            System.out.println("Nhập thông tin mới:");
                            System.out.print("Tên sách mới: ");
                            s.tenSach = sc.nextLine();

                            System.out.print("Số lượng mới: ");
                            s.soLuong = sc.nextInt();

                            System.out.print("Đơn giá mới: ");
                            s.donGia = sc.nextDouble();
                            sc.nextLine(); // Dọn phím Enter

                            System.out.println("=> Đã cập nhật sách thành công!");
                            daSua = true;
                            break;
                        }
                    }

                    if (!daSua) {
                        System.out.println("=> Không tìm thấy sách có mã: " + maSua);
                    }
                    break;

                case 6:
                    // 6. Tính tổng số lượng
                    int tongSL = 0;
                    for (int i = 0; i < danhSach.size(); i++) {
                        tongSL += danhSach.get(i).soLuong;
                    }
                    System.out.println("\n=> Tổng số lượng sách: " + tongSL);
                    break;

                case 7:
                    // 7. Tính tổng giá trị (số lượng * đơn giá)
                    double tongGia = 0;
                    for (int i = 0; i < danhSach.size(); i++) {
                        tongGia += (danhSach.get(i).soLuong * danhSach.get(i).donGia);
                    }
                    System.out.println("\n=> Tổng giá trị sách: " + tongGia);
                    break;

                case 8:
                    // 8. Thoát
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại (1-8)!");
                    break;
            }
        } while (chon != 8);

        sc.close();
    }
}