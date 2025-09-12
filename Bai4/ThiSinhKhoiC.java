package Bai4;

class ThiSinhKhoiC extends ThiSinh {
    private String monThi237 = "Văn, Sử, Địa";

    public ThiSinhKhoiC(String soBaoDanh237, String hoTen237, String diaChi237, String khuVuc237) {
        super(soBaoDanh237, hoTen237, diaChi237, khuVuc237);
    }

    @Override
    public void hienThiThongTin237() {
        super.hienThiThongTin237();
        System.out.println("Khối thi: C (" + monThi237 + ")");
    }
}