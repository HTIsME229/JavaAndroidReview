package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng cán bộ giáo viên: ");
        int n237 = sc.nextInt();

        ArrayList<CBGV> dsCBGV237 = new ArrayList<>();

        for (int i = 0; i < n237; i++) {
            System.out.println("\n--- Nhập thông tin cán bộ giáo viên thứ " + (i + 1) + " ---");
            CBGV cb237 = new CBGV();
            cb237.nhap237(sc);
            dsCBGV237.add(cb237);
        }

        System.out.println("\n=== Danh sách cán bộ giáo viên ===");
        for (CBGV cb237 : dsCBGV237) {
            cb237.hienThi237();
        }

        System.out.println("\n=== Danh sách cán bộ có lương thực lĩnh >= 8 triệu ===");
        for (CBGV cb237 : dsCBGV237) {
            if (cb237.getLuongThucLinh237() >= 8000000) {
                cb237.hienThi237();
            }
        }

        sc.close();
    }
}