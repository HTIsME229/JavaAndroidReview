package Bai2;

class CongNhan extends CanBo {
    private String bac237;

    public CongNhan(String hoTen237, String ngaySinh237, String gioiTinh237, String diaChi237, String bac237) {
        super(hoTen237, ngaySinh237, gioiTinh237, diaChi237);
        this.bac237 = bac237;
    }

    public String getBac237() {
        return bac237;
    }

    public void setBac237(String bac237) {
        this.bac237 = bac237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Bậc: " + bac237);
    }
}


