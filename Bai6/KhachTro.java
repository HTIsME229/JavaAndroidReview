package Bai6;

class KhachTro {
    private Nguoi thongTin237;
    private int soNgayTro237;
    private String loaiPhong237;
    private double giaPhong237;

    public KhachTro(Nguoi thongTin237, int soNgayTro237, String loaiPhong237, double giaPhong237) {
        this.thongTin237 = thongTin237;
        this.soNgayTro237 = soNgayTro237;
        this.loaiPhong237 = loaiPhong237;
        this.giaPhong237 = giaPhong237;
    }

    public String getSoCMND237() {
        return thongTin237.getSoCMND237();
    }

    public double tinhTien237() {
        return soNgayTro237 * giaPhong237;
    }

    public void hienThi237() {
        thongTin237.hienThi237();
        System.out.println("Số ngày trọ: " + soNgayTro237 +
                ", Loại phòng: " + loaiPhong237 +
                ", Giá phòng/ngày: " + giaPhong237);
    }
}
