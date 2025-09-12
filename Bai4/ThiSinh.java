package Bai4;

class ThiSinh {
    protected String soBaoDanh237;
    protected String hoTen237;
    protected String diaChi237;
    protected String khuVuc237;

    public ThiSinh(String soBaoDanh237, String hoTen237, String diaChi237, String khuVuc237) {
        this.soBaoDanh237 = soBaoDanh237;
        this.hoTen237 = hoTen237;
        this.diaChi237 = diaChi237;
        this.khuVuc237 = khuVuc237;
    }

    public String getSoBaoDanh237() {
        return soBaoDanh237;
    }

    public void hienThiThongTin237() {
        System.out.println("SBD: " + soBaoDanh237 +
                ", Họ tên: " + hoTen237 +
                ", Địa chỉ: " + diaChi237 +
                ", Khu vực: " + khuVuc237);
    }
}