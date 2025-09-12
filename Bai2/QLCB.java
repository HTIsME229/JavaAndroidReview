package Bai2;

import java.util.ArrayList;
import java.util.List;

class QLCB {
    private List<CanBo> danhSach237 = new ArrayList<>();

    public void themCanBo237(CanBo cb237) {
        danhSach237.add(cb237);
    }

    public CanBo timKiemTheoHoTen237(String hoTen237) {
        for (CanBo cb237 : danhSach237) {
            if (cb237.getHoTen237().equalsIgnoreCase(hoTen237)) {
                return cb237;
            }
        }
        return null;
    }

    public void hienThiTatCa237() {
        for (CanBo cb237 : danhSach237) {
            cb237.hienThi237();
            System.out.println("------------------");
        }
    }
}