package Bai2;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc237 = new Scanner(System.in);
        QLCB qlcb237 = new QLCB();

        qlcb237.themCanBo237(new CongNhan("Nguyen Van A", "01/01/1990", "Nam", "Hanoi", "4/7"));
        qlcb237.themCanBo237(new KySu("Tran Thi B", "12/12/1992", "Nữ", "HCM", "CNTT"));
        qlcb237.themCanBo237(new NhanVien("Le Van C", "05/05/1985", "Nam", "Da Nang", "Kế toán"));

        System.out.print("Nhập họ tên cần tìm: ");
        String ten237 = sc237.nextLine();
        CanBo cb237 = qlcb237.timKiemTheoHoTen237(ten237);
        if (cb237 != null) {
            System.out.println("Thông tin cán bộ tìm thấy:");
            cb237.hienThi237();
        } else {
            System.out.println("Không tìm thấy cán bộ.");
        }
    }
}