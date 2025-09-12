package Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhuPho {
    private List<HoDan> danhSachHoDan237 = new ArrayList<>();
    private Scanner sc237 = new Scanner(System.in);

    // Nhập khu phố
    public void nhapKhuPho237() {
        System.out.print("Nhập số hộ dân: ");
        int n237 = Integer.parseInt(sc237.nextLine());

        for (int i = 0; i < n237; i++) {
            System.out.println("\nNhập thông tin hộ dân thứ " + (i + 1));
            System.out.print("Số nhà: ");
            String soNha237 = sc237.nextLine();
            System.out.print("Số thành viên: ");
            int soTV237 = Integer.parseInt(sc237.nextLine());

            HoDan hoDan237 = new HoDan(soTV237, soNha237);

            for (int j = 0; j < soTV237; j++) {
                System.out.println(">> Thành viên " + (j + 1));
                System.out.print("Họ tên: ");
                String hoTen237 = sc237.nextLine();
                System.out.print("Năm sinh: ");
                int namSinh237 = Integer.parseInt(sc237.nextLine());
                System.out.print("Nghề nghiệp: ");
                String ngheNghiep237 = sc237.nextLine();

                Nguoi ng237 = new Nguoi(hoTen237, namSinh237, ngheNghiep237);
                hoDan237.themNguoi237(ng237);
            }

            danhSachHoDan237.add(hoDan237);
        }
    }

    // Hiển thị tất cả hộ dân
    public void hienThiTatCa237() {
        for (HoDan hoDan237 : danhSachHoDan237) {
            hoDan237.hienThi237();
            System.out.println("---------------------");
        }
    }

    // Hiển thị hộ có người 80 tuổi
    public void hienThiHoCoNguoi80Tuoi237(int namHienTai237) {
        System.out.println("\nCác hộ có người mừng thượng thọ 80 tuổi:");
        for (HoDan hoDan237 : danhSachHoDan237) {
            if (hoDan237.coNguoi80Tuoi237(namHienTai237)) {
                hoDan237.hienThi237();
                System.out.println("---------------------");
            }
        }
    }
}