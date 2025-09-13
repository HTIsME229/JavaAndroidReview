package Bai7;

class HSHocSinh {
    private Nguoi thongTin237;
    private String lop237;
    private String khoaHoc237;
    private String kyHoc237;

    public HSHocSinh(Nguoi thongTin237, String lop237, String khoaHoc237, String kyHoc237) {
        this.thongTin237 = thongTin237;
        this.lop237 = lop237;
        this.khoaHoc237 = khoaHoc237;
        this.kyHoc237 = kyHoc237;
    }

    public String getLop237() {
        return lop237;
    }

    public Nguoi getThongTin237() {
        return thongTin237;
    }

    public void hienThi237() {
        thongTin237.hienThi237();
        System.out.println("Lớp: " + lop237 +
                ", Khóa học: " + khoaHoc237 +
                ", Kỳ học: " + kyHoc237);
    }
}
