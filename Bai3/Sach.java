package Bai3;

class Sach extends TaiLieu {
    private String tenTacGia237;
    private int soTrang237;

    public Sach(String maTaiLieu237, String tenNhaXuatBan237, int soBanPhatHanh237,
                String tenTacGia237, int soTrang237) {
        super(maTaiLieu237, tenNhaXuatBan237, soBanPhatHanh237);
        this.tenTacGia237 = tenTacGia237;
        this.soTrang237 = soTrang237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Tác giả: " + tenTacGia237);
        System.out.println("Số trang: " + soTrang237);
    }
}