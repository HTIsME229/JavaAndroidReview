package Bai8;

import java.util.Scanner;

class CBGV extends Nguoi {
    private double luongCung237;
    private double thuong237;
    private double phat237;

    public void nhap237(Scanner sc) {
        super.nhap237(sc);
        System.out.print("Nhập lương cứng: ");
        luongCung237 = sc.nextDouble();
        System.out.print("Nhập tiền thưởng: ");
        thuong237 = sc.nextDouble();
        System.out.print("Nhập tiền phạt: ");
        phat237 = sc.nextDouble();
    }

    public double getLuongThucLinh237() {
        return luongCung237 + thuong237 - phat237;
    }

    public void hienThi237() {
        super.hienThi237();
        System.out.println("Lương cứng: " + luongCung237 +
                ", Thưởng: " + thuong237 +
                ", Phạt: " + phat237 +
                ", Lương thực lĩnh: " + getLuongThucLinh237());
    }
}