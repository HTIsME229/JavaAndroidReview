package Bai3;

import java.util.ArrayList;
import java.util.List;

class QuanLySach {
    private List<TaiLieu> danhSach237 = new ArrayList<>();

    public void themTaiLieu237(TaiLieu tl237) {
        danhSach237.add(tl237);
    }

    public void timKiemTheoLoai237(String loai237) {

        for (TaiLieu tl237 : danhSach237) {
            if (loai237.equalsIgnoreCase("Sach") && tl237 instanceof Sach) {
                tl237.hienThi237();
                System.out.println("===============//===============");
            } else if (loai237.equalsIgnoreCase("TapChi") && tl237 instanceof TapChi) {
                tl237.hienThi237();
                System.out.println("===============//===============");
            } else if (loai237.equalsIgnoreCase("Bao") && tl237 instanceof Bao) {
                tl237.hienThi237();
                System.out.println("===============//===============");
            }
        }
    }

    public void timKiemTheoMa237(String ma237) {
        TaiLieu result = danhSach237.stream().filter( s -> s.getMaTaiLieu237().equalsIgnoreCase(ma237)).findFirst().orElse(null);
        if (result != null) {
            result.hienThi237();
            System.out.println("===============//===============");
        }
               else
                   System.out.println("Khong tim thay");
    }

    public void hienThiTatCa237() {
        for (TaiLieu tl237 : danhSach237) {
            tl237.hienThi237();
            System.out.println("===============//===============");
        }
    }
}

