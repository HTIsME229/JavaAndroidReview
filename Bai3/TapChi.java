package Bai3;

class TapChi extends TaiLieu {
    private int soPhatHanh237;
    private int thangPhatHanh237;

    public TapChi(String maTaiLieu237, String tenNhaXuatBan237, int soBanPhatHanh237,
                  int soPhatHanh237, int thangPhatHanh237) {
        super(maTaiLieu237, tenNhaXuatBan237, soBanPhatHanh237);
        this.soPhatHanh237 = soPhatHanh237;
        this.thangPhatHanh237 = thangPhatHanh237;
    }

    @Override
    public void hienThi237() {
        super.hienThi237();
        System.out.println("Số phát hành: " + soPhatHanh237);
        System.out.println("Tháng phát hành: " + thangPhatHanh237);
    }
}