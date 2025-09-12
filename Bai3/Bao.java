package Bai3;

class Bao extends TaiLieu {
    private String ngayPhatHanh237;

    public Bao(String maTaiLieu237, String tenNhaXuatBan237, int soBanPhatHanh237,
               String ngayPhatHanh237) {
        super(maTaiLieu237, tenNhaXuatBan237, soBanPhatHanh237);
        this.ngayPhatHanh237 = ngayPhatHanh237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Ngày phát hành: " + ngayPhatHanh237);
    }
}