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
            System.out.print("Nhập năm xuất bản : ");
            namXuatBan = sc.nextInt();
            if (namXuatBan > 0 && namXuatBan < 2026) {
                break; 
            } else {
                System.out.println("Lỗi: Năm xuất bản phải lớn hơn 0 và nhỏ hơn năm hiện tại (2026). Vui lòng nhập lại!");
            }
        }
        
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }
    public void HienThiVaTinhToan() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia + " VNĐ");
        System.out.println("Số lượng: " + soLuong);
        
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;
        
        System.out.println("Thành tiền: " + thanhTien + " VNĐ");
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen + " VNĐ");
        System.out.println("Tổng tiền nhập: " + tongTienNhap + " VNĐ");
    }
    public static void main(String[] args) {
        QuanLySach sach = new QuanLySach();
        sach.nhapThongTin();
        sach.HienThiVaTinhToan();
    }
}