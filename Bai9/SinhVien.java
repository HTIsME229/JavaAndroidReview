package Bai9;

import java.util.Scanner;

class SinhVien {
    protected String hoTen237;
    protected String msv237;
    protected String ngaySinh237;
    protected String lop237;

    public void nhap237(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập họ tên sinh viên: ");
        hoTen237 = sc.nextLine();
        System.out.print("Nhập mã số sinh viên: ");
        msv237 = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh237 = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop237 = sc.nextLine();
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237 +
                ", MSV: " + msv237 +
                ", Ngày sinh: " + ngaySinh237 +
                ", Lớp: " + lop237);
    }
}