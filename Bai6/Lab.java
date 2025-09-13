package Bai6;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        KhachSan ks237 = new KhachSan();
        Scanner sc237 = new Scanner(System.in);

        ks237.nhapKhachTro237();
        ks237.hienThiTatCa237();

        System.out.print("\nNhập CMND để tính tiền: ");
        String cmnd237 = sc237.nextLine();
        ks237.tinhTienTheoCMND237(cmnd237);

        System.out.print("\nNhập CMND để xóa khách trọ: ");
        String cmndXoa237 = sc237.nextLine();
        ks237.xoaKhachTro237(cmndXoa237);

        System.out.println("\nDanh sách khách trọ sau khi xóa:");
        ks237.hienThiTatCa237();
    }
}