package Bai5;

import java.util.ArrayList;
import java.util.List;

class HoDan {
    private int soThanhVien237;
    private String soNha237;
    private List<Nguoi> danhSachNguoi237 = new ArrayList<>();

    public HoDan(int soThanhVien237, String soNha237) {
        this.soThanhVien237 = soThanhVien237;
        this.soNha237 = soNha237;
    }

    public void themNguoi237(Nguoi n237) {
        danhSachNguoi237.add(n237);
    }

    public void hienThi237() {
        System.out.println("Số nhà: " + soNha237 + ", Số thành viên: " + soThanhVien237);
        for (Nguoi n237 : danhSachNguoi237) {
            n237.hienThi237();
        }
    }

    // Kiểm tra có người 80 tuổi
    public boolean coNguoi80Tuoi237(int namHienTai237) {
        for (Nguoi n237 : danhSachNguoi237) {
            int tuoi237 = namHienTai237 - n237.getNamSinh237();
            if (tuoi237 == 80) {
                return true;
            }
        }
        return false;
    }
}
