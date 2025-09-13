package Bai10;

import java.util.Scanner;

class KhachHang {
    protected String hoTenChuHo237;
    protected String soNha237;
    protected String maCongTo237;

    public void nhap237(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTenChuHo237 = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha237 = sc.nextLine();
        System.out.print("Nhập mã công tơ: ");
        maCongTo237 = sc.nextLine();
    }

    public void hienThi237() {
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo237 +
                ", Số nhà: " + soNha237 +
                ", Mã công tơ: " + maCongTo237);
    }
}
