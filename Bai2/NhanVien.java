package Bai2;

class NhanVien extends CanBo {
    private String congViec237;

    public NhanVien(String hoTen237, String ngaySinh237, String gioiTinh237, String diaChi237, String congViec237) {
        super(hoTen237, ngaySinh237, gioiTinh237, diaChi237);
        this.congViec237 = congViec237;
    }

    public String getCongViec237() {
        return congViec237;
    }

    public void setCongViec237(String congViec237) {
        this.congViec237 = congViec237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Công việc: " + congViec237);
    }
}