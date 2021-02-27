public class NhanVien {
    int maNV;
    String hoTen;
    int tuoi;
    String soDienThoai;
    String email;
    float luongCoBan;

    public NhanVien(int maNV, String hoTen, int tuoi, String soDienThoai, String email, float luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setAge(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void display() {
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Email: " + email);
        System.out.println("Lương: " + tinhLuong());
    }

    public float tinhLuong() {
        return luongCoBan;
    }
}
