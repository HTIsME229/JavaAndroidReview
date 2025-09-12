package Bai4;

class ThiSinhKhoiB extends ThiSinh {
    private String monThi237 = "Toán, Hóa, Sinh";

    public ThiSinhKhoiB(String soBaoDanh237, String hoTen237, String diaChi237, String khuVuc237) {
        super(soBaoDanh237, hoTen237, diaChi237, khuVuc237);
    }

    @Override
    public void hienThiThongTin237() {
        super.hienThiThongTin237();
        System.out.println("Khối thi: B (" + monThi237 + ")");
    }
}