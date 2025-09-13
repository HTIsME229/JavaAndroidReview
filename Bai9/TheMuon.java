package Bai9;

import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon237;
    private String ngayMuon237;
    private String hanTra237;
    private String soHieuSach237;
    private SinhVien sinhVien237;

    public void nhap237(Scanner sc) {
        System.out.print("Nhập số phiếu mượn: ");
        soPhieuMuon237 = sc.nextLine();
        System.out.print("Nhập ngày mượn: ");
        ngayMuon237 = sc.nextLine();
        System.out.print("Nhập hạn trả: ");
        hanTra237 = sc.nextLine();
        System.out.print("Nhập số hiệu sách: ");
        soHieuSach237 = sc.nextLine();

        sinhVien237 = new SinhVien();
        System.out.println("=== Nhập thông tin sinh viên mượn sách ===");
        sinhVien237.nhap237(sc);
    }

    public void hienThi237() {
        System.out.println("Số phiếu mượn: " + soPhieuMuon237 +
                ", Ngày mượn: " + ngayMuon237 +
                ", Hạn trả: " + hanTra237 +
                ", Số hiệu sách: " + soHieuSach237);
        sinhVien237.hienThi237();
    }

    public String getHanTra237() {
        return hanTra237;
    }
}

