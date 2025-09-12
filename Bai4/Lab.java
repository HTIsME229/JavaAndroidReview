package Bai4;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        TuyenSinh ql237 = new TuyenSinh();
        Scanner sc237 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập thí sinh");
            System.out.println("2. Hiển thị tất cả thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon237 = Integer.parseInt(sc237.nextLine());

            switch (chon237) {
                case 1:
                    ql237.nhapThiSinh237();
                    break;
                case 2:
                    ql237.hienThiTatCa237();
                    break;
                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String sbd237 = sc237.nextLine();
                    ql237.timKiemTheoSBD237(sbd237);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
