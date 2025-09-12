package Bai2;

class KySu extends CanBo {
    private String nganhDaoTao237;

    public KySu(String hoTen237, String ngaySinh237, String gioiTinh237, String diaChi237, String nganhDaoTao237) {
        super(hoTen237, ngaySinh237, gioiTinh237, diaChi237);
        this.nganhDaoTao237 = nganhDaoTao237;
    }

    public String getNganhDaoTao237() {
        return nganhDaoTao237;
    }

    public void setNganhDaoTao237(String nganhDaoTao237) {
        this.nganhDaoTao237 = nganhDaoTao237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Ngành đào tạo: " + nganhDaoTao237);
    }
}