package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TuyenSinh {
    private List<ThiSinh> danhSach237 = new ArrayList<>();
    private Scanner sc237 = new Scanner(System.in);

    // Nhập thông tin thí sinh
    public void nhapThiSinh237() {
        System.out.print("Nhập số báo danh: ");
        String sbd237 = sc237.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen237 = sc237.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi237 = sc237.nextLine();
        System.out.print("Nhập khu vực ưu tiên: ");
        String khuVuc237 = sc237.nextLine();
        System.out.print("Chọn khối (A/B/C): ");
        String khoi237 = sc237.nextLine().toUpperCase();

        ThiSinh ts237 = null;
        switch (khoi237) {
            case "A":
                ts237 = new ThiSinhKhoiA(sbd237, hoTen237, diaChi237, khuVuc237);
                break;
            case "B":
                ts237 = new ThiSinhKhoiB(sbd237, hoTen237, diaChi237, khuVuc237);
                break;
            case "C":
                ts237 = new ThiSinhKhoiC(sbd237, hoTen237, diaChi237, khuVuc237);
                break;
            default:
                System.out.println("Khối không hợp lệ!");
                return;
        }
        danhSach237.add(ts237);
        System.out.println(">> Đã thêm thí sinh thành công!");
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiTatCa237() {
        for (ThiSinh ts237 : danhSach237) {
            ts237.hienThiThongTin237();
            System.out.println("--------------");
        }
    }

    // Tìm kiếm theo số báo danh
    public void timKiemTheoSBD237(String sbd237) {
        for (ThiSinh ts237 : danhSach237) {
            if (ts237.getSoBaoDanh237().equalsIgnoreCase(sbd237)) {
                ts237.hienThiThongTin237();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh với SBD: " + sbd237);
    }
}
