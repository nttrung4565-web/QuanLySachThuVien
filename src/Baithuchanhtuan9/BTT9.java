
package Baithuchanhtuan9;

import java.util.Scanner;

public class BTT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. NHAP DANH SACH SACH GIAO KHOA
        System.out.print("Nhap so sach giao khoa: ");
        int n = sc.nextInt();
        sc.nextLine();

        SachGiaoKhoa[] sgk = new SachGiaoKhoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap SGK thu " + (i + 1));

            System.out.print("Ma sach: ");
            String ma = sc.nextLine();

            System.out.print("Ngay nhap (dd/mm/yyyy): ");
            String ngay = sc.nextLine();

            System.out.print("Don gia: ");
            double gia = sc.nextDouble();

            System.out.print("So luong: ");
            int sl = sc.nextInt();
            sc.nextLine();

            System.out.print("Nha xuat ban: ");
            String nxb = sc.nextLine().trim();

            // Kiem tra tinh trang sach
            String tt;
            do {
                System.out.print("Tinh trang (Moi/Cu): ");
                tt = sc.nextLine().trim();

                if (!tt.equalsIgnoreCase("Moi")
                        && !tt.equalsIgnoreCase("Cu")) {
                    System.out.println("Vui long nhap Moi hoac Cu!");
                }

            } while (!tt.equalsIgnoreCase("Moi")
                    && !tt.equalsIgnoreCase("Cu"));

            sgk[i] = new SachGiaoKhoa(tt, ma, sl, gia);
            sgk[i].ngayNhap = ngay;
            sgk[i].nhaXuatBan = nxb;
        }

        // 2. NHAP DANH SACH SACH THAM KHAO
        System.out.print("\nNhap so sach tham khao: ");
        int m = sc.nextInt();
        sc.nextLine();

        SachThamKhao[] stk = new SachThamKhao[m];

        for (int i = 0; i < m; i++) {
            System.out.println("\nNhap STK thu " + (i + 1));

            System.out.print("Ma sach: ");
            String ma = sc.nextLine();

            System.out.print("Ngay nhap (dd/mm/yyyy): ");
            String ngay = sc.nextLine();

            System.out.print("Don gia: ");
            double gia = sc.nextDouble();

            System.out.print("So luong: ");
            int sl = sc.nextInt();

            System.out.print("Thue: ");
            double thue = sc.nextDouble();
            sc.nextLine();

            System.out.print("Nha xuat ban: ");
            String nxb = sc.nextLine().trim();

            stk[i] = new SachThamKhao(thue, ma, sl, gia);
            stk[i].ngayNhap = ngay;
            stk[i].nhaXuatBan = nxb;
        }

        // 3. XUAT DANH SACH VA TINH TONG TIEN
        double tongSGK = 0;
        double tongSTK = 0;
        double tongDonGia = 0;

        System.out.println("\n===== SACH GIAO KHOA =====");

        for (int i = 0; i < n; i++) {
            sgk[i].Xuat();
            tongSGK += sgk[i].Thanhtien();
        }

        System.out.println("\n===== SACH THAM KHAO =====");

        for (int i = 0; i < m; i++) {
            stk[i].Xuat();
            tongSTK += stk[i].Thanhtien();
            tongDonGia += stk[i].donGia;
        }

        // 4. TONG THANH TIEN TUNG LOAI
        System.out.println("\n===== THONG KE =====");
        System.out.println("Tong tien SGK: " + tongSGK);
        System.out.println("Tong tien STK: " + tongSTK);

        // 5. TRUNG BINH CONG DON GIA SACH THAM KHAO
        if (m > 0) {
            double trungBinh = tongDonGia / m;
            System.out.println("Trung binh don gia STK: " + trungBinh);
        } else {
            System.out.println("Khong co sach tham khao.");
        }

        // 6. XUAT SACH GIAO KHOA CUA NHA XUAT BAN X
        System.out.print("\nNhap nha xuat ban can tim: ");
        String x = sc.nextLine().trim();

        boolean timThay = false;

        System.out.println("\n===== SGK CUA NXB " + x + " =====");

        for (int i = 0; i < n; i++) {
            if (sgk[i].nhaXuatBan.equalsIgnoreCase(x)) {
                sgk[i].Xuat();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }

        sc.close();
    }
}
