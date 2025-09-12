package Bai3;

class TaiLieu {
    private String maTaiLieu237;
    private String tenNhaXuatBan237;
    private int soBanPhatHanh237;

    public TaiLieu(String maTaiLieu237, String tenNhaXuatBan237, int soBanPhatHanh237) {
        this.maTaiLieu237 = maTaiLieu237;
        this.tenNhaXuatBan237 = tenNhaXuatBan237;
        this.soBanPhatHanh237 = soBanPhatHanh237;
    }

    public String getMaTaiLieu237() {
        return maTaiLieu237;
    }

    public void setMaTaiLieu237(String maTaiLieu237) {
        this.maTaiLieu237 = maTaiLieu237;
    }

    public String getTenNhaXuatBan237() {
        return tenNhaXuatBan237;
    }

    public void setTenNhaXuatBan237(String tenNhaXuatBan237) {
        this.tenNhaXuatBan237 = tenNhaXuatBan237;
    }

    public int getSoBanPhatHanh237() {
        return soBanPhatHanh237;
    }

    public void setSoBanPhatHanh237(int soBanPhatHanh237) {
        this.soBanPhatHanh237 = soBanPhatHanh237;
    }

    public void hienThi237() {
        System.out.println("Mã tài liệu: " + maTaiLieu237);
        System.out.println("Nhà xuất bản: " + tenNhaXuatBan237);
        System.out.println("Số bản phát hành: " + soBanPhatHanh237);

    }
}