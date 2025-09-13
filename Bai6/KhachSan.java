package Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachSan {
    private List<KhachTro> danhSach237 = new ArrayList<>();
    private Scanner sc237 = new Scanner(System.in);

    // Nhập danh sách khách trọ
    public void nhapKhachTro237() {
        System.out.print("Nhập số khách trọ: ");
        int n237 = Integer.parseInt(sc237.nextLine());

        for (int i = 0; i < n237; i++) {
            System.out.println("\nNhập thông tin khách trọ thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen237 = sc237.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh237 = sc237.nextLine();
            System.out.print("Số CMND: ");
            String soCMND237 = sc237.nextLine();

            Nguoi nguoi237 = new Nguoi(hoTen237, ngaySinh237, soCMND237);

            System.out.print("Số ngày trọ: ");
            int soNgay237 = Integer.parseInt(sc237.nextLine());
            System.out.print("Loại phòng: ");
            String loaiPhong237 = sc237.nextLine();
            System.out.print("Giá phòng/ngày: ");
            double gia237 = Double.parseDouble(sc237.nextLine());

            KhachTro kt237 = new KhachTro(nguoi237, soNgay237, loaiPhong237, gia237);
            danhSach237.add(kt237);
        }
    }

    // Hiển thị toàn bộ khách trọ
    public void hienThiTatCa237() {
        System.out.println("\nDanh sách khách trọ:");
        for (KhachTro kt237 : danhSach237) {
            kt237.hienThi237();
            System.out.println("---------------------");
        }
    }

    // Xóa khách trọ theo CMND
    public void xoaKhachTro237(String cmnd237) {
        danhSach237.removeIf(khach -> khach.getSoCMND237().equals(cmnd237));
    }

    // Tính tiền theo CMND
    public void tinhTienTheoCMND237(String cmnd237) {
        for (KhachTro kt237 : danhSach237) {
            if (kt237.getSoCMND237().equals(cmnd237)) {
                System.out.println("Khách có CMND " + cmnd237 + " cần trả: " + kt237.tinhTien237());
                return;
            }
        }
        System.out.println("Không tìm thấy khách có CMND: " + cmnd237);
    }
}
