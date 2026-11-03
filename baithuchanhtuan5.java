import java.util.Scanner;
import java.util.ArrayList;

public class baithuchanhtuan5 {
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

    // ==============
    // TUAN 6
    // ============
    public static void bai1Tuan6() {
        int[] soLuong = new int[5];
        int tong = 0;

        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }

        int lonNhat = soLuong[0];

        System.out.println("\nDanh sach so luong sach:");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }

    public static void bai2Tuan6() {
        ArrayList<String> dsMaSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== BAI 2 - QUAN LY MA SACH =====");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("5. Quay lai");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maThem = sc.nextLine();
                    if (dsMaSach.contains(maThem)) {
                        System.out.println("Ma sach da ton tai!");
                    } else {
                        dsMaSach.add(maThem);
                        System.out.println("Them thanh cong!");
                    }
                    break;
                case 2:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("Danh sach dang rong!");
                    } else {
                        for (int i = 0; i < dsMaSach.size(); i++) {
                            System.out.println((i + 1) + ". " + dsMaSach.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    if (dsMaSach.contains(maTim)) {
                        System.out.println("Tim thay ma sach: " + maTim);
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (dsMaSach.remove(maXoa)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;
                case 5:
                    System.out.println("Quay lai menu chinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }

    public static void bai3Tuan6() {
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== BAI 3 - DANH SACH SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Quay lai");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    boolean trung = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|", -1);
                        if (tt[0].equalsIgnoreCase(ma)) {
                            trung = true;
                            break;
                        }
                    }

                    if (trung) {
                        System.out.println("Ma sach da ton tai!");
                        break;
                    }

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    System.out.print("Nhap don gia: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    danhSachSach.add(ma + "|" + ten + "|" + tacGia + "|" + sl + "|" + gia);
                    System.out.println("Them sach thanh cong!");
                    break;
                }
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach dang rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] tt = danhSachSach.get(i).split("\\|", -1);
                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + tt[0]);
                            System.out.println("Ten sach: " + tt[1]);
                            System.out.println("Tac gia: " + tt[2]);
                            System.out.println("So luong: " + tt[3]);
                            System.out.println("Don gia: " + tt[4]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|", -1);
                        if (tt[0].equalsIgnoreCase(maTim)) {
                            System.out.println("Tim thay: " + danhSachSach.get(i));
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|", -1);
                        if (tt[0].equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            daXoa = true;
                            break;
                        }
                    }
                    System.out.println(daXoa ? "Xoa sach thanh cong!" : "Khong tim thay sach!");
                    break;
                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    boolean daSua = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|", -1);
                        if (tt[0].equalsIgnoreCase(maSua)) {
                            System.out.print("Nhap ten sach moi: ");
                            String tenMoi = sc.nextLine();
                            System.out.print("Nhap tac gia moi: ");
                            String tacGiaMoi = sc.nextLine();
                            System.out.print("Nhap so luong moi: ");
                            int slMoi = sc.nextInt();
                            System.out.print("Nhap don gia moi: ");
                            double giaMoi = sc.nextDouble();
                            sc.nextLine();

                            danhSachSach.set(i, tt[0] + "|" + tenMoi + "|" + tacGiaMoi
                                    + "|" + slMoi + "|" + giaMoi);
                            daSua = true;
                            System.out.println("Sua sach thanh cong!");
                            break;
                        }
                    }
                    if (!daSua) {
                        System.out.println("Khong tim thay sach de sua!");
                    }
                    break;
                case 6:
                    System.out.println("Quay lai menu chinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 6);
    }

    static ArrayList<Sach> dsSachTuan6 = new ArrayList<>();

    public static int timViTriSachTuan6(String ma) {
        for (int i = 0; i < dsSachTuan6.size(); i++) {
            if (dsSachTuan6.get(i).maSach.equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    public static void themSachTuan6() {
        Sach sach = new Sach();
        System.out.print("Nhap ma sach: ");
        sach.maSach = sc.nextLine();

        if (timViTriSachTuan6(sach.maSach) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }
        System.out.print("Nhap ten sach: ");
        sach.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        sach.tacGia = sc.nextLine();
        System.out.print("Nhap so luong: ");
        sach.soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        sach.donGia = sc.nextDouble();
        sc.nextLine();

        dsSachTuan6.add(sach);
        System.out.println("Them sach thanh cong!");
    }

    public static void hienThiSachTuan6() {
        if (dsSachTuan6.isEmpty()) {
            System.out.println("Danh sach sach dang rong!");
            return;
        }

        for (int i = 0; i < dsSachTuan6.size(); i++) {
            Sach sach = dsSachTuan6.get(i);
            System.out.println("\nSach thu " + (i + 1));
            System.out.println("Ma sach: " + sach.maSach);
            System.out.println("Ten sach: " + sach.tenSach);
            System.out.println("Tac gia: " + sach.tacGia);
            System.out.println("So luong: " + sach.soLuong);
            System.out.println("Don gia: " + sach.donGia);
        }
    }

    public static void timSachTuan6() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        int viTri = timViTriSachTuan6(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            Sach sach = dsSachTuan6.get(viTri);
            System.out.println("Ma sach: " + sach.maSach);
            System.out.println("Ten sach: " + sach.tenSach);
            System.out.println("Tac gia: " + sach.tacGia);
            System.out.println("So luong: " + sach.soLuong);
            System.out.println("Don gia: " + sach.donGia);
        }
    }

    public static void xoaSachTuan6() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        int viTri = timViTriSachTuan6(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            dsSachTuan6.remove(viTri);
            System.out.println("Xoa sach thanh cong!");
        }
    }

    public static void suaSachTuan6() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        int viTri = timViTriSachTuan6(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }

        Sach sachMoi = new Sach();
        System.out.println("Nhap thong tin moi:");
        System.out.print("Nhap ma sach moi: ");
        sachMoi.maSach = sc.nextLine();

        int viTriMaMoi = timViTriSachTuan6(sachMoi.maSach);
        if (viTriMaMoi != -1 && viTriMaMoi != viTri) {
            System.out.println("Ma sach moi da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach moi: ");
        sachMoi.tenSach = sc.nextLine();
        System.out.print("Nhap tac gia moi: ");
        sachMoi.tacGia = sc.nextLine();
        System.out.print("Nhap so luong moi: ");
        sachMoi.soLuong = sc.nextInt();
        System.out.print("Nhap don gia moi: ");
        sachMoi.donGia = sc.nextDouble();
        sc.nextLine();

        dsSachTuan6.set(viTri, sachMoi);
        System.out.println("Sua sach thanh cong!");
    }

    public static void tinhTongSoLuongTuan6() {
        int tong = 0;
        for (int i = 0; i < dsSachTuan6.size(); i++) {
            tong += dsSachTuan6.get(i).soLuong;
        }
        System.out.println("Tong so luong sach: " + tong);
    }

    public static void tinhTongGiaTriTuan6() {
        double tong = 0;
        for (int i = 0; i < dsSachTuan6.size(); i++) {
            tong += dsSachTuan6.get(i).soLuong * dsSachTuan6.get(i).donGia;
        }
        System.out.println("Tong gia tri sach: " + tong);
    }

    public static void menuBai4Tuan6() {
        int chon;
        do {
            System.out.println("\n===== BAI 4 - MENU QUAN LY SACH TUAN 6 =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themSachTuan6();
                    break;
                case 2:
                    hienThiSachTuan6();
                    break;
                case 3:
                    timSachTuan6();
                    break;
                case 4:
                    xoaSachTuan6();
                    break;
                case 5:
                    suaSachTuan6();
                    break;
                case 6:
                    tinhTongSoLuongTuan6();
                    break;
                case 7:
                    tinhTongGiaTriTuan6();
                    break;
                case 8:
                    System.out.println("Thoat menu bai 4!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n========== CHUONG TRINH QUAN LY SACH ==========");
            System.out.println("1. Thuc hanh tuan 5");
            System.out.println("2. Tuan 6 - Bai 1: Mang so luong sach");
            System.out.println("3. Tuan 6 - Bai 2: ArrayList ma sach");
            System.out.println("4. Tuan 6 - Bai 3: ArrayList danh sach sach");
            System.out.println("5. Tuan 6 - Bai 4: Menu quan ly sach");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    menu();
                    break;
                case 2:
                    bai1Tuan6();
                    break;
                case 3:
                    bai2Tuan6();
                    break;
                case 4:
                    bai3Tuan6();
                    break;
                case 5:
                    menuBai4Tuan6();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 6);
    }
}