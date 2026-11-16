package baithuchanh7;
import java.util.Scanner;

public class Sach {

    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tiêu đề sách: ");
        tieuDe = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}
