public class LapTrinhVien extends NhanVien {
    float gioLamthem;

    public LapTrinhVien(int maNV, String hoTen, int tuoi, String soDienThoai, String email, float luongCoBan,
            float gioLamthem) {
        super(maNV, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.gioLamthem = gioLamthem;
    }

    @Override
    public float tinhLuong() {
        super.tinhLuong();
        return (luongCoBan + gioLamthem * 200000);
    }

}