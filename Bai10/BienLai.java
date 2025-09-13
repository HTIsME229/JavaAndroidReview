package Bai10;

import java.util.Scanner;

class BienLai {
    private KhachHang khachHang237;
    private int chiSoCu237;
    private int chiSoMoi237;

    public void nhap237(Scanner sc) {
        khachHang237 = new KhachHang();
        System.out.println("=== Nhập thông tin khách hàng ===");
        khachHang237.nhap237(sc);

        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu237 = sc.nextInt();
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi237 = sc.nextInt();
    }

    public void hienThi237() {
        khachHang237.hienThi237();
        System.out.println("Chỉ số cũ: " + chiSoCu237 +
                ", Chỉ số mới: " + chiSoMoi237 +
                ", Tiền phải trả: " + tinhTien237() + " VND");
    }

    public int tinhTien237() {
        return (chiSoMoi237 - chiSoCu237) * 750;
    }
}