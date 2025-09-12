package Bai5;

class Nguoi {
    private String hoTen237;
    private int namSinh237;
    private String ngheNghiep237;

    public Nguoi(String hoTen237, int namSinh237, String ngheNghiep237) {
        this.hoTen237 = hoTen237;
        this.namSinh237 = namSinh237;
        this.ngheNghiep237 = ngheNghiep237;
    }

    public int getNamSinh237() {
        return namSinh237;
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237 +
                ", Năm sinh: " + namSinh237 +
                ", Nghề nghiệp: " + ngheNghiep237);
    }
}