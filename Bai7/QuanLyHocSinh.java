package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyHocSinh {
    private List<HSHocSinh> danhSach237 = new ArrayList<>();
    private Scanner sc237 = new Scanner(System.in);

    // Nhập danh sách học sinh
    public void nhapHocSinh237() {
        System.out.print("Nhập số học sinh: ");
        int n237 = Integer.parseInt(sc237.nextLine());

        for (int i = 0; i < n237; i++) {
            System.out.println("\nNhập thông tin học sinh thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen237 = sc237.nextLine();
            System.out.print("Ngày sinh (yyyy): ");
            String ngaySinh237 = sc237.nextLine();
            System.out.print("Quê quán: ");
            String queQuan237 = sc237.nextLine();

            Nguoi n237Obj = new Nguoi(hoTen237, ngaySinh237, queQuan237);

            System.out.print("Lớp: ");
            String lop237 = sc237.nextLine();
            System.out.print("Khóa học: ");
            String khoaHoc237 = sc237.nextLine();
            System.out.print("Kỳ học: ");
            String kyHoc237 = sc237.nextLine();

            HSHocSinh hs237 = new HSHocSinh(n237Obj, lop237, khoaHoc237, kyHoc237);
            danhSach237.add(hs237);
        }
    }

    // Hiển thị tất cả học sinh
    public void hienThiTatCa237() {
        for (HSHocSinh hs237 : danhSach237) {
            hs237.hienThi237();
            System.out.println("---------------------");
        }
    }

    // Hiển thị học sinh sinh năm 1985 và quê Thái Nguyên
    public void hienThi1985ThaiNguyen237() {
        System.out.println("\nDanh sách học sinh sinh năm 1985 và quê ở Thái Nguyên:");
        for (HSHocSinh hs237 : danhSach237) {
            if (hs237.getThongTin237().getNgaySinh237().contains("1985") &&
                    hs237.getThongTin237().getQueQuan237().equalsIgnoreCase("Thái Nguyên")) {
                hs237.hienThi237();
                System.out.println("---------------------");
            }
        }
    }

    // Hiển thị học sinh lớp 10A1
    public void hienThiLop10A1237() {
        System.out.println("\nDanh sách học sinh lớp 10A1:");
        for (HSHocSinh hs237 : danhSach237) {
            if (hs237.getLop237().equalsIgnoreCase("10A1")) {
                hs237.hienThi237();
                System.out.println("---------------------");
            }
        }
    }
}