package Bai7;

class Nguoi {
    private String hoTen237;
    private String ngaySinh237;
    private String queQuan237;

    public Nguoi(String hoTen237, String ngaySinh237, String queQuan237) {
        this.hoTen237 = hoTen237;
        this.ngaySinh237 = ngaySinh237;
        this.queQuan237 = queQuan237;
    }

    public String getNgaySinh237() {
        return ngaySinh237;
    }

    public String getQueQuan237() {
        return queQuan237;
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237 +
                ", Ngày sinh: " + ngaySinh237 +
                ", Quê quán: " + queQuan237);
    }
}
