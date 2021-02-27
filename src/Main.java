import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập số nhân viên!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            System.out.println("Nhập mã nhân viên: ");
            int maNV = sc.nextInt();
            System.out.println("Nhập họ tên: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int tuoi = sc.nextInt();
            System.out.println("Nhập số điện thoại: ");
            String soDienThoai = sc.nextLine();
            System.out.println("Nhập email: ");
            String email = sc.nextLine();
            System.out.println("Nhập lương cơ bản: ");
            float luongCoBan = sc.nextFloat();
            System.out.println("Là Lập trình viên hay Kiểm chứng viên(LTV nhập 1, KCV nhập 2): ");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println("Nhập số giờ làm thêm: ");
                float gioLamthem = sc.nextFloat();
                LapTrinhVien ltv = new LapTrinhVien(maNV, hoTen, tuoi, soDienThoai, email, luongCoBan, gioLamthem);
                ltv.display();
            } else if (check == 2) {
                System.out.println("Nhập số lỗi đã phát hiện: ");
                int soLoiPhatHien = sc.nextInt();
                KiemChungVien kcv = new KiemChungVien(maNV, hoTen, tuoi, soDienThoai, email, luongCoBan, soLoiPhatHien);
                kcv.display();
            } else {
                System.out.println("Hiện tại hệ thống chỉ hỗ trợ lập trình viên và kiểm chứng viên!");
            }
        }
        sc.close();
    }
}
