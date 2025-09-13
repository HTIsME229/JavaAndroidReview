package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng hộ sử dụng điện: ");
        int n237 = sc.nextInt();

        ArrayList<BienLai> dsBienLai237 = new ArrayList<>();

        for (int i = 0; i < n237; i++) {
            System.out.println("\n--- Nhập thông tin biên lai thứ " + (i + 1) + " ---");
            BienLai bl237 = new BienLai();
            bl237.nhap237(sc);
            dsBienLai237.add(bl237);
        }

        System.out.println("\n=== Danh sách biên lai ===");
        for (BienLai bl237 : dsBienLai237) {
            bl237.hienThi237();
        }

        sc.close();
    }
}
