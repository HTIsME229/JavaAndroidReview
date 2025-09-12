package Bai3;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc237 = new Scanner(System.in);
        QuanLySach ql237 = new QuanLySach();

        ql237.themTaiLieu237(new Sach("S001", "NXB Giáo dục",
                100, "Nguyen Van A", 250));

        ql237.themTaiLieu237(new Sach("S002", "NXB Giáo dục",
                120, "Nguyen Van B", 350));
        ql237.themTaiLieu237(new TapChi("T001", "NXB Khoa học",
                200, 5, 8));
        ql237.themTaiLieu237(new Bao("B001", "NXB Thanh Niên",
                300, "12/09/2025"));

        System.out.println("Tìm kiếm theo loại (Sach/Bao/TapChi): ");
        String loai237 = sc237.nextLine();
        ql237.timKiemTheoLoai237(loai237);

        System.out.println("Tìm kiếm theo mã tài liệu: ");
        String ma237 = sc237.nextLine();
        ql237.timKiemTheoMa237(ma237);
    }
}