package Bai5;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        KhuPho kp237 = new KhuPho();
        Scanner sc237 = new Scanner(System.in);

        kp237.nhapKhuPho237();
        kp237.hienThiTatCa237();

        System.out.print("Nhập năm hiện tại để kiểm tra thọ 80: ");
        int namHienTai237 = Integer.parseInt(sc237.nextLine());
        kp237.hienThiHoCoNguoi80Tuoi237(namHienTai237);
    }
}