package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng thẻ mượn: ");
        int n237 = Integer.parseInt(sc.nextLine());

        ArrayList<TheMuon> dsTheMuon237 = new ArrayList<>();

        for (int i = 0; i < n237; i++) {
            System.out.println("\n--- Nhập thông tin thẻ mượn thứ " + (i + 1) + " ---");
            TheMuon tm237 = new TheMuon();
            tm237.nhap237(sc);
            dsTheMuon237.add(tm237);
        }

        System.out.println("\n=== Danh sách thẻ mượn ===");
        for (TheMuon tm237 : dsTheMuon237) {
            tm237.hienThi237();
        }

        System.out.println("\n=== Danh sách thẻ mượn cần trả vào ngày cuối tháng ===");
        for (TheMuon tm237 : dsTheMuon237) {
            if (tm237.getHanTra237().endsWith("30") || tm237.getHanTra237().endsWith("31")) {
                tm237.hienThi237();
            }
        }

        sc.close();
    }
}