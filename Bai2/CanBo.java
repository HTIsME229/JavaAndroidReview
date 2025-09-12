package Bai2;

class CanBo {
    private String hoTen237;
    private String ngaySinh237;
    private String gioiTinh237;
    private String diaChi237;

    public CanBo() {}

    public CanBo(String hoTen237, String ngaySinh237, String gioiTinh237, String diaChi237) {
        this.hoTen237 = hoTen237;
        this.ngaySinh237 = ngaySinh237;
        this.gioiTinh237 = gioiTinh237;
        this.diaChi237 = diaChi237;
    }

    public String getHoTen237() {
        return hoTen237;
    }

    public void setHoTen237(String hoTen237) {
        this.hoTen237 = hoTen237;
    }

    public String getNgaySinh237() {
        return ngaySinh237;
    }

    public void setNgaySinh237(String ngaySinh237) {
        this.ngaySinh237 = ngaySinh237;
    }

    public String getGioiTinh237() {
        return gioiTinh237;
    }

    public void setGioiTinh237(String gioiTinh237) {
        this.gioiTinh237 = gioiTinh237;
    }

    public String getDiaChi237() {
        return diaChi237;
    }

    public void setDiaChi237(String diaChi237) {
        this.diaChi237 = diaChi237;
    }

    public void hienThi237() {
        System.out.println("Họ tên: " + hoTen237);
        System.out.println("Ngày sinh: " + ngaySinh237);
        System.out.println("Giới tính: " + gioiTinh237);
        System.out.println("Địa chỉ: " + diaChi237);
    }
}