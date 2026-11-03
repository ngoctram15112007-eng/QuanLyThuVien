import java.util.Scanner;

public class QuanLySach {

    static Scanner sc = new Scanner(System.in);

    static class Sach {
        String maSach;
        String tenSach;
        String tacGia;
        int soLuong;
        double donGia;
    }

    static Sach[] dsSach;
    static int n = 0;

    public static void nhapSach() {

        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();
        dsSach = new Sach[n];

        for (int i = 0; i < n; i++) {

            dsSach[i] = new Sach();
            System.out.println("\nNhap thong tin sach thu " + (i + 1));
            System.out.print("Nhap ma sach: ");
            dsSach[i].maSach = sc.nextLine();
            System.out.print("Nhap ten sach: ");
            dsSach[i].tenSach = sc.nextLine();
            System.out.print("Nhap tac gia: ");
            dsSach[i].tacGia = sc.nextLine();
            System.out.print("Nhap so luong: ");
            dsSach[i].soLuong = sc.nextInt();
            System.out.print("Nhap don gia: ");
            dsSach[i].donGia = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\nDa nhap xong danh sach sach!");
    }

    public static void tinhTong() {

        if (dsSach == null) {
            System.out.println("Vui long nhap sach truoc!");
            return;
        }
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < n; i++) {
            tongSoLuong += dsSach[i].soLuong;
            tongGiaTri += dsSach[i].soLuong * dsSach[i].donGia;
        }

        System.out.println("\n===== KET QUA =====");
        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }

    public static void timSach() {

        if (dsSach == null) {
            System.out.println("Vui long nhap sach truoc!");
            return;
        }
        String ma;
        boolean timThay = false;
        System.out.print("Nhap ma sach can tim: ");
        ma = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (dsSach[i].maSach.equalsIgnoreCase(ma)) {
                System.out.println("\nTim thay sach!");
                System.out.println("Ma sach: " + dsSach[i].maSach);
                System.out.println("Ten sach: " + dsSach[i].tenSach);
                System.out.println("Tac gia: " + dsSach[i].tacGia);
                System.out.println("So luong: " + dsSach[i].soLuong);
                System.out.println("Don gia: " + dsSach[i].donGia);
                timThay = true;
                break;
            }
        }
        if (timThay == false) {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void menu() {

        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY SACH ==========");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.println("=======================================");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    nhapSach();
                    break;
                case 2:
                    tinhTong();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    System.out.println("Ban da chon thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 4);
    }

    public static void main(String[] args) {
        menu();

    }
}