
import java.util.Scanner;

public class QuanLySach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double donGia;
    protected int soLuong;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();

        while (true) {
            System.out.print("Nhập năm xuất bản: ");
            namXuatBan = sc.nextInt();

            if (namXuatBan > 0 && namXuatBan < 2026) {
                break;
            } else {
                System.out.println(
                        "Lỗi: Năm xuất bản phải lớn hơn 0 và nhỏ hơn 2026. Vui lòng nhập lại!");
            }
        }

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();

        System.out.println();
    }

    public void HienThiVaTinhToan() {
        System.out.println("===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia + " VNĐ");
        System.out.println("Số lượng: " + soLuong);

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== TÍNH TOÁN =====");
        System.out.println("Thành tiền: " + thanhTien + " VNĐ");
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen + " VNĐ");
        System.out.println("Tổng tiền nhập: " + tongTienNhap + " VNĐ");

        // Bài 2: Phân loại giá
        System.out.print("\nPhân loại giá: ");

        if (donGia < 50000) {
            System.out.println("Sách giá thấp");
        } else if (donGia <= 100000) {
            System.out.println("Sách giá trung bình");
        } else if (donGia <= 200000) {
            System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }

        // Bài 3: Phân loại tồn kho
        System.out.print("Phân loại tồn kho: ");

        if (soLuong == 0) {
            System.out.println("Hết sách");
        } else if (soLuong <= 5) {
            System.out.println("Sắp hết");
        } else if (soLuong <= 20) {
            System.out.println("Còn ít");
        } else {
            System.out.println("Còn nhiều");
        }

        // Bài 4: Dùng switch chọn loại sách
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== CHỌN LOẠI SÁCH =====");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn của bạn (1-4): ");

        int chon = sc.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Loại sách: Sách giáo khoa");
                break;

            case 2:
                System.out.println("Loại sách: Sách tham khảo");
                break;

            case 3:
                System.out.println("Loại sách: Sách chuyên ngành");
                break;

            case 4:
                System.out.println("Loại sách: Sách khác");
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }

    public static void main(String[] args) {
        QuanLySach sach = new QuanLySach();

        sach.nhapThongTin();
        sach.HienThiVaTinhToan();
    }
}
