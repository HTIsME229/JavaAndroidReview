package Bai6;

class Nguoi {
    private String hoTen237;
    private String ngaySinh237;
    private String soCMND237;

    public Nguoi(String hoTen237, String ngaySinh237, String soCMND237) {
        this.hoTen237 = hoTen237;
        this.ngaySinh237 = ngaySinh237;
        this.soCMND237 = soCMND237;
    }

    public String getSoCMND237() {
        return soCMND237;
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237 +
                ", Ngày sinh: " + ngaySinh237 +
                ", Số CMND: " + soCMND237);
    }
}