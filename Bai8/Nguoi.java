package Bai8;


import java.util.Scanner;
class Nguoi {
    protected String hoTen237;
    protected String ngaySinh237;
    protected String queQuan237;

    public void nhap237(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập họ tên: ");
        hoTen237 = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh237 = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan237 = sc.nextLine();
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237 + ", Ngày sinh: " + ngaySinh237 + ", Quê quán: " + queQuan237);
    }
}
